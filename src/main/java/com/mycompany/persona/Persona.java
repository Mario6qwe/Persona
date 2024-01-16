/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 * @author aguil
 */
public class Persona {

    private String nombre;
    private int edad;
    private String email;

    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }
    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", 16, 1, "Software", null);
        Estudiante estudiante2 = new Estudiante("Martha", 19, 5, "Mecánica", "marthagintoeedae@gmail.com");
        Estudiante estudiante3 = new Estudiante("Carlos", 17, 3, "Electronica", "emafnoproporcionado@gmail.com");
        Estudiante estudiante4 = new Estudiante("Patricia", 20, 8, "Petroquimica", "pattyipespe40ues@gmail.com");

        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
        System.out.println(estudiante4.toString());
 }
}
