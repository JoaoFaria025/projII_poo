/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters.Volume;

import converters.AbstractConverter;

/**
 *
 * @author jvcco
 */
public class LitreConverter extends AbstractConverter {
     public LitreConverter() {
        super("Litre (hm)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value; //Hectometre para Metros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value; //Metros para Hectometre
    }
}
