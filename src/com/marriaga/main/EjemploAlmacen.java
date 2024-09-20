package com.marriaga.main;

import com.marriaga.model.*;

import java.util.Scanner;

public class EjemploAlmacen {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        productos[0] = new Lacteo("Leche", 23, 1, 576);
        productos[1] = new Lacteo("Yoghurt", 43, 1, 399);
        productos[2] = new Fruta("Manzana", 33, 1.5, "Roja");
        productos[3] = new Fruta("Plátano", 17, 1, "Amarillo");
        productos[4] = new Limpieza("Windex", 38, "Limpia Vidrios", .45);
        productos[5] = new Limpieza("Jabón", 19, "Neutro", .25);
        productos[6] = new NoPerecible("Agua", 67, 1, 13);
        productos[7] = new NoPerecible("Azúcar", 28, 1, 900);

        for (int i = 0; i < productos.length; i++) {
            System.out.println("===================================================================");
            System.out.print("Nombre= " + productos[i].getNombre() + ", Precio= " + productos[i].getPrecio());
            if (productos[i] instanceof Lacteo) {
                System.out.println(", Cantidad= " + ((Lacteo) productos[i]).getCantidad() + ", Proteinas= " + ((Lacteo) productos[i]).getProtreinas());
            } else if (productos[i] instanceof Fruta) {
                System.out.println(", Peso= " + ((Fruta) productos[i]).getPeso() + ", Color= " + ((Fruta) productos[i]).getColor());
            } else if (productos[i] instanceof Limpieza) {
                System.out.println(", Componentes= " + ((Limpieza) productos[i]).getComponentes() + ", Litros=" + ((Limpieza) productos[i]).getLitros());
            } else if (productos[i] instanceof NoPerecible) {
                System.out.println(", Contenido= " + ((NoPerecible) productos[i]).getContenido() + ", Calorías= " + ((NoPerecible) productos[i]).getCalorias());
            }

        }
    }
}
