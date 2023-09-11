import Pizza.Base.Especialidades.PizzaCuattroQuesos;
import Pizza.Base.Especialidades.PizzaEstiloChicago;
import Pizza.Base.Especialidades.PizzaItaliana;
import Pizza.Base.Topping;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<String> ingredientes = new ArrayList<>();
            ingredientes.add("Mozzarella");
            ingredientes.add("Pepperoni");
            ingredientes.add("Jitomate");
            ingredientes.add("Queso Parmesano");

            PizzaEstiloChicago pizzaChicago = new PizzaEstiloChicago("Pizza de Chicago","Mptzalella", ingredientes);
            pizzaChicago.addTopping(new Topping("cebolla", 8));
            pizzaChicago.prepare();

            PizzaCuattroQuesos pizza =  new PizzaCuattroQuesos("Cuatroquesos", "Queso Azul");
            pizza.addTopping(new Topping("Tomato", 8));
            pizza.addTopping(new Topping("Mozarella", 7));
            pizza.addTopping(new Topping("Orilla de queso ", 15));
            pizza.prepare();

            System.out.print("\n");


            PizzaItaliana pizzaItaliana = new PizzaItaliana("Italiana","salsa" );
            pizzaItaliana.addTopping(new Topping("Tomato", 8));
            pizzaItaliana.prepare();



    }



}