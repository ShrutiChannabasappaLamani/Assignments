package valtechSpring.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HardBook extends Book {
	
	
	private String isbn;
	private float price;
	private int publishedyear;
	private int edition;
	public HardBook() {	}
	
	public HardBook(String isbn, float price, int publishedyear, int edition) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.publishedyear = publishedyear;
		this.edition = edition;
	}
	

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getPublishedyear() {
		return publishedyear;
	}
	public void setPublishedyear(int publishedyear) {
		this.publishedyear = publishedyear;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
}
