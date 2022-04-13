package com.sofka.proyect;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario");
        String nombreUsuario = leer.nextLine();
        System.out.println("Ingrese el numero del celular");
        String celular = leer.nextLine();
        System.out.println("Ingrese la edad");
        String edad = leer.nextLine();
        System.out.println("Bienvenido señor " + nombreUsuario +
                ", es un placer para nosotros contar con una persona de " + edad + " años.\n Proximamente nos comunicaremos con usted al numero: " +
                celular + "\n Feliz día");
    }
}
