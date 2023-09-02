import Pizza.Base.Pizza;
import Pizza.Base.Topping;

public class Main {

        public static void main(String[] args) {

            Pizza pizza = new Pizza("Pizza Margarita");
            pizza.addTopping(new Topping("Tomato", 8));
            pizza.addTopping(new Topping("Mozarella", 7));
            pizza.addTopping(new Topping("Orilla de queso ", 15));
            pizza.prepare();
//
//    PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", 12.99, "Salsa de tomate");
//    pizzaItaliana.addTopping(new Topping("Tomato"));
//    pizzaItaliana.addTopping(new Topping("Mozarella"));
//    pizzaItaliana.prepare();
//    }
//
//    PizzaBase pizzaBase = new PizzaBase("Pizza Base", 10.99);
//    pizzaBase.prepare();

        }



}