package arrayList;

public class OopTutsList {

	private String name;
	private String metric;
	private String gender;

	OopTutsList(String name, String metric, String gender){
		this.name = name;
		this.metric = metric;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getMetric() {
		return metric;
	}

	public String getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}
}
