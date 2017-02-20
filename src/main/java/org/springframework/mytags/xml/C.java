package org.springframework.mytags.xml;

/**
 * Created by fanlinlong on 2017/2/20.
 */
public class C {
	private String id;
    private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
		return "C [id=" + id + ", name=" + name + "]";
	}

}
