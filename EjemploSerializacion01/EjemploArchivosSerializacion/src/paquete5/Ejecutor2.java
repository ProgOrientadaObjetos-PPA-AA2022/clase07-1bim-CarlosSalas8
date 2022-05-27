
package paquete5;


public class Ejecutor2 {
    
    public static void main(String[] args){
    
        // nombre del archivo
        String nombreArchivo = "data/hospitales.data";
        String id_buscar = "520";
        Hospital hospital_buscar;
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        
        lectura.establecerIdentificador(id_buscar);
        lectura.establecerHospitalBuscado();
        hospital_buscar = lectura.obtenerHospitalBuscado();
        
        if(hospital_buscar!=null){
            
            System.out.println(hospital_buscar);
            
        }else{
            System.out.println("Hospital no encontrado");
        }
        
    }
}
