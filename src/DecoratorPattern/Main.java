package DecoratorPattern;



public class Main {
    public static void main(String[] args) {

    BasePizza pizza=new MagarittaPizza();
        System.out.println(pizza.cost());
    ExtraCheese extraCheeseMargarittaPizza=new ExtraCheese(pizza);
        System.out.println(extraCheeseMargarittaPizza.cost());
    ExtraMushrooms extraMushroomsExtraCheesePizza=new ExtraMushrooms(extraCheeseMargarittaPizza);
    System.out.println(extraMushroomsExtraCheesePizza.cost());

    ExtraCheese extraCheeseExtraMushroomsExtraCheesePizza=new ExtraCheese(extraMushroomsExtraCheesePizza);
    System.out.println(extraCheeseExtraMushroomsExtraCheesePizza.cost());

    }
}
