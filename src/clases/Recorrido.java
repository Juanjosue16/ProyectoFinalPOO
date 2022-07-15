
package clases;


public class Recorrido {
    
    private String principalesRecorridos;

    public Recorrido(String principalesRecorridos) {
        this.principalesRecorridos = principalesRecorridos;
    }

    public String getPrincipalesRecorridos() {
        return principalesRecorridos;
    }

    public void setPrincipalesRecorridos(String principalesRecorridos) {
        this.principalesRecorridos = principalesRecorridos;
    }
    
    
    public String mostrarRecorrido(){
        return "==>"+principalesRecorridos;
    }
    
   
}
