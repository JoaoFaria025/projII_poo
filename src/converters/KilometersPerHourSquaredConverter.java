/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import converters.AbstractConverter;
import converters.AbstractConverter;

/**
 *
 * @author jvcco
 */
public class KilometersPerHourSquaredConverter extends AbstractConverter {
     public KilometersPerHourSquaredConverter() {
        super("Kilometer/h\u00b2 (km/h\u00b2) [acceleration]:");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 0.0000771604938; //km/h\u00b2 para m/s
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 12960; //m/s para km/h\u00b2
    }
}
