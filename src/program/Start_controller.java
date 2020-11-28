package program;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Start_controller {

    private String language;
    private String Path;

    public String getlanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void start() {
        try {
            Locale locale_language = Locale.getDefault();
            setLanguage(locale_language.getLanguage());
            if (getlanguage().equals("pt")) {//se o idioma do computador for pt ele entra no if
                ConvertWindow main_frame_pt = new ConvertWindow();
                main_frame_pt.setVisible(true);
            }
            if (getlanguage().equals("en")) {//se o idioma do computador for en ele entra no if
                ConvertWindow_en main_frame_en = new ConvertWindow_en();
                main_frame_en.setVisible(true);
            }
        } catch (IllegalAccessException | InstantiationException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e);
        }
    }
}
