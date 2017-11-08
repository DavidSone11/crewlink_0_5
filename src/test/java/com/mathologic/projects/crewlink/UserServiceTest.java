/**
 * 
 */
package com.mathologic.projects.crewlink;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.mathologic.projects.mongo.elasticsearch.services.UserService;
import com.mathologic.projects.mongo.models.User;



import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	/**
	 * 
	 */
	public UserServiceTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
    private UserService bookService;

    @Autowired
    private ElasticsearchTemplate esTemplate;

    @Before
    public void before() {
        esTemplate.deleteIndex(User.class);
        esTemplate.createIndex(User.class);
        esTemplate.putMapping(User.class);
        esTemplate.refresh(User.class);
    }

    @Test
    public void testSave() {

    	User book = new User("1001", "santosh", "santosh", "sahu","san@gmailc.com","7406465159","E123","E12345", true,"EC123");
    	User testBook = bookService.save(book);

        
        assertEquals(testBook.getEmail(), book.getEmail());
        assertEquals(testBook.getUsername(), book.getUsername());
        assertEquals(testBook.getFirstName(), book.getFirstName());

    }

    @Test
    public void testFindOne() {

//    	User book = new User("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017");
//        bookService.save(book);
//
//        Book testBook = bookService.findOne(book.getId());
//
//        assertNotNull(testBook.getId());
//        assertEquals(testBook.getTitle(), book.getTitle());
//        assertEquals(testBook.getAuthor(), book.getAuthor());
//        assertEquals(testBook.getReleaseDate(), book.getReleaseDate());

    }

    @Test
    public void testFindByTitle() {

//        Book book = new Book("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017");
//        bookService.save(book);
//
//        List<Book> byTitle = bookService.findByTitle(book.getTitle());
//        assertThat(byTitle.size(), is(1));
    }

    @Test
    public void testFindByAuthor() {
//
//        List<Book> bookList = new ArrayList<>();
//
//        bookList.add(new Book("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017"));
//        bookList.add(new Book("1002", "Apache Lucene Basics", "Rambabu Posa", "13-MAR-2017"));
//        bookList.add(new Book("1003", "Apache Solr Basics", "Rambabu Posa", "21-MAR-2017"));
//        bookList.add(new Book("1007", "Spring Data + ElasticSearch", "Rambabu Posa", "01-APR-2017"));
//        bookList.add(new Book("1008", "Spring Boot + MongoDB", "Mkyong", "25-FEB-2017"));
//
//        for (Book book : bookList) {
//            bookService.save(book);
//        }
//
//        Page<Book> byAuthor = bookService.findByAuthor("Rambabu Posa", new PageRequest(0, 10));
//        assertThat(byAuthor.getTotalElements(), is(4L));
//
//        Page<Book> byAuthor2 = bookService.findByAuthor("Mkyong", new PageRequest(0, 10));
//        assertThat(byAuthor2.getTotalElements(), is(1L));

    }

    @Test
    public void testDelete() {

//        Book book = new Book("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017");
//        bookService.save(book);
//        bookService.delete(book);
//        Book testBook = bookService.findOne(book.getId());
//        assertNull(testBook);
    }


}
