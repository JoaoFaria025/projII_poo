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
public class KiloGramaConverter extends AbstractConverter {
     public KiloGramaConverter() {
        super("KiloGrama (kg)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value; //KG para KG
    }

    @Override
    public double fromBasicUnit(double value) {
        return value; //KG para KG
    }
}
