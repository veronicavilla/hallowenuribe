package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //CREANDO UN OBJETO DE LA CLASE SCANNER
        Scanner entradaPorTeclado=new Scanner(System.in);
       //creando objeto de la clase invitado
        Invitado objetoInvitado = new Invitado();
        objetoInvitado.nombre = "Veronica";
        objetoInvitado.apellido = "Montoya";
        objetoInvitado.aplicaCover = true;
        objetoInvitado.id = "12345";
        objetoInvitado.disfraz = 'A';
        objetoInvitado.edad = 25;
        objetoInvitado.valorCover = 60000;

        //creando objeto de la clase invitado
        Invitado objetoInvitado2=new Invitado();
       objetoInvitado2.agregarInvitado();

        //MOSTRANDO LOS VALORES DE NUESTROS ATRIBUTOS
        objetoInvitado.mostrarInvitado();
        objetoInvitado2.mostrarInvitado();







        // CREANDO OBJETO DE LA CLASE LUGAR
        Lugar objetoLugar = new Lugar();

        //CREANDO OBJETO DE LA CLASE FIESTA
        Fiesta objetoFiesta = new Fiesta();
    }
}