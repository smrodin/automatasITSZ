/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author smonkey
 */
/************************************************************************************
  EQUIPO GUADALAJARA
  Este programa es un automata finito no determinista (AFD). El automata es definido en el archivo input.txt, el cual
debe estar en el mismo directorio. Una vez abierto el archivo, el usuario puede meter la palabra (secuencia de simbolos del alfabeto
definido en input.txt) y el programa recorrera el AFD hasta determinar si la palabra es válida o no.

  LIMITACIONES:
  * Solo acepta 10 estados (0-9)
  * El programa falla si no encuentra el archivo
  * Aunque encuentre el archivo, si no está formateado exactamente, el resultado es impredecible
  * No valida que el alfabeto sea unicamente alfanumérico
  * No valida que la entrada del usuario (palabra a probar), esté constituida unicamente por elementos del alfabeto ya leído de input.txt

************************************************************************************/
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Automatas1 {
    public ArrayList<Estado> lista_de_estados = new ArrayList<Estado>();
    String alfabeto;

    public  Automatas1(ArrayList<String> alEntrada) {
        //Automatas1 a = new Automatas1 ();
        //a.input_data();         //En este paso procesamos el archivo que contiene las especificaciones del autómata
    
        //alEntrada.clear();
        //alEntrada.add("a,b,c");
        //alEntrada.add("0-0&1&2");
        //alEntrada.add("*1-2&1&0");
        //alEntrada.add("*2-0&0&0");
        
        try
        {
            //FileReader fileReader = new FileReader("input.txt");
            //BufferedReader bufferedReader = new BufferedReader(fileReader);
                
            alfabeto = alEntrada.get(0);   //La primera linea que se lee es el alfabeto
            System.out.println("alfabeto = \"" + alfabeto + "\"");
                        
            //Se comienza a capturar la tabla de estados (las lineas que siguen del alfabeto en input.txt)
            String input;
            for(int cntr=1; cntr <= alEntrada.size() -1 ; cntr++ )
            {
                input = alEntrada.get(cntr);
                System.out.println("linea #" + cntr + ": \"" + input + "\"");  //imprimimos cada linea leída
                //recorremos la linea (corresponde a un estado)
                Estado tmp = new Estado(false, 0);      //Cada linea corresponde a un estado, asi que en cada ciclo se crea un objeto de clase "Estado"
                for(int i=0; i<input.length();i++)
                {                                       //La linea se recorre, y se analiza su contenido
                    String character = Character.toString(input.charAt(i));
                    if(character.equals("*"))
                        tmp.estado_final=true;
                    else if (!character.equals("&") && !character.equals("-"))
                    {   
                        Integer n = Integer.valueOf(character);
                        if(i<2)
                            tmp.setId(n);
                        else
                            tmp.add(n);
                    }
                }
                lista_de_estados.add(tmp);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        //a.process_string();     //En este paso se toma la entrada del usuario, y esta entrada es procesada por el automata. El automata informa si la palabra es aceptada o no.
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
                Estado tmp = new Estado(false, 0);      //Cada linea corresponde a un estado, asi que en cada ciclo se crea un objeto de clase "Estado"
                for(int i=0; i<input.length();i++)
                {                                       //La linea se recorre, y se analiza su contenido
                    String character = Character.toString(input.charAt(i));
                    if(character.equals("*"))
                        tmp.estado_final=true;
                    else if (!character.equals("&") && !character.equals("-"))
                    {   
                        Integer n = Integer.valueOf(character);
                        if(i<2)
                            tmp.setId(n);
                        else
                            tmp.add(n);
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
        
        for(i=0, estado_actual=0;i<limite;i++)
        {
            //evaluate_state determina que estado corresponde al simbolo del alfabeto
            //y ese nuevo estado se convierte en el estado actual
            String character = Character.toString(palabra.charAt(i));
            estado_actual = lista_de_estados.get(estado_actual).evaluate_state(alfabeto, character);  
        }
        if ( estado_actual >= lista_de_estados.size())
            estado_actual = estado_actual -1;
            
        boolean aceptada = lista_de_estados.get(estado_actual).estado_final;  //una vez que se termina de procesar la cadena, se checa si el último estado es final
        if(aceptada == true)
        {
            cadena = "Palabra aceptada! (estado final: " + estado_actual;
        }
        else
            cadena = "Palabra rechazada! (estado final: " + estado_actual;
            
        //return lista_de_estados.get(estado_actual).estado_final;
        return cadena;
    }
}







