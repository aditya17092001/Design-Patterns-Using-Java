public class Main {

	public static void main(String[] args) {
		BasePizza pizza = new ExtraCheese(new Margherita());
		BasePizza farmHousePizza = new ExtraCheese(new Mushroom(new FarmHouse()));
		System.out.println(pizza.cost());
		System.out.println(farmHousePizza.cost());
	}

}
