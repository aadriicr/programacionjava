package com.actividad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3Redondeo {
	public static String inicial ( ) {
        String datointroducido = "" ;
    try {            
        InputStreamReader flujo= new InputStreamReader  ( System.in  );
 
        BufferedReader teclado = new BufferedReader ( flujo ); 
        datointroducido = teclado .readLine();
    } catch  (IOException e){
        System.err .print ( "Error: " + e.getMessage ( ) );
    }
return datointroducido ; 
}
  
public static int entero( )  {
    try {
        return Integer.parseInt( inicial( ) );
    } catch ( NumberFormatException e )  {
        return Integer. MIN_VALUE;
    }
}

public static double real( ) {
    try {
        return Double.parseDouble ( inicial( ) );
    } catch ( NumberFormatException e )   {
        return Double. NaN;
    }
}
   
public static String  cadena() {
    return inicial( );
}

static char  caracter() {
    String valor=  inicial();
    return valor.charAt(0);
}
}

