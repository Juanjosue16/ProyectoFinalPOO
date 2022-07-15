

package Principal;
import clases.Autobus;
import transport.*;
import clases.*;




public class ProyectoTransporte {

    public static void main(String[] args) {
        
        
        //Objetos
        Autobus oRuta1 = new Autobus("eER-185",1,"Penal de Yanamilla", 1.5,"Av. 26 de enero","Lunes-Domingo");

        Autobus oRuta3 = new Autobus("Tyu-589",3,"Alameda",1.5,"Independencia","Lunes-viernes");
        
        //getts and setts

        
        //Polimorfismo
        Usuario misUsuarios[] = new Usuario[3];
        misUsuarios[0] = new Usuario("Juan","19","Av. Larco");
        misUsuarios[1] = new UbicaciondeUsuario("Diego","20","Av. Libertad","Paradero Huanta");
        misUsuarios[2] = new UsuarioTransporte("Sebastian","18","Jr. Huancasolar","Ruta 6");
        
        for (Usuario usuarios: misUsuarios){
            System.out.println(usuarios.mostrarDatos());
            System.out.println("");
        }
        
        
        //Ventana Jframe
        //botones_dinamicos V1 = new botones_dinamicos();
        //V1.setVisible(true);
        
        botones_dinamicos.main(args);

    }
}
