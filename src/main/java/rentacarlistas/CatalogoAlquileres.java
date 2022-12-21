/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

/**
 *
 * @author noelia
 */
public class CatalogoAlquileres extends Catalogo<Alquiler>{
    
    public CatalogoAlquileres(int tamanio) {
        super(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.anadirElemento(new Alquiler());
        }
    }
    
    public Alquiler buscarAlquiler(int ID) {
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(ID);
        int posicion = this.buscarElemento(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    
}
