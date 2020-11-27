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
public class HectometreConverter extends AbstractConverter {
     public HectometreConverter() {
        super("Hectometre (hm)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 100; //Hectometre para Metros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.01; //Metros para Hectometre
    }
}
