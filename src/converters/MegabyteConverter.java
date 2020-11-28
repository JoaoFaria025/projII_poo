/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

/**
 *
 * @author vitor
 */
public class MegabyteConverter extends AbstractConverter{
    public MegabyteConverter() {
        super("Megabyte (MB) [storage]:");
    }
    
    @Override
    public double toBasicUnit(double value) {
        return value; //Megabyte para megabyte
    }

    @Override
    public double fromBasicUnit(double value) {
        return value; //Megabyte para megabyte
    }
}
