
public class Mushroom extends BasePizza{
	BasePizza pizza;
	public Mushroom(BasePizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public int cost() {
		return pizza.cost() + 20;
	}
}
