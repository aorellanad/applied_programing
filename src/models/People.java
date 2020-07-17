/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import console.PrintConsole;
import java.util.ArrayList;

/**
 *
 * @author Axl Orellana
 */
public class People {

    ArrayList<Person> list = new ArrayList<>();

    public void calculateSalary() {
        double total = 0;
        for (Person person : list) {
            total = total + person.getSalary();
        }
        new PrintConsole().printSalary(total);
    }

    public ArrayList<Person> getList() {
        return list;
    }

}
