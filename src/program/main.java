package program;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        try {
            ConvertWindow frame = new ConvertWindow();
            frame.setVisible(true);
        } catch (IllegalAccessException | InstantiationException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e);
        }
    }
}
