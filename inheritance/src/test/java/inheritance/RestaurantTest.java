package inheritance;

import org.junit.Test;

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

}