package examenarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juan Jose Millan Corzo
 */
public class ExamenArraylist {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<Float> tiempo = new ArrayList<Float>();
        ArrayList<Float> velocidad = new ArrayList<Float>();
        int opcion = 1, mejortiem=0;
        float guard=0;
        
        while (opcion != 0) {           
            System.out.print("Digite el nombre del estudiante: ");
            nombre.add(leer.next());
            System.out.print("Digite la velocidad del estudiante(0 para salir):");
            opcion = leer.nextInt();
            if(opcion != 0){
                velocidad.add((float) opcion);
                tiempo.add(100 / velocidad.get(velocidad.size()-1));
                guard = guard + tiempo.get(tiempo.size()-1);
            }
        }
        
       guard = guard / tiempo.size();
        
        int i=0, cont=0;
        for(; i<velocidad.size(); i++){
            
            if(velocidad.get(i)>velocidad.get(mejortiem)){
                mejortiem = i;
            }
            if(tiempo.get(i)>guard){
                cont++;
            }
            
            System.out.println(nombre.get(i) + " " + velocidad.get(i) + " " + tiempo.get(i));
        } 

    }
    
}
