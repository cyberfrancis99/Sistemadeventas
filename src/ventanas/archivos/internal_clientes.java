/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.archivos;

import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class internal_clientes extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    /**
     * Creates new form internal_
     */
    public internal_clientes() {
        initComponents();
        QuitarLaBarraTitulo();   
        createModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_datoscliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Jf_Cedula = new javax.swing.JFormattedTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_dir = new javax.swing.JTextField();
        Jdate = new com.toedter.calendar.JDateChooser();
        Jf_Celular = new javax.swing.JFormattedTextField();
        Jf_Tel = new javax.swing.JFormattedTextField();
        Jf_Balance = new javax.swing.JFormattedTextField();
        txt_email = new javax.swing.JTextField();
        Jcom_provincias = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        panel_botonesprincipales = new javax.swing.JPanel();
        Btn_Eliminar = new javax.swing.JButton();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Registrar1 = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Limpiar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_cliente = new javax.swing.JTable();

        setClosable(true);
        setTitle("CLIENTES ");
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(970, 790));

        panel_datoscliente.setBackground(new java.awt.Color(255, 255, 255));
        panel_datoscliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DEL CLIENTE ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Direccion:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Calular:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Provincia:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Balance:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Fecha:");

        try {
            Jf_Cedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Jf_Cedula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jf_Cedula.setPreferredSize(new java.awt.Dimension(73, 34));

        txt_nombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txt_apellido.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txt_dir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Jdate.setDateFormatString("d-MM-YYYY");
        Jdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        try {
            Jf_Celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Jf_Celular.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jf_Celular.setPreferredSize(new java.awt.Dimension(68, 34));

        try {
            Jf_Tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Jf_Tel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jf_Tel.setPreferredSize(new java.awt.Dimension(68, 34));

        try {
            Jf_Balance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("RD$ ###,###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Jf_Balance.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txt_email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Jcom_provincias.setBackground(new java.awt.Color(204, 204, 204));
        Jcom_provincias.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientesf.png"))); // NOI18N

        btn_exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salirdefinitivo.png"))); // NOI18N
        btn_exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_datosclienteLayout = new javax.swing.GroupLayout(panel_datoscliente);
        panel_datoscliente.setLayout(panel_datosclienteLayout);
        panel_datosclienteLayout.setHorizontalGroup(
            panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosclienteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosclienteLayout.createSequentialGroup()
                        .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(panel_datosclienteLayout.createSequentialGroup()
                                .addComponent(Jf_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(Jcom_provincias, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_datosclienteLayout.createSequentialGroup()
                        .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosclienteLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addGroup(panel_datosclienteLayout.createSequentialGroup()
                                .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_datosclienteLayout.createSequentialGroup()
                                .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_dir, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jf_Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jf_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(Jf_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)))
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_datosclienteLayout.setVerticalGroup(
            panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosclienteLayout.createSequentialGroup()
                .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jf_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jcom_provincias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosclienteLayout.createSequentialGroup()
                        .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(8, 8, 8)
                        .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jf_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jf_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jf_Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap())
            .addGroup(panel_datosclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_botonesprincipales.setBackground(new java.awt.Color(0, 0, 0));

        Btn_Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Eliminar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_cliente.png"))); // NOI18N
        Btn_Eliminar.setText("Eliminar");

        Btn_Modificar.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Modificar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar_1.png"))); // NOI18N
        Btn_Modificar.setText("Actualizar");

        Btn_Registrar1.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Registrar1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Btn_Registrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar_1.png"))); // NOI18N
        Btn_Registrar1.setText("Registrar");
        Btn_Registrar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Btn_Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Buscar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar_cliente (2)_1.png"))); // NOI18N
        Btn_Buscar.setText("Buscar");
        Btn_Buscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Btn_Limpiar1.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Limpiar1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Btn_Limpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Limpiar.png"))); // NOI18N
        Btn_Limpiar1.setText("Limpiar");
        Btn_Limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Limpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonesprincipalesLayout = new javax.swing.GroupLayout(panel_botonesprincipales);
        panel_botonesprincipales.setLayout(panel_botonesprincipalesLayout);
        panel_botonesprincipalesLayout.setHorizontalGroup(
            panel_botonesprincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botonesprincipalesLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Registrar1)
                .addGap(18, 18, 18)
                .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Limpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panel_botonesprincipalesLayout.setVerticalGroup(
            panel_botonesprincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesprincipalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_botonesprincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Limpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabla_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Tabla_cliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Tabla_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_cliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_datoscliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(panel_botonesprincipales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_datoscliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(panel_botonesprincipales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void Btn_Limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Limpiar1ActionPerformed
      Jf_Cedula.setText("");
      txt_nombre.setText("");
      txt_apellido.setText("");
      txt_dir.setText("");
      //Jdate.setDate(jm_fecha);
      txt_email.setText("");
      Jf_Celular.setText("");
      Jf_Tel.setText("");
      Jf_Balance.setText("");      
    }//GEN-LAST:event_Btn_Limpiar1ActionPerformed
    // ESte metodo me hace transparente el boton para que el icono se vea solo
    
    
    public void QuitarLaBarraTitulo(){ 
        JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane(); 
        Dimension DimensionBarra = Barra.getPreferredSize(); 
        Barra.setSize(0,0); 
        Barra.setPreferredSize(new Dimension(0,0)); 
        repaint(); 
    }
    
    private void createModel(){
        modelo = new DefaultTableModel();
        Tabla_cliente.setModel(modelo);
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Provincia");
        modelo.addColumn("Email");
        modelo.addColumn("Ceular");
        modelo.addColumn("Telefono");
        modelo.addColumn("Balance");                
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Limpiar1;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_Registrar1;
    private javax.swing.JComboBox<String> Jcom_provincias;
    private com.toedter.calendar.JDateChooser Jdate;
    private javax.swing.JFormattedTextField Jf_Balance;
    private javax.swing.JFormattedTextField Jf_Cedula;
    private javax.swing.JFormattedTextField Jf_Celular;
    private javax.swing.JFormattedTextField Jf_Tel;
    private javax.swing.JTable Tabla_cliente;
    private javax.swing.JButton btn_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_botonesprincipales;
    private javax.swing.JPanel panel_datoscliente;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
