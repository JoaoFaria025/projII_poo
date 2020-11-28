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
public class KilometersPerHourConverter extends AbstractConverter {
    public KilometersPerHourConverter() {
        super("Kilometer/h (km/h) [speed]:");
    }

     
     @Override
     public double toBasicUnit(double value) {
         return value * 3.6; //Km/h para Metros/s
     }
 
     @Override
     public double fromBasicUnit(double value) {
         return value / 3.6; // Metros/s para Km/h
     }
 }

