/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters.comprimento;

import converters.AbstractConverter;

/**
 *
 * @author jvcco
 */
public class DecimetreConverter extends AbstractConverter {
     public DecimetreConverter() {
        super("Decimetre (dm)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 0.1; //Decimetre para Metros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 10; //Metros para CM
    }
}
