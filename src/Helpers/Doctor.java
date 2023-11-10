/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

public class Doctor extends Persona {

    // Atributos específicos de la subclase Doctor
    private String especialidad;
    private String hospital;
    
      // Métodos específicos de la subclase Doctor
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getHospital() {
        return this.hospital;
    }

    // Constructor
    public Doctor() {
        Identidad("123456789");  // Ejemplo de ID
        EstablecerNombre("Dr. Juan Pérez");
        EstablecerEdad(40);
        EstablecerProfesion("Doctor");
        EstablecerCorreo("juan.perez@example.com");
        Establecertelefono("123456789");
        setEspecialidad("Pediatra");
        setHospital("Materno Infantil");
    }

  

    @Override
    public String ObternerInformacionPersona() {
        return "Información del Doctor";
    }
}
