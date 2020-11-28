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
public class ByteConverter extends AbstractConverter{
    public ByteConverter() {
        super("Byte (B) [storage]:");
    }
    
    @Override
    public double toBasicUnit(double value) {
        return value / 10000000; //Byte para megabyte
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 10000000; //Megabyte para byte
    }
}

