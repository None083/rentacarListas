/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */

// Clase genérica, sirve para cualquier tipo de objeto
public class Catalogo<T> {
    
    protected List<T> lista;


    public Catalogo(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.lista = new ArrayList<>(tamanio);
        // lista.size() es 0
        
    }

    @Override
    public String toString() {
        String tmp = "";
        for (T objeto : this.lista) {
            tmp += objeto.toString() + "\n";
        }
        return tmp;
    }

    public int getNumeroElementos() {
        return this.lista.size();
    }

    public boolean borrarElemento(T elemento) {
        int pos = buscarElemento(elemento);
        if (pos >= 0) {
            this.lista.remove(pos);
            return true;
        }
        return false;
    }

     public int buscarElemento(T elemento) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (elemento.equals(this.lista.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public void anadirElemento(T elemento) {
        this.lista.add(elemento);
    }
    
    


    
}
