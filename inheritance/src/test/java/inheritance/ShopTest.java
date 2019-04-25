package inheritance;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testShopConstructor() {
        Shop s = new Shop("Nike", "We sell shoes, active wear, and other sports equipment.", 3);

        assertTrue(s != null);
        assertEquals("Nike", s.name);
        assertEquals(3, s.price);
    }

    @Test
    public void testToString() {
        Shop s = new Shop("Nike", "We sell shoes, active wear, and other sports equipment.", 3);
        Shop q = new Shop("Big 5", "We sell anything sporty you can think of!", 2);
        Shop z = new Shop("Ross", "Anything you can think of; that's what we sell. If slightly damaged.", 2);

        assertEquals("Nike is a shop that averages a 3 out of 5 price.", s.toString());
        assertEquals("Big 5 is a shop that averages a 2 out of 5 price.", q.toString());
        assertEquals("Ross is a shop that averages a 2 out of 5 price.", z.toString());
    }

    @Test
    public void testAddReview() {
        Shop n = new Shop("Nike", "We sell shoes, active wear, and other sports equipment.", 3);

        assertTrue(n.reviews.size() == 0);

        n.addReview("Nope", "Impossible", "Couldn't find what I needed and workers were unhelpful.", 1);
        List l = n.getReviews();

        assertTrue(l.size() >= 1);
        assertEquals("Review: Impossible written by Nope, gives the location it talks about 1 stars.", l.get(0).toString());

    }

}