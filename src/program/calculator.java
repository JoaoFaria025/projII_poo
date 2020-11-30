package program;

import converters.AbstractConverter;
import javax.swing.JOptionPane;

public class calculator {

    private final String selectedOut, selectedFrom, ConvertFrom;

    public calculator(String selectedOut, String selectedFrom, String ConvertFrom) {
        this.selectedOut = selectedOut;
        this.selectedFrom = selectedFrom;
        this.ConvertFrom = ConvertFrom;
    }

    public double Calculator_values() {
        try {
            //Calculator From.
            int index_begin_from = this.selectedFrom.indexOf(":");
            int index_end_from = this.selectedFrom.indexOf(".");
            String unit_from = this.selectedFrom.substring(index_begin_from + 1, index_end_from);
            //Calculator Out(to).
            int index_begin_out = this.selectedOut.indexOf(":");
            int index_end_out = this.selectedOut.indexOf(".");
            String unit_out = this.selectedOut.substring(index_begin_out + 1, index_end_out);

            AbstractConverter selectedConvertFrom = (AbstractConverter) Class.forName("converters." + unit_from).newInstance();
            AbstractConverter selectedConvertTo = (AbstractConverter) Class.forName("converters." + unit_out).newInstance();

            double valueConvertFrom = Double.parseDouble(this.ConvertFrom);
            double value = selectedConvertTo.fromBasicUnit(selectedConvertFrom.toBasicUnit(valueConvertFrom));
            
            return value;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e);
        }
        return 0;

    }

}
