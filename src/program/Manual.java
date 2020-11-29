package program;

import java.util.Locale;

public class Manual extends javax.swing.JFrame {
    private String en = "en";
      
    private void HelpENGLISH(){//traduzindo os valores
       jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/manual_2.0_en.png")));   
    }

    public Manual() {
        Locale loc = Locale.getDefault();//pegar idioma do sistema
        
        initComponents();
         if(loc.getLanguage() == en){
                HelpENGLISH();
            }
         setLocationRelativeTo(null); //set jFrame to appear centered
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ICONVERT - Manual");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 147, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/manual_2.0.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 760, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
