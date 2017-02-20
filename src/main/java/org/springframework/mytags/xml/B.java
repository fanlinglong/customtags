package org.springframework.mytags.xml;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanlinlong on 2017/2/20.
 */
public class B {

	private String id;
    private String name;
    private List<C> cList = new ArrayList<C>();

    public List<C> getcList() {
		return cList;
	}

	public void setcList(List<C> cList) {
		this.cList = cList;
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
		return "B [id=" + id + ", name=" + name + ", cList=" + cList + "]";
	}

}
