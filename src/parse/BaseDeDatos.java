package parse;

import java.util.ArrayList;

public class BaseDeDatos {

    public static ArrayList<ArrayList<Campo.Tipo>> headers = new ArrayList<ArrayList<Campo.Tipo>>();
    ArrayList<Tabla> tablas = new ArrayList<Tabla>();

    public void addRegistro(Registro reg) {
        if (headers.isEmpty()) {
            headers.add(reg.header);
            Tabla t = new Tabla();
            t.estructura = reg.header;
            t.elementos.add(reg.elements);
            tablas.add(t);
        } else {
            boolean sw = false;
            for (ArrayList<Campo.Tipo> e : headers) {
                if (e.equals(reg.header)) {
                    sw = true;
                    for (Tabla t : tablas) {
                        if (t.estructura.equals(reg.header)) {
                            t.elementos.add(reg.elements);
                        }
                    }
                }
            }
            if (sw == false) {
                headers.add(reg.header);
                Tabla t = new Tabla();
                t.estructura = reg.header;
                t.elementos.add(reg.elements);
                tablas.add(t);
            }

        }
    }


    public void printAll() {
        System.out.println("/*");
        System.out.println("Número de tablas: " + tablas.size());
        
        int cont = 0;
        for (Tabla i : tablas) {
            for (int j = 0; j < i.estructura.size(); j++) {
                System.out.print("*********");
            }
            System.out.println("");
            System.out.println("Tabla " + cont);
            System.out.println(i.estructura);
            System.out.println("Registros: ");
            for (ArrayList<Campo> j : i.elementos) {
                for (Campo k : j) {
                    System.out.print(k.value + ", ");
                }
                System.out.println("");
            }
            cont += 1;
            System.out.println("");
            if (cont == tablas.size()) {
                System.out.println("*/");
            }
        }
    }

}
