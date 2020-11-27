
package converters;


/**
 *
 * @author jvcco
 */
public class KilometerConverter extends AbstractConverter {
  
    public KilometerConverter() {
        super("Kilometer (km) [distance]:");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 1000; //Km para Metros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.001; //Metros para KM
    }
}
