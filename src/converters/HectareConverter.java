/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;


/**
 *
 * @author potedesorvete
 */
public class HectareConverter extends AbstractConverter {
     public HectareConverter() {
        super("hectare (ha)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 10000; //Hectar para metro quadrado
    }

    @Override
    public double fromBasicUnit(double value) {
        return value/10000; //Metro quadrado para Hectar
    }
}
