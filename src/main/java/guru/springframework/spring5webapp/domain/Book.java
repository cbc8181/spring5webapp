package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import  java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  String firstName;
    private String lastName;
    @ManyToMany
    @JoinTable(name="author_book",joinColumns=@JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;


    public Book() {
    }

    public Book(Long id, String firstName, String lastName, Set<Author> authors) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
