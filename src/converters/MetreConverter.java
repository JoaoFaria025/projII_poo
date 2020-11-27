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
public class MetreConverter extends AbstractConverter {
  
    public MetreConverter() {
        super("Metre (m) [distance]:");
    }

    @Override
    public double toBasicUnit(double value) {
        return value; //Metros para Metros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value; //Metros para Metros
    }
}
