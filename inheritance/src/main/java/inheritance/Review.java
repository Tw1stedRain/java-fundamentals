package inheritance;

public class Review {

    String author;
    String title;
    String body;
    int stars;

    public Review(String author, String title, String body, int stars) {
        this.author = author;
        this.title = title;
        this.body = body;
        this.stars = stars;

    }

    public String toString() {
        return "Review: " + this.title + " written by " + this.author + ", gives the restaurant it talks about " + this.stars + " stars.";
    }
}


