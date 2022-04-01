package level6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HowManyPagesInABookTest {

    @Test
    public void testSample() {
        assertEquals(  5, HowManyPagesInABook.amountOfPages(5));
        assertEquals( 17, HowManyPagesInABook.amountOfPages(25));
        assertEquals(401, HowManyPagesInABook.amountOfPages(1095));
        assertEquals( 97, HowManyPagesInABook.amountOfPages(185));
        assertEquals(256, HowManyPagesInABook.amountOfPages(660));
    }

}