package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {
	public static void main(String[] args) {

		ArrayList<String> myGroceryList = new ArrayList<>();

		myGroceryList.add("cheese");
		myGroceryList.add("bread");
		myGroceryList.add("Milk");

		myGroceryList.remove("bread");

//		Iterator itr= myGroceryList.iterator();
//
//		while (itr.hasNext()){
//			System.out.print(itr.next() + ", ");
//		}

		for (String list: myGroceryList){
			System.out.println(list);
		}
	}
}
