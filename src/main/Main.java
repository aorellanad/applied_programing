package main;

import console.PrintConsole;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JFrame;
import models.People;
import models.Person;

public class Main {

    public static void main(String[] args) {
        /*
        People people = new People();
        DecimalFormat decimalFormatter = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        PrintConsole pc = new PrintConsole();
        int opcion;
        do {
            String respuesta = "SI";
            while (respuesta.equals("SI")) {
                pc.printName();
                String name = sc.nextLine();
                pc.printLastName();
                String lastName = sc.nextLine();
                pc.printPhone();
                String phone = sc.nextLine();
                pc.printAddress();
                String address = sc.nextLine();
                pc.printEmail();
                String email = sc.nextLine();
                pc.printSalary();
                double salary = Double.parseDouble(sc.nextLine());
                Person p = new Person(name, lastName, phone, address, email, salary);
                people.getList().add(p);
                do {
                    pc.repeatAgain();
                    respuesta = sc.nextLine().toUpperCase();
                } while (!respuesta.equals("SI") && !respuesta.equals("NO"));
            }
            pc.printData(people.getList());
            people.calculateSalary();

            System.out.println("Desea finalizar el programa: (SI/NO)");
            System.out.println(" 1.-NO ■■■■■ 2.-SI");
            System.out.print("»» ");
            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();
        } while (opcion == 1);
        */
        // crea marco para LineasRectsOvalosJPanel
        JFrame marco = new JFrame("Taller 10 (segundo trimestre)");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Grafico grafi = new Grafico();
        grafi.setBackground(Color.WHITE);
        marco.add(grafi); // agrega el panel al marco
        marco.setSize(600, 410); // establece el tamaño del marco
        marco.setVisible(true); // muestra el marco
    }
      
}
