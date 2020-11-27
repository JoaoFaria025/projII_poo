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
public class MilimetreConverter extends AbstractConverter {
  
    public MilimetreConverter() {
        super("Milimetro (mm)");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 0.001; //Milimetro para Metros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 1000; //Metros para Milimetros
    }
}
