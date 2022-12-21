/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentacarlistas;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class MenuRentacar {

    /**
     * 
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Empresa rentacar = new Empresa("Rentacar");
        int opcion = 0;
        
        do{
            System.out.println("""
                                        SELECIONE UNA OPCIÓN
                               ---------------------------------------
                               1 - Dar de alta vehículo
                               2 - Dar de alta cliente
                               3 - Dar de alta alquiler
                               4 - Mostrar vehículo
                               5 - Mostrar cliente
                               6 - Mostrar alquiler
                               7 - Salir
                               """);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    Vehiculo v = new Vehiculo();
                    rentacar.registrarVehiculo(v);
                    break;
                case 2:
                    System.out.println("Introduzca un nombre");
                    String nombre = teclado.nextLine();
                    System.out.println("Introduzca un apellido");
                    String apellido = teclado.nextLine();
                    Cliente c = new Cliente(nombre, apellido);
                    rentacar.registrarCliente(c);
                    break;
                case 3:
                    System.out.println("Introduzca el día del inicio del alquiler");
                    int dia = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduzca el mes del alquiler");
                    int mes = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduzca el año del alquiler");
                    int anio = teclado.nextInt();
                    teclado.nextLine();
                    LocalDate fecha = LocalDate.of(anio, mes, dia);
                    System.out.println("Introduzca el número de días del alquiler");
                    int numeroDias = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduzca el DNI del cliente");
                    String dni = teclado.nextLine();
                    System.out.println("Introduzca el numero de bastidor del vehiculo");
                    String bastidor = teclado.nextLine();
                    System.out.println(rentacar.registrarAlquiler(fecha, numeroDias, dni, bastidor));
                    
                    break;
                case 4:
                    System.out.println("Mostrando el catalogo de vehiculos: " + rentacar.mostrarVehiculo());
                    break;
                case 5:
                    System.out.println("Mostrando el catalogo de clientes " + rentacar.mostrarCliente());
                    break;
                case 6://No sé por qué, pero cuando muestro el alquiler está en null :(
                    System.out.println("Mostrando el catalogo de alquileres " + rentacar.mostrarAlquiler());
                    break;
                case 7:
                    System.out.println("Hasta luegui <3");
                    break;
                default:
                    System.out.println("Numero no válido");
            }
        }while(opcion != 7);
        
    }
    
}
