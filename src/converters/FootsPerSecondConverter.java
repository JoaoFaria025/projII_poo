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
public class FootsPerSecondConverter extends AbstractConverter {
    public FootsPerSecondConverter() {
        super("Foots/s (fps)");
    }

     
     @Override
     public double toBasicUnit(double value) {
         return value * 3.281; //Pés/s para metros/s
     }
 
     @Override
     public double fromBasicUnit(double value) {
         return value /3.281; // Metros/s para Pés/s
     }
 }

