/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Empresa;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {

        Empresa em = new Empresa("Ebay", "New York");
        Empresa em2 = new Empresa("Epic games", "Kiev");
        Empresa em3 = new Empresa("Amazon", "Whanshigton DC");
        Empresa em4 = new Empresa("Cola Cola", "New Jersey");

        
   

        // ArrayList
        ArrayList<Empresa> empresas = new ArrayList<>();

        empresas.add(em);
        empresas.add(em2);
        empresas.add(em3);
        empresas.add(em4);

        for (int i = 0; i < empresas.size(); i++) {
            System.out.printf("%s - %s\n", empresas.get(i).obtenerNombre(),
                    empresas.get(i).obtenerCiudad());
 
        }

    }

}
