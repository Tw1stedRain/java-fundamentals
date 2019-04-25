package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    public String name;
    public List showing;
    public List<Review> reviews;

    public Theater(String name) {
        this.name = name;
        this.showing = new ArrayList();
        this.reviews = new ArrayList<>();

    }

    public void addMovie(String movie) {
        showing.add(movie);
    }

    public void removeMovie(String movie) {

        for (int i = 0; i < showing.size(); i++) {
            if (movie == showing.get(i).toString()) {
                showing.remove(i);
            }
        }
    }

    public void addReview(String author, String title, String body, int stars) {
        Review newReview = new Review(author, title, body, stars, this);
        reviews.add(newReview);

    }

    public List getReviews() {
        return reviews;
    }

    public String toString() {
        String result = "";

        for (int i = 0; i < showing.size(); i++) {
            result = this.name + " is showing: " + this.showing;
        }

        return result;
    }

}


