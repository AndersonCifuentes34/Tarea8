package Pizza.Base.Especialidades;

import Pizza.Base.Pizza;
import Pizza.Base.Topping;

public class PizzaHawaiana extends Pizza {
    private String salsa;

    public PizzaHawaiana(String name, double price, String salsa, Topping... toppings) {
        super(name, price, toppings);
        this.salsa = salsa;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Agregando salsa a la Pizza Hawaiana: " + salsa);
    }
}
