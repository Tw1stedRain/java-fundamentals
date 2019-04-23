package inheritance;

public class Restaurant {

    public String name;
    public int stars;
    public int price;

    public Restaurant(String name, int stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String toString() {
        return this.name + " has " + this.stars + " stars!";
    }

}
