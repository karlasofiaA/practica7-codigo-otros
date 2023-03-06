package com.generation;

import java.util.HashMap; //Import 
import java.util.Scanner;//Importar escaner
/**
 * El código primero crea una lista de tipo clave:valor de los países y capitales. 
 * Instanciamos la lista tipo hash y mediante el método put agregamos lo valores clave,valor con los 
 * países. 
 * 
 * Después hacemos un ciclo do-while, dentro otro ciclo anidado que mientras preguntemos por 
 * la capital de un país y nuestro Hash tenga esa llave nos va a regresar el valor.
 * Si no encuentra la llave va a pedir el nuevo valor de esa llave y lo va a colocar en el Hash 
 * mediante un método get. 
 * 
 * Si la entrada mediante el scanner es un "salir" se detiene el programa. 
 * @author karla
 *
 */
public class Codigo7 {

	public static void main(String[] args) {

		    Scanner s = new Scanner(System.in); //System.in faltante

		    //Los argumentos son tipo String
		    HashMap<String, String> capitales = new HashMap<>(); //Nombre de la variable "capitales"

		    capitales.put("Canadá", "Otawwa");
		    capitales.put("Estados Unidos", "Washington DC");
		    capitales.put("México", "México DF");
		    capitales.put("Belice", "Belmopán");
		    capitales.put("Costa rica", "San José");
		    capitales.put("El Salvador", "San Salvador"); //Falta el valor de la llave
		    capitales.put("Guatemala", "Ciudad de Guatemala");
		    capitales.put("Honduras", "Tegucigalpa");
		    capitales.put("Nicaragua", "Managua");
		    capitales.put("Panamá", "Panamá");
		   
		    String c = ""; //Variable tipo String, faltaba una "s"

		    do {
		      System.out.print("Escribe el nombre de un país y te diré su capital: "); //Método out en el system 
		      c = s.nextLine(); //Line porque toma un valor tipo String
		      
		      if (!c.equals("salir")) { // "S" faltante en el método
		        if (capitales.containsKey(c)) { //Variable tipo Capitales y debemos buscar por la Key no el Value
		          System.out.println("La capital de " + c); //System out para mostrar en consola
		          System.out.print(" es " + capitales.get(c)); //Método get para obtener el valor
		        } else {
		          System.out.print("No conozco la respuesta ");
		          System.out.print("¿Cuál es la capital de " + c + "?: ");
		          String capital = s.nextLine(); //Variable "capital"
		          capitales.put(c, capital); //Agrega a capitales la capital
		          System.out.println("Gracias por enseñarme nuevas capitales");
		        }
		      }
		    } while (!c.equals("salir")); //H faltante en "while" y ")" al final de la línea
	}
		 

}
