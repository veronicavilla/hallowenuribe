package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        //DEFINIENDO COSTOS DE LA FIESTA
        System.out.println("****** GRAN FIESTA GRUPO URIBE *********");
        System.out.println("****************************************");

        System.out.println("1. Digita el costo de la comida: ");
        double costoAlimentos = entradaPorTeclado.nextDouble();
        if (costoAlimentos>0) {
            objetoFiesta.costosAlimentos=costoAlimentos;
        } else {
            System.out.println("Ingrese un valor valido");
        }
        System.out.println("El costo de alimentos fue: "+objetoFiesta.costosAlimentos);

        System.out.println("1. Digita el costo de las bebidas: ");
        double costoBebidas = entradaPorTeclado.nextDouble();
        if (costoBebidas>0) {
            objetoFiesta.costosBedidas=costoBebidas;
        } else {
            System.out.println("Ingrese un valor valido");
        }
        System.out.println("El costo de bebidas fue: "+objetoFiesta.costosBedidas);

        System.out.println("1. Digita el costo del lugar: ");
        double costoLugar = entradaPorTeclado.nextDouble();
        if (costoLugar>0) {
            objetoFiesta.costosLugar=costoLugar;
        } else {
            System.out.println("Ingrese un valor valido");
        }
        System.out.println("El costo del lugar fue: "+objetoFiesta.costosLugar);

        System.out.println("1. Digita el costo del equipo: ");
        double costoEquipo = entradaPorTeclado.nextDouble();
        if (costoEquipo>0) {
            objetoFiesta.costosEquipos=costoEquipo;
        } else {
            System.out.println("Ingrese un valor valido");
        }
        System.out.println("El costo del equipo fue: "+objetoFiesta.costosEquipos);
    }
}