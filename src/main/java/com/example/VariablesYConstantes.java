package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {        
        // TODO
        int edad = 10;
        double peso = 69.7;
      
        System.out.println( "edad: "+edad+"\n peso: "+peso);
    }
    

    public static void demostrarConvencionesNombres() {
        // TODO
        String nombreCompleto = "adrian Alejandro Velazquez Petro";
        int puntuacionMaximaJuego = 100;

        System.out.println(" El nombre es "+ nombreCompleto);
        System.out.println("La puntuacion maxiama es:"+ puntuacionMaximaJuego );
    
    }

    public static void demostrarConstantes() {
        // TODO
        final double  PI = 3.141592653579;

        PI = 3.14;

        System.out.println("El valor de pi es "+ PI);

        //este es el error que aparece a la hora de asignar otro valor : Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        //The final local variable PI cannot be assigned. It must be blank and not using a compound assignment
       //at com.example.VariablesYConstantes.demostrarConstantes(VariablesYConstantes.java:23)
        
    }
    
}