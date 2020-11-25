/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters.Mass;

import converters.AbstractConverter;

/**
 *
 * @author jvcco
 */
public class GramConverter extends AbstractConverter {
     public GramConverter() {
        super("Grama (g)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 0.001; //Grama para KG
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 1000; //KG para Grama
    }
}
