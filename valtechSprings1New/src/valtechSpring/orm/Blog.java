package valtechSpring.orm;

import javax.persistence.Entity;

@Entity
public class Blog extends Book {
	
	private String url;
	private int visitedno;
	
	public Blog() {	}
	
	public Blog(String url, int visitedno) {
		super();
		this.url = url;
		this.visitedno = visitedno;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getVisitedno() {
		return visitedno;
	}
	public void setVisitedno(int visitedno) {
		this.visitedno = visitedno;
	}
	
	
	
	

}
