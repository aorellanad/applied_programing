/* Desarrolle una aplicación java (sin interfaz gráfica),
* que permita ingresar datos (al menos 6 a su elección incluyendo sueldo) en una arraylist,
* debe hacer una pregunta para seguir ingresando datos, y validar que solo puedo dar dos respuestas (S o N),
* una vez que termine de ingresar datos, debe presentar un listado de los datos ingresados,
* y el promedio de los sueldos.
* Debe preguntar si desea finalizar el programa,
* si no desea finalizar se repite el proceso completo.
* Debe realizar todas las validaciones de datos correspondientes,
* y dar formato con dos decimales a los datos numéricos.
* nombre, apellido, sueldo, telefono, direccion, correo
 */
package console;

import java.util.ArrayList;
import models.Person;

/**
 *
 * @author Axl Orellana
 */
public class PrintConsole {

    public void printName() {
        System.out.print("Por favor ingrese el nombre: ");
    }

    public void printLastName() {
        System.out.print("Por favor ingrese el apellido: ");
    }

    public void printSalary() {
        System.out.print("Por favor ingrese el sueldo: ");
    }

    public void printPhone() {
        System.out.print("Por favor ingrese el teléfono: ");
    }

    public void printAddress() {
        System.out.print("Por favor ingrese la dirección: ");
    }

    public void printEmail() {
        System.out.print("Por favor ingrese el correo: ");
    }

    public void heading() {
        System.out.println("Detalles de Ingresos");
        System.out.print("Nombre \t\t");
        System.out.print("Apellido \t\t");
        System.out.print("Correo \t\t");
        System.out.print("Dirección \t\t");
        System.out.print("Teléfono \t\t");
        System.out.print("Sueldo \n");
    }

    public void finish() {
        System.out.println("Desea finalizar ahora?");
    }

    public void printData(ArrayList<Person> people) {
        heading();
        people.forEach((person) -> {
            System.out.print(person.getName());
            System.out.print("\t\t");
            System.out.print(person.getLastName());
            System.out.print("\t\t\t");
            System.out.print(person.getEmail());
            System.out.print("\t\t");
            System.out.print(person.getAddress());
            System.out.print("\t\t\t");
            System.out.print(person.getPhone());
            System.out.print("\t\t\t");
            System.out.print(person.getSalary());
            System.out.print("\t\t\n");
        });
    }

    public void repeatAgain() {
        System.out.println("Desea ingresar otra persona");
    }

    public void printSalary(double total) {
        System.out.println("El total del sueldo es:" + total);
    }

}
