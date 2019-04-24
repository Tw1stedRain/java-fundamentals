package inheritance;

import org.junit.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testTheaterConstructor() {
        Theater t = new Theater("Amex");
        Theater x = new Theater("Regal");
        Theater z = new Theater("Ugh");


        assertEquals("Amex", t.name);
        assertEquals(0, t.showing.size());

        assertEquals("Regal", x.name);
        assertEquals(0, x.showing.size());

        assertEquals("Ugh", z.name);
        assertEquals(0, z.showing.size());
    }

    @Test
    public void testAddMovie() {
        Theater x = new Theater("Regal");

        x.addMovie("The Grinch");
        assertEquals(1, x.showing.size());

        x.addMovie("Harry Potter");
        assertEquals(2, x.showing.size());

        x.addMovie("The Hangover");
        assertEquals(3, x.showing.size());
    }

    @Test
    public void testRemoveMovie() {
        Theater t = new Theater("Ugh");
        t.addMovie("The Grinch");
        t.addMovie("Harry Potter");
        t.addMovie("The Hangover");
        t.addMovie("Movie1");
        t.addMovie("movie2");
        t.addMovie("movie3");

        t.removeMovie("The Grinch");
        assertEquals(5, t.showing.size());

        t.removeMovie("Movie1");
        assertEquals(4, t.showing.size());

        t.removeMovie("movie3");
        assertEquals(3, t.showing.size());
    }

    @Test
    public void testAddReview() {
        Theater n = new Theater("Ugh");

        assertEquals(0, n.reviews.size());

        n.addReview("Nope", "Gross", "dirtiest theater i've ever been to!", 2);
        List l = n.getReviews();

        assertTrue(l.size() >= 1);
        assertEquals("Review: Gross written by Nope, gives the location it talks about 2 stars.", l.get(0).toString());


    }

    @Test
    public void testToString() {
        Theater t = new Theater("Ugh");
        t.addMovie("Harry Potter");
        assertEquals("Ugh is showing: [Harry Potter]", t.toString());
        t.addMovie("The Grinch");
        assertEquals("Ugh is showing: [Harry Potter, The Grinch]", t.toString());
        t.addMovie("The Attack of the Killer Cheetoes");
        assertEquals("Ugh is showing: [Harry Potter, The Grinch, The Attack of the Killer Cheetoes]", t.toString());
    }
}