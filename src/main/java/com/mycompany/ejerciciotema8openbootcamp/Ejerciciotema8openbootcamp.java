/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotema8openbootcamp;

/**
 *
 * @author Fabshadow0404
 */




public class Ejerciciotema8openbootcamp {

    public static void main(String[] args) {
 // Crear objeto Persona
        Persona persona = new Persona();

        // Utilizar setters para asignar valores
        persona.setEdad(25);
        persona.setNombre("Juan");
        persona.setTelefono("123456789");

        // Utilizar getters para obtener los valores y mostrarlos por consola
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}

//creando la clase persona y dandole sus caracteristicas 
 class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    // Constructor
    public Persona() {
        // Constructor vacío
    }

    // Getters obtener valores 
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setters asignar valores
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}


