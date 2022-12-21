/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

/**
 *
 * @author noelia
 */
public class CatalogoVehiculos extends Catalogo<Vehiculo> {
    // Crea la clase heredando de la clase catalogo (extends)
    public CatalogoVehiculos(int tamanio) {
        super(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.anadirElemento(new Vehiculo());
        }
    }
    
     public Vehiculo buscarVehiculo(String bastidor) {
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int posicion = this.buscarElemento(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
}
