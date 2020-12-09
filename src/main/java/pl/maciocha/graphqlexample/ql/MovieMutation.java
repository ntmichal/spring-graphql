package pl.maciocha.graphqlexample.ql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;
import pl.maciocha.graphqlexample.Movie;
import pl.maciocha.graphqlexample.MovieService;

@Component
public class MovieMutation implements GraphQLMutationResolver {

    private MovieService movieService;

    public MovieMutation(MovieService movieService) {
        this.movieService = movieService;
    }

    public Movie createMovie(String name, String author){
        return movieService.saveMovie(name,author);
    }

}
