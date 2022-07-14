
package clases;


public class Usuario {
    
    protected String nombre;
    protected String edad;
    protected String destino;

    public Usuario(String nombre, String edad, String destino) {
        this.nombre = nombre;
        this.edad = edad;
        this.destino = destino;
    }
        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public String mostrarDatos(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nDestino: "+destino;
            
    }     
            
    
}
