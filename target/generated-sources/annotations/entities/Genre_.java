package entities;

import entities.Movie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-16T02:32:35")
@StaticMetamodel(Genre.class)
public class Genre_ { 

    public static volatile ListAttribute<Genre, Movie> movies;
    public static volatile SingularAttribute<Genre, String> name;
    public static volatile SingularAttribute<Genre, Long> id;

}