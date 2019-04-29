package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testReviewConstructor() {
        Restaurant n = new Restaurant("Time Out Burger", 4, 2);
        Review r = new Review("Bob Salad", "Best Burger Ever!", "This burger was tasty af, and I will go back!", 4, n);

        assertTrue(r != null);
        assertEquals("Bob Salad", r.author);
        assertEquals("Best Burger Ever!", r.title);
        assertEquals("This burger was tasty af, and I will go back!", r.body);
        assertEquals(4, r.stars);
    }

    @Test
    public void testReviewString() {
        Restaurant n = new Restaurant("Time Out Burger", 4, 2);
        Review r = new Review("Bob Salad", "Best Burger Ever!", "This burger was tasty af, and I will go back!", 4, n);
        Review x = new Review("Terri Shaw", "Yumm", "yummmmmmmmmm", 5, n);
        Review z = new Review("Dont Care", "ugh", "blech", 1, n);

        assertEquals("Review: Best Burger Ever! written by Bob Salad, gives the restaurant it talks about 4 stars.", r.toString());
        assertEquals("Review: Yumm written by Terri Shaw, gives the restaurant it talks about 5 stars.", x.toString());
        assertEquals("Review: ugh written by Dont Care, gives the restaurant it talks about 1 stars.", z.toString());
    }

}