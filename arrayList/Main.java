package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {

		OopTutsList s1 = new OopTutsList("Ahmad","123","Male");
		OopTutsList s2 = new OopTutsList("Latifa","233","Female");
		OopTutsList s3 = new OopTutsList("Ali","463","Male");

		ArrayList<OopTutsList> oopTutsStudentsList = new ArrayList<>();

		oopTutsStudentsList.add(s1);
		oopTutsStudentsList.add(s2);
		oopTutsStudentsList.add(s3);

		Iterator iterateMyList = oopTutsStudentsList.iterator();

		while (iterateMyList.hasNext()){
			OopTutsList list= (OopTutsList)iterateMyList.next();

			System.out.println("Name: " + list.getName()+"\n"
			+"Metric #: " + list.getMetric() + "\n"
			+"Gender: " + list.getGender());
		}
	}
}
