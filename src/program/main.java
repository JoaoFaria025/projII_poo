/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author jvcco
 */
public class main {
        public static void main(String[] args) {
        String idioma;
        String pt = "pt";
        String en = "en";
        Locale loc = Locale.getDefault();
        idioma = loc.getLanguage();
        
        
  try{
      // if(idioma == pt){//se o idioma do computador for pt ele entra no if
          ConvertWindow frame = new ConvertWindow();
           frame.setVisible(true);
      // }
      // if(idioma == en){//se o idioma do computador for en ele entra no if
       //    ConvertWindow_en main_frame_en = new ConvertWindow_en();
       //    main_frame_en.setVisible(true);
       //}
       
  }
  catch (Exception e) {
	JOptionPane.showMessageDialog(null,"Error:" + e);
        
    }
       
    }
    
    
}