/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Steven Perez
 */
public class Grafico extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // llama al método paintComponent de la superclase

        this.setBackground(Color.WHITE);
        // cuadro
        g.setColor(Color.BLACK);
        g.fillRect(4, 10, 575, 4); //arriba
        g.fillRect(575, 10, 4, 355);//derecha
        g.fillRect(4, 10, 5, 355);//izquierda
        g.fillRect(4, 365, 575, 4);//abajo

        g.setColor(Color.ORANGE);
        g.fillRect(151, 180, 289, 100);

        //rectangulo
        g.setColor(Color.BLACK);
        g.drawRect(150, 180, 290, 0);//superior
        g.drawRect(150, 180, 0, 100);//izquierda
        g.drawRect(440, 180, 0, 100);//derecha
        g.drawRect(150, 280, 20, 0);//abajo izquierda
        g.drawRect(258, 280, 75, 0);//abajo centro
        g.drawRect(418, 280, 22, 0);//abajo derecha

        //circulos
        g.drawArc(170, 250, 90, 85, 0, 360);//grande 1
        g.drawArc(330, 250, 90, 85, 0, 360);//grande 2
        g.setColor(Color.blue);
        g.fillArc(170, 250, 90, 85, 0, 360);//puntar grande1
        g.fillArc(330, 250, 90, 85, 0, 360);//puntar grande2

        g.setColor(Color.BLACK);
        g.drawArc(204, 283, 20, 20, 0, 360);//pequeno1
        g.drawArc(364, 283, 20, 20, 0, 360);//pequeno2
        g.setColor(Color.MAGENTA);
        g.fillArc(204, 283, 20, 20, 0, 360);//puntar Pequeño1
        g.fillArc(364, 283, 20, 20, 0, 360);//puntar Pequeño2

        //semi circulos
        g.setColor(Color.RED);
        g.fillArc( 150, 80, 200, 200, 180, -90 );

        g.setColor(Color.BLACK);
        g.drawArc(150, 80, 200, 200, 180, -90);//semi superior
        g.drawArc(440, 133, 100, 100, 180, -80);//semi derecha
        g.drawRect(250, 80, 0, 100);//derecha

    } // fin del método paintComponent
}
