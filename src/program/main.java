package program;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        try {
            Start_controller start_controller  = new Start_controller();
            start_controller .start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e);

        }

    }

}
