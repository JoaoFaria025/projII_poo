/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters.comprimento;

import converters.AbstractConverter;

/**
 *
 * @author jvcco
 */
public class MetreConverter extends AbstractConverter {
  
    public MetreConverter() {
        super("metre (m)");
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