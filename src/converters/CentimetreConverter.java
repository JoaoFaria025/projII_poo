/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;


/**
 *
 * @author jvcco
 */
public class CentimetreConverter extends AbstractConverter {
       public CentimetreConverter() {
        super("Centimetre (cm) [distance]:");
    }
    
    
    @Override
    public double toBasicUnit(double value) {
        return value * 0.01; //CM para Metros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 100; //Metros para CM
    }
}
