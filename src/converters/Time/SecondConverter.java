/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters.Time;

import converters.AbstractConverter;

/**
 *
 * @author jvcco
 */
public class SecondConverter extends AbstractConverter {
       public SecondConverter() {
        super("Second (s)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value;
    }
}
