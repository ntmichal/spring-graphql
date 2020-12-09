package pl.maciocha.graphqlexample;

public class Movie {
    private Long id;
    private String name;
    private String author;

    public Movie() {
    }

    public Movie(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public Movie setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Movie setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Movie setAuthor(String author) {
        this.author = author;
        return this;
    }
}
