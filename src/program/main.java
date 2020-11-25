/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import javax.swing.JOptionPane;

/**
 *
 * @author jvcco
 */
public class main {
        public static void main(String[] args) {
            
  try{
        ConvertWindow main_frame = new ConvertWindow();
        main_frame.setVisible(true);
  }
  catch (Exception e) {
	JOptionPane.showMessageDialog(null,"Error:" + e);
        
    }
       
    }
    
    
}
