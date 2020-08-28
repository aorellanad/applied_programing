/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.teacher;

import java.util.ArrayList;

/**
 *
 * @author bpuni
 */
public class Lista {

    private ArrayList<Datos> List = new ArrayList<Datos>();

    public ArrayList<Datos> getLista() {
        return List;

    }

    public Lista() {
    }

    public void Agregar(Datos dt) {
        List.add(dt);
    }

}
