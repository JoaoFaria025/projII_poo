/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import converters.AbstractConverter;

/**
 *
 * @author jvcco
 */
public class KiloLitreConverter extends AbstractConverter {
     public KiloLitreConverter() {
        super("KiloLitre (kl)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 1000; //KiloLitre para Litros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value/1000; //Litros para KiloLitre
    }
}
