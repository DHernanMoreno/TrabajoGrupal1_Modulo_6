//SubClase hecha por kelvin Muñoz
package Helpers;

public class Deportista extends Persona {

    //Subiendo deportista 
    // Atributos específicos de la subclase Deportista
    
    private String Tipodeporte;
    private String NEquipo;
    
    // Métodos específicos de la subclase Deportista
    public void setDeporte(String Tipodeporte) {
        this.Tipodeporte = Tipodeporte;
    }

    public String getDeporte() {
        return this.Tipodeporte;
    }

    public void setEquipo(String NEquipo) {
        this.NEquipo = NEquipo;
    }

    public String getEquipo() {
        return this.NEquipo= NEquipo;
    }
    
      public Deportista (){
      Identidad ("1627200089009");
      EstablecerNombre("Carlos Moreira");
      EstablecerEdad(27);
      EstablecerProfesion("Deportista");
      EstablecerCorreo("C_Moreira@gmail.com");
      Establecertelefono("89578998");
      setDeporte("Futbol");
      setEquipo("Fuente Azul");
      
      
    }
    
    
    // Método para imprimir información específica de la subclase Deportista
    public void imprimirDeportista() {
        System.out.println("Tipo de Deporte: "+Tipodeporte);
       System.out.println("Nombre de Equipo de "+Tipodeporte + ":"+ NEquipo);
       
    }

    
    @Override
    public String ObternerInformacionPersona() {
        return "Información del Deportista";
        
       
    }

}

