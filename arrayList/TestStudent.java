package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {
	public static void main(String[] args) {

		Student student1 = new Student("Ahmad", "1325456","21");
		Student student2 = new Student("Ali", "1726656","23");
		Student student3 = new Student("Jack Ma", "1223453","25");


		ArrayList<Student> studentsList= new ArrayList<>();
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);


		Iterator itr= studentsList.iterator();


		while(itr.hasNext()){
			Student st = (Student)itr.next();
			System.out.println(st.getName()+" "+ st.getMetric() +" " + st.getAge());

		}

	}
}
