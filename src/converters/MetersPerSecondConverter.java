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
public class MetersPerSecondConverter extends AbstractConverter {
    public MetersPerSecondConverter () {
        super("Meters/s (m/s) [speed]: ");
    }

     
     @Override
     public double toBasicUnit(double value) {
         return value; //Metros/s para Metros/s
     }
 
     @Override
     public double fromBasicUnit(double value) {
         return value; //Metros/h para Metros/s
     }
 }

