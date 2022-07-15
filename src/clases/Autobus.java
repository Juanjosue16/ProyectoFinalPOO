
package clases;


public class Autobus {
    
    private String placa;
    private String nombre_ruta;
    private String destino;
    private String tarifa;
    private String paraderoInicial;
    private String diasDeServicio;
    private String horarioTrabajo;

    public Autobus(String placa, String nombre_ruta, String destino, String tarifa, String paraderoInicial, String diasDeServicio, String horarioTrabajo) {
        this.placa = placa;
        this.nombre_ruta = nombre_ruta;
        this.destino = destino;
        this.tarifa = tarifa;
        this.paraderoInicial = paraderoInicial;
        this.diasDeServicio = diasDeServicio;
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre_ruta() {
        return nombre_ruta;
    }

    public void setNombre_ruta(String nombre_ruta) {
        this.nombre_ruta = nombre_ruta;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getParaderoInicial() {
        return paraderoInicial;
    }

    public void setParaderoInicial(String paraderoInicial) {
        this.paraderoInicial = paraderoInicial;
    }

    public String getDiasDeServicio() {
        return diasDeServicio;
    }

    public void setDiasDeServicio(String diasDeServicio) {
        this.diasDeServicio = diasDeServicio;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }
    
    
    public String mostrarDatosAutobus(){
        return "Placa: "+placa+"\nNombre de la Ruta: "+nombre_ruta+"\nDestino: "+destino+"\nTarifa: "+tarifa+"\nParadero Inicial: "+paraderoInicial+"\nDias de servicio: "+diasDeServicio+"\nHorario de Trabajo: "+horarioTrabajo;
            
    }
    
   
    
}
