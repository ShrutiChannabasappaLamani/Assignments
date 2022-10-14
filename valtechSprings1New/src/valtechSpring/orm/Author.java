package valtechSpring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private long phnum;
	
	@OneToOne(targetEntity=Address.class)
	@JoinColumn(name="address_id",referencedColumnName="id")
	private Address address;
	
	@ManyToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	@JoinTable(joinColumns=@JoinColumn(name="author_id",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="book_id",referencedColumnName="id"))
	private Set<Book> books;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Author() {}
	public Author(int id, String name, long phnum) {
		this.id = id;
		this.name = name;
		this.phnum = phnum;
	}
	public Author( String name, long phnum) {
		this.name = name;
		this.phnum = phnum;
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
	public long getPhnum() {
		return phnum;
	}
	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}
	
	
	

}
