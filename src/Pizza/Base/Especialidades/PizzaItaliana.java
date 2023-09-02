package Pizza.Base.Especialidades;

import Pizza.Base.Pizza;
import Pizza.Base.Topping;

public class PizzaItaliana extends Pizza {
    private String salsa;
    public PizzaItaliana(String name, String Salsa, Topping... toppings) {
        super(name, toppings);
        this.salsa = Salsa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }



}
