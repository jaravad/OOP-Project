
package parse;

import java.util.ArrayList;


public class Registro {
    
    ArrayList<Campo.Tipo> header = new ArrayList<Campo.Tipo>();
    ArrayList<Campo> elements = new ArrayList<Campo>();
    
    public static Registro crearRegistro(Object... objs) {
        ArrayList<Campo.Tipo> header = new ArrayList<Campo.Tipo>();
        ArrayList<Campo> elements = new ArrayList<Campo>();
        for (Object i : objs) {
            Campo c = new Campo();
            c.value = i;
            if (String.valueOf(c.value.getClass()).equals("class java.lang.Double")) {
                c.tip = Campo.Tipo.DOUBLE;
                header.add(c.tip);
            } else if (String.valueOf(c.value.getClass()).equals("class java.lang.Integer")) {
                c.tip = Campo.Tipo.INTEGER;
                header.add(c.tip);
            } else if (String.valueOf(c.value.getClass()).equals("class java.lang.Float")) {
                c.tip = Campo.Tipo.FLOAT;
                header.add(c.tip);
            } else if (String.valueOf(c.value.getClass()).equals("class java.lang.Boolean")) {
                c.tip = Campo.Tipo.BOOLEAN;
                header.add(c.tip);
            } else if (String.valueOf(c.value.getClass()).equals("class java.lang.String")) {
                c.tip = Campo.Tipo.STRING;
                header.add(c.tip);
            } else if (String.valueOf(c.value.getClass()).equals("class java.lang.Long")) {
                c.tip = Campo.Tipo.LONG;
                header.add(c.tip);
            }
            elements.add(c);
        }
        Registro reg=new Registro();
        reg.elements=elements;
        reg.header=header;
        
        return reg;

    }
}
