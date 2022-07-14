
package clases;


public class UbicaciondeUsuario extends Usuario {
    private String paraderoCercano;
    
    public UbicaciondeUsuario(String nombre, String edad, String destino, String paraderoCercano){
        super(nombre, edad, destino); 
        this.paraderoCercano = paraderoCercano;        
    }

    public String getParaderoCercano() {
        return paraderoCercano;
    }

    public void setParaderoCercano(String paraderoCercano) {
        this.paraderoCercano = paraderoCercano;
    }
    
    @Override
    public String mostrarDatos(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nDestino: "+destino+"\nParadero cercano: "+paraderoCercano;
            
    }
    
}
