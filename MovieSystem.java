/*
Create a class named Movie that can be used with your video rental business.
The Movie class should track the Motion Picture Association of America (MPAA) rating
(e.g., Rated G, PG-13, R), ID Number, and movie title with appropriate accessor and mutator methods.
Also create an equals() method that overrides Object ’s equals() method, where two movies are equal if their
ID number is identical. Next,create three additional classes named Action , Comedy , and Drama
that are derived from Movie .Finally, create an overridden method named calcLateFees that takes as
input the number of days a movie is late and returns the late fee for that movie. The default late fee
is $2/day. Action movies have a late fee of $3/day, comedies are $2.50/day, and dramas are $2/day.
Test your classes from a main method.
*/
class Movie{

    private String rating;
    private int idNumber;
    private String title;

    // Constructor
    public Movie(String rating, int idNumber, String title) {
        this.rating = rating;
        this.idNumber = idNumber;
        this.title = title;
    }

    // Default constructor
    public Movie() {}

    // Getters
    public String getRating() {
        return rating;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getTitle() {
        return title;
    }


}

class Action extends Movie{

}

class Comedy extends Movie{

}

class Drama extends Movie{

}

public class MovieSystem {
}
