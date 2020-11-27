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
 * @author potedesorvete
 */
public class SquareMeterConverter extends AbstractConverter {
     public SquareMeterConverter() {
        super("Metro quadrado(m^2)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value ; //m^2 para m^2
    }

    @Override
    public double fromBasicUnit(double value) {
        return value; //m^2 para m^2
    }
}
