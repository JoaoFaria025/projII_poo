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
public class KilobyteConverter extends AbstractConverter{
    public KilobyteConverter() {
        super("Kilobyte (kB) [storage]:");
    }
    
    @Override
    public double toBasicUnit(double value) {
        return value / 1000; //Kilobyte para megabyte
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 1000; //Megabyte para kilobyte
    }
}
