/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

public class Hospital implements Serializable {

    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    String idHospital;
    

    public Hospital(String n, int num, double pres, String id) {
        nombre = n;
        numeroCamas = num;
        presupuesto = pres;
        idHospital = id;
    }

    public void establecerNombre(String n) {
        nombre = n;

    }

    public void establecerNumeroCamas(int n) {
        numeroCamas = n;

    }

    public void establecerPresuspuesto(double n) {
        presupuesto = n;

    }
    public void estableceridHospital(String n){
        idHospital = n;
    }

    public String obtenerNombre() {
        return nombre;

    }

    public int obtenerNumeroCamas() {
        return numeroCamas;

    }

    public double obtenerPresupuesto() {
        return presupuesto;

    }
    public String obtenerIdHospital(){
        return idHospital;
    
    }

    @Override
    public String toString() {
        String valor = String.format("%s-%d-%.2f-%s\n", obtenerNombre(),
                obtenerNumeroCamas(),
                obtenerPresupuesto(),
                obtenerIdHospital());
        return valor;
    }
}
