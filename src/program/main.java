package program;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        try {
            ConvertWindow main_frame_pt = new ConvertWindow();
            main_frame_pt.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e);
        }
    }
}
