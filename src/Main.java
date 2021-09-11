import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			List<Fruit> fruitList = new ArrayList<>();

			Fruit s1 = new Fruit(101,"Apple",23000);
			fruitList.add(s1);
			Fruit s2 = new Fruit(102,"Kiwi",24000);
			fruitList.add(s2);
			Fruit s3 = new Fruit(106,"Melon",22000);
			fruitList.add(s3);
			Fruit s4 = new Fruit(103,"Pear",26000);
			fruitList.add(s4);
			Fruit s5 = new Fruit(100,"Watermelon",20000);
			fruitList.add(s5);
			Fruit s6 = new Fruit(105,"Peach",27000);
			fruitList.add(s6);
			Fruit s7 = new Fruit(107,"Orange",24000);
			fruitList.add(s7);
			Fruit s8 = new Fruit(104,"Banana",23000);
			fruitList.add(s8);
			Fruit s9 = new Fruit(109,"Cherry",22000);
			fruitList.add(s9);
			Fruit s10 = new Fruit(110,"Mango",23000);
			fruitList.add(s10);

			System.out.println("Fruit List (ordered by name)");
			Collections.sort(fruitList, new FruitComparator());
			for (Fruit s : fruitList) {
				System.out.println(s.toString());
			}

			System.out.println("Fruit List (reverse ordered by name");
			Collections.sort(fruitList, new FruitComparatorDesc());
			for (Fruit element : fruitList) {
				System.out.println(element.toString());
			}
	}

}
