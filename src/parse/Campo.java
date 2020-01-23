/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parse;

/**
 *
 * @author Jesus David
 */
public class Campo {
    public enum Tipo {
        INTEGER,
        DOUBLE,
        FLOAT,
        STRING,
        LONG,
        BOOLEAN
    }
    
    Tipo tip;
    Object value;
    
}
