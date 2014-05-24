/**********************************************************************************************************************
La clase Estado representa las características y funciones de un estado
*********************************************************************************************************************/

package objetos;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Estado_AFND{
    public boolean estado_final;
    public String id;
    public ArrayList<ArrayList<String>> estados_siguientes;
        
    Estado_AFND(){
        estados_siguientes=new ArrayList<ArrayList<String>>();
    }
    
    Estado_AFND(boolean ef, int i){
        estado_final = ef;
        id = Integer.toString(i);
        estados_siguientes=new ArrayList<ArrayList<String>>();
    }
    
    void add(ArrayList<String> i){
        estados_siguientes.add(i);
    }
    
    void addList(String s){        
        StringTokenizer st = new StringTokenizer(s, ",");
        ArrayList<String> lst = new ArrayList<String>();
        for(int j=0;st.hasMoreTokens(); j++)
        {
            String string1 = st.nextToken();
            lst.add(string1);
        }
        estados_siguientes.add(lst);
    }
    
    void setId(String i){
        id = i;
    }
    
    void print_info(){
        if(estado_final == false)
            System.out.println("estado_final? " + "false.");
        else
            System.out.println("estado_final? " + "true.");
        System.out.println("id: " + id);
        int limit_i = estados_siguientes.size();
        if(limit_i==0)
            System.out.println("La lista de estados esta vacia.");
        else
            System.out.println("Lista de estados: ");
        for(int i=0;i<limit_i;i++)
        {
            int limit_j = estados_siguientes.get(i).size();
            for(int j=0;j<limit_j;j++)
            {
                if(limit_i==0)
                    System.out.println("    La lista de estados esta vacia.");
                else
                    System.out.println("    Lista de estados: ");
                System.out.println("    id: " + estados_siguientes.get(i));
            }
        }
    }
    
    ArrayList<String> evaluate_state(String alfabeto, String character){
        ArrayList<String> ret = new ArrayList<String>();
        StringTokenizer st_alfabeto = new StringTokenizer(alfabeto, ",");//Separamos el alfabeto:    
        for(int i=0; st_alfabeto.hasMoreTokens(); i++)
        {
            String string1 = st_alfabeto.nextToken();
            //System.out.println("s1: \"" + string1 + "\", s2: \"" + character + "\"");
            if(string1.equals(character))
            {
                //System.out.println("evaluate_state(\"" + alfabeto + "\", \"" + character + "\") regresa: " + estados_siguientes.get(i));
                return estados_siguientes.get(i);
            }
        }
        return ret;
    }
}
