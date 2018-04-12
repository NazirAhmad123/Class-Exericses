package arrayList;

public class Student {

	private String name;
	private String metric;
	private String age;

	public Student(String name, String metric, String age) {
		this.name = name;
		this.metric = metric;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
