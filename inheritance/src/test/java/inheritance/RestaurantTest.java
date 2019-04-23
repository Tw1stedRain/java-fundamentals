package inheritance;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testRestConstructor() {
        Restaurant r = new Restaurant("Red Robin", 3, 2);

        assertTrue(r != null);
        assertEquals("Red Robin", r.name);
        assertEquals(3, r.stars);
        assertEquals(2, r.price);
    }

    @Test
    public void testToString() {
        Restaurant r = new Restaurant("Red Robin", 3, 2);
        r.toString();

        assertEquals("Red Robin has 3 stars!", r.toString());

    }

    @Test
    public void testAddReview() {
        Restaurant n = new Restaurant("Bob's Burgers", 3, 2);
        n.addReview("Fredreik", "gross!!!", "Worst burger I\'ve ever had!", 2);
        List l = n.getReviews();

        assertTrue(l.size() >= 1);
        assertEquals("Review: gross!!! written by Fredreik, gives the restaurant it talks about 2 stars.", l.get(0).toString());

    }

}