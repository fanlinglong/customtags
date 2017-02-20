package org.springframework.mytags.xml;

import org.springframework.beans.factory.FactoryBean;

public class TagsFactoryBean implements FactoryBean<A> {
	private A a;

	public A getObject() throws Exception {
		return this.a;
	}

	public Class<A> getObjectType() {
		return A.class;
	}

	public boolean isSingleton() {
		return true;
	}

	public void setA(A a) {
		this.a = a;
	}

	//
	// private A parent;
	// private List<A> children;
	//
	// public void setParent(A parent) {
	// this.parent = parent;
	// }
	//
	// public void setChildren(List<A> children) {
	// this.children = children;
	// }
	//
	// public A getObject() throws Exception {
	// if (this.children != null && this.children.size() > 0) {
	// for (A child : children) {
	// this.parent.addComponent(child);
	// }
	// }
	// return this.parent;
	// }
	//
	// public Class<A> getObjectType() {
	// return A.class;
	// }
	//
	// public boolean isSingleton() {
	// return true;
	// }

}