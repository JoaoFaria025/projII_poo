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
public class DecametreConverter extends AbstractConverter{
       public DecametreConverter() {
         super("Decametre (dam) [distance]:");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 10; //Decametre para Metros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value/10; //Metros para Decametre
    }
}
