package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public String name;
    public String description;
    public int price;
    public List<Review> reviews;


    public Shop(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public void addReview(String author, String title, String body, int stars) {
        Review newReview = new Review(author, title, body, stars, this);
        reviews.add(newReview);

    }

    public List getReviews() {
        return reviews;
    }

    public String toString() {
        return this.name + " is a shop that averages a " + this.price + " out of 5 price.";
    }
}
