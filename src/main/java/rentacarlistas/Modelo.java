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
public enum Modelo {
    
    SEAT_PANDA("Seat", "Panda", "48"),
    FORD_KUGA("Ford", "Kuga", "120"),
    SEAT_CUPRA("Seat", "Cupra", "95");
    
    String marca;
    String modelo;
    String cilindrada;

    private Modelo(String marca, String modelo, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    

    @Override
    public String toString() {
        return "Modelo{" + "marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + '}';
    }
    
    public static Modelo getAleatorio(){
        Random r = new Random();
        Modelo[] modelos = Modelo.values();
//        for (int i = 0; i < modelos.length; i++) {
//            System.out.println(modelos[i]);
//        }
        int posicionValida = r.nextInt(0, modelos.length);
        return modelos[posicionValida];
    }
    
}
