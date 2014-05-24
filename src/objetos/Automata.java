/************************************************************************************
  EQUIPO GUADALAJARA
  Este programa es un automata finito no determinista (AFN, o ANF). El automata es definido en el archivo input.txt, el cual
debe estar en el mismo directorio. Una vez abierto el archivo, el usuario puede meter la palabra (secuencia de simbolos del alfabeto
definido en input.txt) y el programa recorrera el AFD hasta determinar si la palabra es válida o no.

  LIMITACIONES:
  * Solo acepta 10 estados (0-9)
  * El programa falla si no encuentra el archivo
  * Aunque encuentre el archivo, si no está formateado exactamente, el resultado es impredecible
  * No valida que el alfabeto sea unicamente alfanumérico
  * No valida que la entrada del usuario (palabra a probar), esté constituida unicamente por elementos del alfabeto ya leído de input.txt

************************************************************************************/
package objetos;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import objetos.Estado;

public class Automata {
    public ArrayList<Estado_AFND> lista_de_estados = new ArrayList<Estado_AFND>();
    String alfabeto;
    
    //public static void main(String[] args) {
        //Automata a = new Automata();
        //a.input_data();         //En este paso procesamos el archivo que contiene las especificaciones del autómata
        //a.process_string();     //En este paso se toma la entrada del usuario, y esta entrada es procesada por el automata. El automata informa si la palabra es aceptada o no.
    //}
    
public Automata(ArrayList<String> alEntrada){
         //Automatas1 a = new Automatas1 ();
        //a.input_data();         //En este paso procesamos el archivo que contiene las especificaciones del autómata
    
        alEntrada.clear();
        alEntrada.add("a,b,c");
        alEntrada.add("0-0&1&2");
        alEntrada.add("*1-2&1&0");
        alEntrada.add("*2-0&0&0");
        
        try
        {
            //FileReader fileReader = new FileReader("input.txt");
            //BufferedReader bufferedReader = new BufferedReader(fileReader);
                
            //alfabeto = bufferedReader.readLine();   //La primera linea que se lee es el alfabeto
            alfabeto = alEntrada.get(0);   //La primera linea que se lee es el alfabeto
            System.out.println("alfabeto = \"" + alfabeto + "\"");
                        
            //Se comienza a capturar la tabla de estados (las lineas que siguen del alfabeto en input.txt)
            String input="";
            for(int cntr=1; cntr <= alEntrada.size() -1 ; cntr++ )
            {
                input = alEntrada.get(cntr);
                System.out.println("linea #" + cntr + ": \"" + input + "\"");  //imprimimos cada linea leída
                //recorremos la linea (corresponde a un estado)
                Estado_AFND tmp = new Estado_AFND(false, cntr);      //Cada linea corresponde a un estado, asi que en cada ciclo se crea un objeto de clase "Estado"
                int limite = input.length();
                boolean flag_exit=false;
                for(int i=0; i<limite && flag_exit==false;i++)
                {                                       //La linea se recorre, y se analiza su contenido
                    String character = Character.toString(input.charAt(i));
                    if(character.equals("*"))
                        tmp.estado_final=true;
                    else if (character.equals("-"))
                    {   //Se encontró el inicio de la descripcion de estados, ya no serán necesarios mas ciclos
                        flag_exit=true;
                        //Ahora se toma el resto de la cadena
                        String subInput = input.substring(i+1);
                        //Y se divide en los campos separados por "&"
                        StringTokenizer st = new StringTokenizer(subInput, "&");
                        for(int j=0;st.hasMoreTokens(); j++)
                        {
                            String string1 = st.nextToken();
                            tmp.addList(string1);
                        }
                    }
                }
                lista_de_estados.add(tmp);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public void input_data()
    {
        try
        {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
                
            alfabeto = bufferedReader.readLine();   //La primera linea que se lee es el alfabeto
            System.out.println("alfabeto = \"" + alfabeto + "\"");
                        
            //Se comienza a capturar la tabla de estados (las lineas que siguen del alfabeto en input.txt)
            String input;
            for(int cntr=0; (input = bufferedReader.readLine())!=null; cntr++ )
            {
                System.out.println("linea #" + cntr + ": \"" + input + "\"");  //imprimimos cada linea leída
                //recorremos la linea (corresponde a un estado)
                Estado_AFND tmp = new Estado_AFND(false, cntr);      //Cada linea corresponde a un estado, asi que en cada ciclo se crea un objeto de clase "Estado"
                int limite = input.length();
                boolean flag_exit=false;
                for(int i=0; i<limite && flag_exit==false;i++)
                {                                       //La linea se recorre, y se analiza su contenido
                    String character = Character.toString(input.charAt(i));
                    if(character.equals("*"))
                        tmp.estado_final=true;
                    else if (character.equals("-"))
                    {   //Se encontró el inicio de la descripcion de estados, ya no serán necesarios mas ciclos
                        flag_exit=true;
                        //Ahora se toma el resto de la cadena
                        String subInput = input.substring(i+1);
                        //Y se divide en los campos separados por "&"
                        StringTokenizer st = new StringTokenizer(subInput, "&");
                        for(int j=0;st.hasMoreTokens(); j++)
                        {
                            String string1 = st.nextToken();
                            tmp.addList(string1);
                        }
                    }
                }
                lista_de_estados.add(tmp);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public String process_string(String palabra)
    {
        //Scanner scanner = new Scanner( System.in );
        //System.out.print("\nEscribe la palabra a probar: ");
        //String palabra = scanner.nextLine();
        
        String cadena = "";
        int limite = palabra.length();
        int i, estado_actual;
        int aceptada;
        aceptada = seguir(palabra, new String("0"), 0);
        if(aceptada != 0)
        {
            cadena = "Palabra aceptada!";
        }
        else
            cadena = "Palabra rechazada!";
            
        return cadena;
    }
    
    public int seguir(String s, String estado, int depth){
        System.out.println("  Siguiendo cadena: \"" + s + "\", estado: " + estado + ", profundidad: " + depth);
        if (estado.equals("n"))
        {
            //System.out.println("Estado NULO");
            return 0;
        }
        //Es una cadena vacia?
        if (s.length()==0)
        {
            //System.out.println("Marca 1");
            int i, limite;
            for(i=0, limite = lista_de_estados.size();i<limite;i++)
            {
                //System.out.println("Marca 2: "+ lista_de_estados.get(i).id);
                if(estado.equals(lista_de_estados.get(i).id))
                {
                    //System.out.println("Marca 3");
                    //Es el estado actual, uno final?
                    if(lista_de_estados.get(i).estado_final==true)
                    {
                        //Si:   regresamos 1 e imprimimos el id del estado actual
                        System.out.println("Ultimo estado: " + estado);
                        return 1;
                    }
                    else//No:   regresamos 0
                        return 0;
                }
            }
            return 0;
        }
        //No: Se averigua el estado a seguir...
        String character = Character.toString(s.charAt(0));
        //evaluate_state determina que estado corresponde al simbolo del alfabeto
        //y ese nuevo estado se convierte en el estado actual
        ArrayList<String> estados_a_seguir = lista_de_estados.get(Integer.parseInt(estado)).evaluate_state(alfabeto, character);
        //System.out.println("estados_a_seguir : " + estados_a_seguir);
        int j, limite;
        for(j=0, limite = estados_a_seguir.size();j<limite;j++)
        {
            //Se averigua a qué estados lleva este caracter
            //Se itera, enviando la cadena actual y llamando recursivamente esta misma funcion
            if(seguir(s.substring(1), estados_a_seguir.get(j), depth+1)==1)
                return 1;
        }
        return 0;
    }
    
}







