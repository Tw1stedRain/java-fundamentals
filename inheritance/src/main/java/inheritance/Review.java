package inheritance;

public class Review {

    public String author;
    public String title;
    public String body;
    public int stars;
    public Restaurant reviewTarget;

    public Review(String author, String title, String body, int stars, Restaurant reviewTarget) {
        this.author = author;
        this.title = title;
        this.body = body;
        this.stars = stars;
        this.reviewTarget = reviewTarget;

    }

    public String toString() {
        return "Review: " + this.title + " written by " + this.author + ", gives the restaurant it talks about " + this.stars + " stars.";
    }
}


