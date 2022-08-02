package com.unisabana.patrones.behavioral.client;

import com.unisabana.patrones.behavioral.entity.Perro;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args){
        new Main(new Perro());
    }
    
    private Perro perro;

    public Main(Perro perro) {
        this.perro = perro;
        this.menu();
    }
    
    public void menu(){
        Scanner keyboard = new Scanner(System.in);
        char option = ' ';
        String options = "¿Qué acción desea realizar con el perrito?\n" +
                         "a) Alimentar.\n" +
                         "b) Dormir.\n" +
                         "c) Jugar.\n" +
                         "d) Preguntar.\n" +
                         "e) Salir.";
        
        while(true){
            System.out.println(options);
            option = keyboard.next().charAt(0);
            switch(option){
                case 'a':{
                    this.perro.alimentar();
                    break;
                }
                case 'b':{
                    this.perro.dormir();
                    break;
                }
                case 'c':{
                    this.perro.jugar();
                    break;
                }
                case 'd':{
                    this.perro.comoEstas();
                    break;
                }
                case 'e':{
                    System.out.println("¡Adiós!");
                    System.exit(0);
                }
                default: System.out.println("Opción no válida.");
            }
        }
    }
}
