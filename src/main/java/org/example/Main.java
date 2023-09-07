package org.example;

import Pizza.Base.Especialidades.*;
import Pizza.Base.Topping;

public class Main {
    public static void main(String[] args) {
        PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", 10, "Salsa de Tomate");
        pizzaItaliana.setSize("medium");
        pizzaItaliana.addTopping(new Topping("Pepperoni", 3));
        pizzaItaliana.addTopping(new Topping("Mozzarella", 4));
        pizzaItaliana.addTopping(new Topping("Champiñones", 3));
        pizzaItaliana.addTopping(new Topping("Jamón", 4));
        pizzaItaliana.addTopping(new Topping("Anchoas", 3));
        pizzaItaliana.prepare();

        PizzaMargarita pizzaMargarita = new PizzaMargarita("Pizza Margarita",15, "Salsa de tomate");
        pizzaMargarita.setSize("large");
        pizzaMargarita.addTopping(new Topping("Tomate", 1));
        pizzaMargarita.addTopping(new Topping("Mozzarella", 4));
        pizzaMargarita.addTopping(new Topping("Albahaca", 1));
        pizzaMargarita.prepare();

        PizzaHawaiana pizzaHawaiana = new PizzaHawaiana("Pizza Hawaiana",10, "Salsa de Piña");
        pizzaHawaiana.setSize("small");
        pizzaHawaiana.addTopping(new Topping("Tomate", 1));
        pizzaHawaiana.addTopping(new Topping("Mozzarella", 4));
        pizzaHawaiana.addTopping(new Topping("Jamón", 4));
        pizzaHawaiana.addTopping(new Topping("Piña", 3));
        pizzaHawaiana.prepare();

        PizzaVegetariana pizzaVegetariana = new PizzaVegetariana("Pizza Vegetariana",13, "Salsa de Pesto");
        pizzaVegetariana.setSize("medium");
        pizzaVegetariana.addTopping(new Topping("Tomate", 1));
        pizzaVegetariana.addTopping(new Topping("vegetales", 7));
        pizzaVegetariana.addTopping(new Topping("Champiñones", 3));
        pizzaVegetariana.prepare();

        PizzaPolloBBQ pizzaPolloBBQ = new PizzaPolloBBQ("Pizza de Pollo BBQ",25, "Salsa BBQ");
        pizzaPolloBBQ.setSize("large");
        pizzaPolloBBQ.addTopping(new Topping("Pechuga de Pollo", 6));
        pizzaPolloBBQ.addTopping(new Topping("Mozzarella", 4));
        pizzaPolloBBQ.addTopping(new Topping("Maíz", 3));
        pizzaPolloBBQ.addTopping(new Topping("Queso Cheddar", 2));
        pizzaPolloBBQ.prepare();
    }
}
