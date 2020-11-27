/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters.classes;

import converters.AbstractConverter;
import converters.AbstractConverter;

/**
 *
 * @author jvcco
 */
public class HourConverter extends AbstractConverter{
    
    
     public HourConverter() {
        super("hour (h)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 3600; //Hora para Segundo
    }

    @Override
    public double fromBasicUnit(double value) {
        return value/3600; //Segundo para Hora
    }
    
}
