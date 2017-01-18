package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/01/2017.
 */
public class WordCounterTest {


    WordCounter wordage;

    @Before
    public void before(){
        wordage = new WordCounter("Jump pogo pogo pogo pogo pogo pogo pogo bounce pogo pogo pogo pogo pogo pogo pogo down pogo pogo pogo up pogo pogo pogo jump pogo bounce pogo up pogo down");
    }


    @Test
    public void canGetWords() {
        assertEquals("Jump pogo pogo pogo pogo pogo pogo pogo bounce pogo pogo pogo pogo pogo pogo pogo down pogo pogo pogo up pogo pogo pogo jump pogo bounce pogo up pogo down", wordage.userReply());
    }

    @Test
    public void canCountWords(){
        assertEquals(31, wordage.countWords("Jump pogo pogo pogo pogo pogo pogo pogo bounce pogo pogo pogo pogo pogo pogo pogo down pogo pogo pogo up pogo pogo pogo jump pogo bounce pogo up pogo down"));
    }

    @Test
    public void canChangePhrase(){
        wordage.addNewPhrase("Unannounced twister games players with no names they line up double quick but just one pogo stick");
        assertEquals("Unannounced twister games players with no names they line up double quick but just one pogo stick", wordage.userReply());
    }

    @Test
    public void canReturnToUser() {
        assertEquals("Your phrase is 31 words long. Congrats!", wordage.userReplyAsString());
    }

//    @Test
//    public void canCountIndividualWords() {
//        ass
//    }
}