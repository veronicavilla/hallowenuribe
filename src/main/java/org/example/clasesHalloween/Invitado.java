package org.example.clasesHalloween;

public class Invitado {
    //ATRIBUTOS

    public String nombre;
    public String apellido;
    public byte edad;
    public String id;
    public boolean aplicaCover;
    public float valorCover;
    public char disfraz;


    //CONSTRUCTOR

    public Invitado() {
    }

    //METODOS
    public void mostrarInvitado(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Edad: "+this.edad);
        System.out.println("Identificación: "+this.id);
        System.out.println("Paga Cover: "+this.aplicaCover);
        System.out.println("Valor del Cover: "+this.valorCover);
        System.out.println("Tipo Disfraz: "+this.disfraz);
    }

}
