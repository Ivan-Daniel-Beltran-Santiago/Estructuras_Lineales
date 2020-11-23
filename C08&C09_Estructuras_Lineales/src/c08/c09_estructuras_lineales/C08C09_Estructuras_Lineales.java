package c08.c09_estructuras_lineales;

import java.util.Scanner;

public class C08C09_Estructuras_Lineales {

    public static void main(String[] args) {
        String palabra;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        
        palabra = in.nextLine();
        
        System.out.println("¿" + palabra + " es palíndromo? " + isPalin(palabra));
    }
    
    public static boolean isPalin(String palabra){
        palabra = palabra.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "").replace(",", "").replace(".", "");
        
        String invert = new StringBuilder(palabra).reverse().toString();
        
        return invert.equals(palabra);
    }
}
