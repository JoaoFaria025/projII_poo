/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import converters.AbstractConverter;
import converters.AbstractConverter;
/**
 *
 * @author potedesorvete
 */
public class MilesPerHourConverter extends AbstractConverter {
    public MilesPerHourConverter () {
        super("miles/h (mph)");
    }

     
     @Override
     public double toBasicUnit(double value) {
         return value * 2.237; //Milhas/h para Metros/s
     }
 
     @Override
     public double fromBasicUnit(double value) {
         return value /2.237; //Metros/s para Milhas/h
     }
 }

