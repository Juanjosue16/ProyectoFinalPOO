

package Principal;
import clases.Autobus;
import transport.*;
import clases.*;




public class ProyectoTransporte {

    public static void main(String[] args) {
        
        
        //Objetos
        //Autubus
        Autobus oRuta1 = new Autobus("QER-185","Ruta 1","Av. Javier Heraud", "Urbano: S/1.5, Universitario: S/1.0, Escolar: S/0.5","Independencia","Lunes-Domingo","6:00 Am - 9:00 Pm");
        Autobus oRuta10 = new Autobus("TYU-589","Ruta 10","Carlos F. Vivsnco","Urbano: S/1.5, Universitario: S/1.0, Escolar: S/0.5","Av. Iquitos","Lunes-Domingo","6:00 Am - 9:00 Pm");
        Autobus oRuta6 = new Autobus("ACQ-J45","Ruta 6","Av. Arenales","Urbano: S/1.5, Universitario: S/1.0, Escolar: S/0.5","Independencia","Lunes-Domingo","6:00 Am - 9:00 Pm");
        Autobus oRuta21 = new Autobus("ROP-T95","Ruta 21","Mollepata","Urbano: S/1.5, Universitario: S/1.0, Escolar: S/0.5","Fiscalia","Lunes-Domingo","6:00 Am - 9:00 Pm");
        Autobus oRuta7 = new Autobus("ASG-826","Ruta 7","Warpa Picchu","Urbano: S/1.5, Universitario: S/1.0, Escolar: S/0.5","Libertad","Lunes-Domingo","6:00 Am - 9:00 Pm");
        Autobus oRuta8 = new Autobus("UFR-178","Ruta 8","Mollepata","Urbano: S/1.5, Universitario: S/1.0, Escolar: S/0.5","Enace Vista Alegre","Lunes-Domingo","6:00 Am - 9:00 Pm");
        Autobus oRuta14 = new Autobus("POE-F75","Ruta 14","Artezanos","Urbano: S/1.5, Universitario: S/1.0, Escolar: S/0.5","Quicapata","Lunes-Domingo","6:00 Am - 9:00 Pm");
        Autobus oRuta12 = new Autobus("HYT-R85","Ruta 12","Posta Belen","Urbano: S/1.5, Universitario: S/1.0, Escolar: S/0.5","Parque Miraflores","Lunes-Domingo","6:00 Am - 9:00 Pm");
        
        
        //Imprimir
        //Arreglo
        Autobus []listaAutobuses = new Autobus[8];
        listaAutobuses[0] = oRuta1;
        listaAutobuses[1] = oRuta10;
        listaAutobuses[2] = oRuta6;
        listaAutobuses[3] = oRuta21;
        listaAutobuses[4] = oRuta7;
        listaAutobuses[5] = oRuta8;
        listaAutobuses[6] = oRuta14;
        listaAutobuses[7] = oRuta12;
        
        System.out.println("Informacion de todos los Autobuses:");
        System.out.println("\nEl autobus 1: "+listaAutobuses[0].mostrarDatosAutobus());
        System.out.println("\nEl autobus 10: "+listaAutobuses[1].mostrarDatosAutobus());
        System.out.println("\nEl autobus 6: "+listaAutobuses[2].mostrarDatosAutobus());
        System.out.println("\nEl autobus 21: "+listaAutobuses[3].mostrarDatosAutobus());
        System.out.println("\nEl autobus 7: "+listaAutobuses[4].mostrarDatosAutobus());
        System.out.println("\nEl autobus 8: "+listaAutobuses[5].mostrarDatosAutobus());
        System.out.println("\nEl autobus 14: "+listaAutobuses[6].mostrarDatosAutobus());
        System.out.println("\nEl autobus 12: "+listaAutobuses[7].mostrarDatosAutobus());
        
        
        //Recorrido
        //Objetos de Recorrido:
        
        Recorrido oRecorridoRuta1 = new Recorrido("Independiente - Via libertadores - Av. 26 de enero - Jr. Libertad - Calle Nazareno - Calor F. Vivanco - Ovalo Puente Nuevo");
        Recorrido oRecorridoRuta10 = new Recorrido("Av. Iquitos - Grigo Fenix - Aprovisa - Av. Ramon Castilla - Puente ejercito - Jr. Cuzco - Av. Mariscal Caceres");
        Recorrido oRecorridoRuta6 = new Recorrido("Independiente - Via libertadores - Av. 26 de enero - Jr. Libertad - Calle Nazareno - Calor F. Vivanco - Ovalo Puente Nuevo");
        Recorrido oRecorridoRuta21 = new Recorrido("Fiscalia - Colegio Fe y Alegria - Capillapata - Puente Nuevo - Santa Clara - Jr. Quinua - Av. Independencia");
        Recorrido oRecorridoRuta7 = new Recorrido("Av. Iquitos - Grigo Fenix - Aprovisa - Av. Ramon Castilla - Puente ejercito - Jr. Cuzco - Av. Mariscal Caceres");
        Recorrido oRecorridoRuta8 = new Recorrido("Enace Vista Alegre - Av. Ayacucho - Arco Carmen Alto - Alameda - Jr. Miguel Grau - Jr. Garzilazo - Av. Independencia");
        Recorrido oRecorridoRuta14 = new Recorrido("Quicapata - Av. Los libertadores - Arco carmen Alto - Alameda - Puente Nuevo - Jr. Sol - Jr. Quinua - Av. Independencia");
        Recorrido oRecorridoRuta12 = new Recorrido("Parque Miraflores - Av. Magisterial - Capillapata - Puente Nuevo - Parque Magdalena - Residencia - Av. Independencia");
        
        Recorrido []listaRecorridos = new Recorrido[8];
        listaRecorridos[0] = oRecorridoRuta1;
        listaRecorridos[1] = oRecorridoRuta10;
        listaRecorridos[2] = oRecorridoRuta6;
        listaRecorridos[3] = oRecorridoRuta21;
        listaRecorridos[4] = oRecorridoRuta7;
        listaRecorridos[5] = oRecorridoRuta8;
        listaRecorridos[6] = oRecorridoRuta14;
        listaRecorridos[7] = oRecorridoRuta12;
        
        System.out.println("\nTodo el recorrido de las Rutas: ");
        System.out.println("\nRecorrido Ruta 1: "+listaRecorridos[0].mostrarRecorrido());
        System.out.println("\nRecorrido Ruta 10: "+listaRecorridos[1].mostrarRecorrido());
        System.out.println("\nRecorrido Ruta 6: "+listaRecorridos[2].mostrarRecorrido());
        System.out.println("\nRecorrido Ruta 21: "+listaRecorridos[3].mostrarRecorrido());
        System.out.println("\nRecorrido Ruta 7: "+listaRecorridos[4].mostrarRecorrido());
        System.out.println("\nRecorrido Ruta 8: "+listaRecorridos[5].mostrarRecorrido());
        System.out.println("\nRecorrido Ruta 14: "+listaRecorridos[6].mostrarRecorrido());
        System.out.println("\nRecorrido Ruta 12: "+listaRecorridos[7].mostrarRecorrido());
        
        
        //Polimorfismo
        //Usuarios
        Usuario misUsuarios[] = new Usuario[3];
        misUsuarios[0] = new Usuario("Juan","19","Av. Larco");
        misUsuarios[1] = new UbicaciondeUsuario("Diego","20","Av. Libertad","Paradero Huanta");
        misUsuarios[2] = new UsuarioTransporte("Sebastian","18","Jr. Huancasolar","Ruta 6");
        
        for (Usuario usuarios: misUsuarios){
            System.out.println("\nUsuarios Registrados: ");
            System.out.println(usuarios.mostrarDatos());
            
        }
        
        
        //Ventana Jframe
        //botones_dinamicos V1 = new botones_dinamicos();
        //V1.setVisible(true);
        
        botones_dinamicos.main(args);

    }
}
