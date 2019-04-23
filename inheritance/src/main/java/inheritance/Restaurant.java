package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    public String name;
    public int stars;
    public int price;
    public List<Review> reviews;

    public Restaurant(String name, int stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public void addReview(String author, String title, String body, int stars) {
        Review newReview = new Review(author, title, body, stars, this);
        reviews.add(newReview);

    }

    public String toString() {
        return this.name + " has " + this.stars + " stars!";
    }

    public List getReviews() {
        return reviews;
    }
}
