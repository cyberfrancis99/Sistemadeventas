/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author pc
 */
public class Gerentedepaneles {
    private static JDesktopPane jDesktopPane;

    public Gerentedepaneles (JDesktopPane jDesktopPane) {
     Gerentedepaneles.jDesktopPane =  jDesktopPane;       
    }
    
    public void abririnternal(JInternalFrame Internal){
    if (Internal.isVisible()){
        Internal.toFront();
        Internal.requestFocus();
    }else{
        jDesktopPane.add(Internal);
        Internal.setVisible(true);
    }    
    }  
}
