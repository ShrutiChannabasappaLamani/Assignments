package valtechSpring.orm;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private Date whenpublished;
	
	@ManyToOne(targetEntity=Publisher.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
	@JoinColumn(name="publisher_id",referencedColumnName="id")
	private Publisher publisher;
	
	@ManyToMany(targetEntity=Author.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	@JoinTable(joinColumns=@JoinColumn(name="book_id",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="author_id",referencedColumnName="id"))
	private Set<Author> authors;
	
	
	public Book() {	}
	public Book(int id, String name, Date whenpublished) {
		super();
		this.id = id;
		this.name = name;
		this.whenpublished = whenpublished;
	}
	
	public Book(String name,  Date whenpublished) {
		this.name = name;
		this.whenpublished = whenpublished;
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
	public Date getWhenpublished() {
		return whenpublished;
	}
	public void setWhenpublished(Date whenpublished) {
		this.whenpublished = whenpublished;
	}
	

}
