package pl.maciocha.graphqlexample.ql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import pl.maciocha.graphqlexample.Movie;
import pl.maciocha.graphqlexample.MovieService;

import java.util.List;


@Component
public class MovieQuery implements GraphQLQueryResolver {

    private MovieService movieService;

    public MovieQuery(MovieService movieService) {
        this.movieService = movieService;
    }

    public List<Movie> getMovies(int size) {
        return movieService.getMovies(size);
    }

    public List<Movie> getAuthor(String author){
        return movieService.getAuthor(author);
    }
}
