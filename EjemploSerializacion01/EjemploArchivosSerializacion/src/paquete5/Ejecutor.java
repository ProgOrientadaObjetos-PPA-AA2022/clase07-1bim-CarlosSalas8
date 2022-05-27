
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "data/hospitales.data";

        Hospital hosp1 = new Hospital("San Agustin",220,18000,"124");
        Hospital hosp2 = new Hospital("Isidro Ayora",750,30000,"157");
        Hospital hosp3 = new Hospital("San Pablo",350,17000,"145");

        EscrituraArchivosSecuencial archivo
                = new EscrituraArchivosSecuencial(nombreArchivo);
// establecer el valor del atributo registro
        archivo.establecerRegistroHospital(hosp1);
// establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hosp2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hosp3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospitales();
        System.out.println(lectura);
    }
}
