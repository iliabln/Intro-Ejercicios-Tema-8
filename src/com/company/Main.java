/* - Crear clase Persona
- Crear variables las privadas edad, nombre y telefono de la clase Persona.
- Crear gets y sets de cada propiedad.
- Crear un objeto persona en el main.
- Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último **muéstralas por consola**. */

package com.company;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(39);
        persona.setNombre("John");
        persona.setTelefono("654654654");

        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        String telefono = persona.getTelefono();

        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(telefono);

    }


}

class Persona{

    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;

    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
}