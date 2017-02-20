package org.springframework.mytags.xml;

import java.util.ArrayList;
import java.util.List;

public class A {

	private String id;
    private String name;
    private List<B> bList = new ArrayList<B>();

    public List<B> getbList() {
		return bList;
	}

	public void setbList(List<B> bList) {
		this.bList = bList;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", bList=" + bList + "]";
	}

}
