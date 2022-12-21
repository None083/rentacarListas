/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package rentacarlistas;

import java.util.Random;

/**
 *
 * @author noelia
 */
public enum Color {
    ROJO, NEGRO, AMARILLO, VERDE, AZUL, BLANCO;

    public static Color getAleatorio() {
        //se puede poner var en la primera parte para ahorrar escribir
        var r = new Random();

        Color[] colores = Color.values();
        int posicion = r.nextInt(0, colores.length);
        return colores[posicion];

    }
}
