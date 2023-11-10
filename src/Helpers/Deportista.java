//SubClase hecha por kelvin Muñoz
package Helpers;

public class Deportista extends Persona {

    //Subiendo deportista 
    // Atributos específicos de la subclase Deportista
    
      public Deportista (){
      Identidad ("1627200089009");
      EstablecerNombre("Carlos Moreira");
      EstablecerEdad(27);
      EstablecerProfesion("Deportista");
      EstablecerCorreo("C_Moreira@gmail.com");
      Establecertelefono("89578998");
    }
    
    private String Tipodeporte;
    private String Equipo;
  
    
    // Métodos específicos de la subclase Deportista
    public void setDeporte(String Tipodeporte) {
        this.Tipodeporte = Tipodeporte;
    }

    public String getDeporte() {
        return this.Tipodeporte;
    }

    public void setEquipo(String equipo) {
        this.Equipo = Equipo;
    }

    public String getEquipo() {
        return this.Equipo;
    }

    /**
    // Método para imprimir información específica de la subclase Deportista
    public void imprimirDeportista() {
        System.out.println(("Futbol"));
        System.out.println("Equipo: " + ("Palma"));
    }
*/
    
    @Override
    public String ObternerInformacionPersona() {
        return "Información del Deportista";
    }

}

