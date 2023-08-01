package mvcflow.mvcflow;

public class PrimaryData {

	private int id;
	private String name;

	public PrimaryData() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PrimaryData [id=" + id + ", name=" + name + "]";
	}

}
