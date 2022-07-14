

package clases;


public class UsuarioTransporte extends Usuario{
    private String numeroAutobus;
    
    public UsuarioTransporte(String numeroAutobus,String nombre, String edad, String destino){
        super(nombre, edad, destino); 
        this.numeroAutobus = numeroAutobus;        
    }

    public String getNumeroAutobus() {
        return numeroAutobus;
    }
    
    @Override
    public String mostrarDatos(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nDestino: "+destino+"\nNumero de Autobus: "+numeroAutobus;
            
    }
    
    
}
