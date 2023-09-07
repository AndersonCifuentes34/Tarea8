package Pizza.Base;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private String size; // Nueva propiedad tamaño
    private List<Topping> toppings;

    public Pizza(String name, double price, Topping... toppings) {
        this.name = name;
        this.price = price;
        this.size = "small"; // Tamaño por defecto
        this.toppings = new ArrayList<>(); // Inicializa la lista de ingredientes
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    // Resto de métodos...

    public void prepare() {
        System.out.println("\nPreparing..... " + name + " (Size: " + size + ")");
        System.out.println("Adding toppings:");
        double total = 0;
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre() + "   Precio: Q." + topping.getPrecio());

            total += topping.getPrecio();
            // Pon 1 segundo de retraso
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Calcular el precio de acuerdo al tamaño
        if ("medium".equals(size)) {
            total += price * 0.20; // Incremento del 20% para tamaño mediano
        } else if ("large".equals(size)) {
            total += price * 0.35; // Incremento del 35% para tamaño grande
        } else {
            // Tamaño pequeño, no se aplica incremento
            total += price;
        }
        System.out.println("The Pizza is ready!" + "\nTotal a pagar: Q." + total);
        if ("medium".equals(size) || "large".equals(size)) {
            System.out.println("¡Felicidades! Has recibido un regalo especial con tu pizza " + size + ".");
        }

    }

}

