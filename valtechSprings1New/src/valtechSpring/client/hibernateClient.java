package valtechSpring.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import valtechSpring.orm.Address;
import valtechSpring.orm.Article;
import valtechSpring.orm.Author;
import valtechSpring.orm.Blog;
import valtechSpring.orm.Book;
import valtechSpring.orm.HardBook;
import valtechSpring.orm.Publisher;

public class hibernateClient {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration()
				.configure()
				.addAnnotatedClass(Publisher.class)
				.addAnnotatedClass(Book.class)
				.addAnnotatedClass(Author.class)
				.addAnnotatedClass(Address.class)
				.addAnnotatedClass(HardBook.class)
				.addAnnotatedClass(Article.class)
				.addAnnotatedClass(Blog.class)
				.buildSessionFactory();
		
		Session ses= sf.openSession();
		Transaction tx= ses.beginTransaction();
		
		Address a = new Address("JP nagar","Blr","Kar",560078);
		
		Author ar = new Author(1,"shruti",927728765);
	    
		Book b = new Book("xyz", new Date(1,2,90));
		
		Article ac =new Article("http://youtube.com");
		Blog bg = new Blog("www.google.com", 3);
		HardBook hb = new HardBook("123",500,1990,4 );
		Publisher p = new Publisher("varshu","JP Nagara",987654321);
		
		
		
		ses.save(a);
		ses.save(ar);
		ses.save(b);
		ses.save(ac);
		ses.save(bg);
		ses.save(hb);
		ses.save(p);
		ar.setAddress(a);
        a.setAuthor(ar);
		
		tx.commit();
		ses.close();
		sf.close();
				
	}

}
