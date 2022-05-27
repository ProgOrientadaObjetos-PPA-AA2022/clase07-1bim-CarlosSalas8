
package paquete6;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        // nombre del archivo
        String nombreArchivo = "Hospital.txt";
        
        Hospital hosp1 = new Hospital("San Agustin",220,18000);
        Hospital hosp2 = new Hospital("Isidro Ayora",750,30000);
        Hospital hosp3 = new Hospital("San Pablo",350,17000);
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        Hospital[] lista = {hosp1, hosp2, hosp3};
        
        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        
    }
    
}
