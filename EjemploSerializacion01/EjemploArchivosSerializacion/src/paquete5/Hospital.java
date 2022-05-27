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

    public Hospital(String n, int num, double pres){
        nombre = n;
        numeroCamas = num;
        presupuesto = pres;
    }
    
    public void establecerNombre(String n){
        nombre = n;
        
    }
    public void establecerNumeroCamas(int n){
        numeroCamas = n;
    
    }
    public void establecerPresuspuesto(double n){
        presupuesto = n;
    
    }
    
    public String obtenerNombre(){
        return nombre;
    
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    
    }
}
