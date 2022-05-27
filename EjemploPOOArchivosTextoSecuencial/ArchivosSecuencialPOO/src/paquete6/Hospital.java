
package paquete6;


public class Hospital {

    String nombre;
    int numeroCamas;
    double presupuesto;

    public Hospital(String nom, int num, double pre) {

        nombre = nom;
        numeroCamas = num;
        presupuesto = pre;

    }

    public void establecerNombre(String n) {
        nombre = n;

    }
    
    public void establecerNumCamas(int n) {
        numeroCamas = n;

    }
    
    public void establecerPresupuesto(double n) {
        presupuesto = n;

    }
    
    public String obtenerNombre() {
        return nombre;
        
    }
    
    public int obtenerNumCamas() {
        return numeroCamas;
        
    }
    
    public double obtenerPresupuesto() {
        return presupuesto;
        
    }


    
    

}

