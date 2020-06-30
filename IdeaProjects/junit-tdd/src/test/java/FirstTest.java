import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstTest {

    private int number;

    //establishing resources before EACH test run
    //    @Before

    @Before
    public void setUp(){
        number = 1;
    }

    @Test
    public void testNumberIsNot3(){
        number = 5;
        assertNotEquals(3, number);
    }

    @Test
    public void testNumberIs1(){

        assertEquals(1, number);
    }

    //repeat for every test method
    //test class is created
    //before method runs
    //test method runs

//
//
//    @Test
//    public void test2Is2(){
//        int number = 3;
//        assertEquals(3, number);
//        assertEquals(2, number);
//        assertEquals(4, number);
//    }
//
//    @Test
//    public void testIfCompanyNameIsEquals() {
//        String expected = "Codeup";
//        String actual = "Codeup";
//
//        //including error like message
//        assertEquals("Two strings NOT equal", expected, actual); // case sensitive
//    }
//
//    @Test
//    public void testIfChangeIsCorrect() {
//        //object version of primitive type when it is uppercase
//        Double price = 10.0;
//        Double discount = 4.5;
//
//        // When you're using floating points values a third parameter is required (Delta) which represents a positive margin of error of decimals.
//        //represents the amount of difference or discrepancy -- delta allows wiggle room?
//        assertEquals(5.5, price - discount, 0);
//        assertEquals(5.1, price - discount, 0.5);
//        assertNotEquals(4.9, price - discount, 0.5);
//    }
//
//    @Test
//    public void testIfObjectsAreDifferent() {
//        Object dog = new Object();
//        Object sheep = new Object();
//        Object clonnedSheep = sheep;
//
//        assertNotSame(sheep, dog); //are these two objects not the same?
//        assertSame(sheep, clonnedSheep); //are the reference ids the same here?
//    }
//
//    @Test
//    public void testIfArrayEquals() {
//        char[] expected = {'J','u','n','i','t'}; //array literal
//        char[] actual = "Junit".toCharArray();
//
//        assertArrayEquals(expected, actual); //do these two arrays have the same value? same number of elements?
//    }
//
//    @Test
//    public void testIfGreaterOrLesserThanWorks() {
//
//        boolean learningTDD = true;
//
//        assertTrue(learningTDD);
//        assertTrue("5 is greater than 4", 5 > 4);
//        assertFalse("5 is not greater than 6", 5 > 6);
//    }
//
//
//
}
