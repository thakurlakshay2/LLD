package DecoratorPattern;

public class ExtraMushrooms extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraMushrooms(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
}
