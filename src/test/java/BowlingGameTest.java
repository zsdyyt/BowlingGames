import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'Macx' at '17-5-10 下午3:18' with Gradle 3.2
 *
 * @author Macx, @date 17-5-10 下午3:18
 */
public class BowlingGameTest {
 
    @Test
    public void test_all_strike() throws Exception {
        String str2 = "X|X|X|X|X|X|X|X|X|X||XX";           //300
        assertEquals(new BowlingGame().getBowlingScore(str2), 300);

    }

    @Test
    public void test_second_spare() throws Exception {
        String str2 = "5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5";  //150
        assertEquals(new BowlingGame().getBowlingScore(str2), 150);

    }

    @Test
    public void test_second_miss() throws Exception {
        String str2 = "9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||";   //90
        assertEquals(new BowlingGame().getBowlingScore(str2), 90);


    }

    @Test
    public void test_other_situation() throws Exception {
        String str2 = "X|7/|9-|X|-8|8/|-6|X|X|X||81";      //167
        assertEquals(new BowlingGame().getBowlingScore(str2), 167);
 

    }
}
