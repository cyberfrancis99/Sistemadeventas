/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class DaoFoto {
  

    private Connection conexion=null;
    private String nominagen;
    private byte[] fotografia;
    private byte [] ObtenerFoto;
    private JLabel _imagen;
    private FileInputStream archivofoto=null;

    public String getNominagen() {
        return nominagen;
    }
    public void setNominagen(String nominagen) {
        this.nominagen = nominagen;
    }
     public DaoFoto(String host,String db,String user,String pass) throws SQLException
    {
        String url = "jdbc:postgresql://"+host+"/"+db;        
        try {     
             conexion = DriverManager.getConnection(url,user,pass);             
        } catch (SQLException exc){
            throw exc;
        }        
    }
     
     public void GuardarFoto (byte[] fotogra) throws SQLException
     {        
        PreparedStatement pts = conexion.prepareStatement("INSERT INTO menu.foto(imagen) VALUES (?)");
        pts.setBytes(1,fotogra );            
        int i = pts.executeUpdate();
        if(i>0)
        {  
            JOptionPane.showMessageDialog(null, "DATOS GUARDADO");
        }
     }
     
      public byte[]  ExeSelFoto( ) throws SQLException
     {
        ResultSet rs;
        PreparedStatement pts = conexion.prepareStatement("SELECT imagen FROM menu.foto ;");
         rs= pts.executeQuery();
        while(rs.next())
        {
            ObtenerFoto=rs.getBytes("imagen");            
        }
        return ObtenerFoto;
     }
    
    public void ByteToImage(JLabel label, byte[] bytes) throws IOException {
        
	BufferedImage bi = new BufferedImage(300, 255, BufferedImage.TYPE_INT_RGB);
	Graphics2D g = bi.createGraphics();
	ImageIcon icon = new ImageIcon(bytes);
	
	Image img;
	img = icon.getImage();
	g.drawImage(img, 0, 0, label.getWidth(), label.getHeight(), null);
	g.dispose();
	label.setIcon(new ImageIcon(bi));
        
}
    public byte[] ExtractImageBytes(String ImageName, String Path) throws IOException {
	
        String dirName = ImageName;
	File f=new File( Path, dirName);
	BufferedImage img = ImageIO.read(f);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	ImageIO.write(img, "JPG", baos);
        fotografia=baos.toByteArray();
	baos.flush();
        
	return baos.toByteArray();
}

    public byte[] getFotografia() {
        return fotografia;
    }   
}

