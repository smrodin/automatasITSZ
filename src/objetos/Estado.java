
package objetos;

/**********************************************************************************************************************
La clase Estado representa las características y funciones de un estado
*********************************************************************************************************************/

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Estado{
    public boolean estado_final;
    public Integer id;
    public ArrayList<Integer> estados_siguientes;
        
    Estado(){
        estados_siguientes=new ArrayList<Integer>(0);
    }
    Estado(boolean ef, Integer i){
        estado_final = ef;
        id = i;
        estados_siguientes=new ArrayList<Integer>(0);
    }
    void add(Integer i){
        estados_siguientes.add(i);
    }
    void setId(Integer i){
        id = i;
    }
    
    void print_info(){
        if(estado_final == false)
            System.out.println("estado_final? " + "false.");
        else
            System.out.println("estado_final? " + "true.");
        System.out.println("id: " + id);
        int limit = estados_siguientes.size();
        if(limit==0)
            System.out.println("La lista de estados esta vacia.");
        else
            System.out.println("Lista de estados:");
        for(int i=0;i<limit;i++)
        {
            System.out.println("    id: " + estados_siguientes.get(i));
        }
    }
    
    int evaluate_state(String alfabeto, String character){
    
        StringTokenizer st_alfabeto = new StringTokenizer(alfabeto, ",");//Separamos el alfabeto:    
        for(int i=0; st_alfabeto.hasMoreTokens(); i++)
        {
            String string1 = st_alfabeto.nextToken();
            //System.out.println("s1: \"" + string1 + "\", s2: \"" + character + "\"");
            if(string1.equals(character))
            {
                int ret = estados_siguientes.get(i).intValue();
                return ret;
            }
        }
        return -1;
    }
    
}
