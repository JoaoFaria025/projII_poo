/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters.Volume;

import converters.AbstractConverter;

/**
 *
 * @author potedesorvete
 */
public class CubicMeterConverter extends AbstractConverter {
     public CubicMeterConverter() {
        super("Cubic Meter (m^3)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 1000; //Metros cubicos para litro
    }

    @Override
    public double fromBasicUnit(double value) {
        return value/1000; //Litros para Metros Cubicos
    }
}
