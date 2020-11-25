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
public class MiliLitreConverter extends AbstractConverter {
     public MiliLitreConverter() {
        super("MiliLitre (ml)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value/1000; //MiliLitre para Litros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 1000; //Litros para MiliLitre
    }
}
