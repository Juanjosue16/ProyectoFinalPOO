
package clases;


public class Autobus {
    
    private String placa;
    private int nombre_ruta;
    private String destino;
    private double tarifa;
    private String paraderoInicial;
    private String diasDeServicio;

    public Autobus(String placa, int nombre_ruta, String destino, double tarifa, String paraderoInicial, String diasDeServicio) {
        this.placa = placa;
        this.nombre_ruta = nombre_ruta;
        this.destino = destino;
        this.tarifa = tarifa;
        this.paraderoInicial = paraderoInicial;
        this.diasDeServicio = diasDeServicio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNombre_ruta() {
        return nombre_ruta;
    }

    public void setNombre_ruta(int nombre_ruta) {
        this.nombre_ruta = nombre_ruta;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
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
    
    
   
    
}
