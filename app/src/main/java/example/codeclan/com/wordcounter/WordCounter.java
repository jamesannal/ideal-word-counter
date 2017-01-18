package example.codeclan.com.wordcounter;


/**
 * Created by user on 17/01/2017.
 */
public class WordCounter {
    String wordage;

    public WordCounter(String wordage) {
        this.wordage = wordage;
    }

    public String userReply() {
        return this.wordage;
    }

    public int countWords(String wordage){
        return wordage.split(" ").length;
    }

    public void addNewPhrase(String phrase) {
        this.wordage = phrase;
    }

    public int countTotalWords(){
        addNewPhrase(wordage);
        return wordage.split(" ").length;
    }

    public String userReplyAsString(){
        int number = countTotalWords();
        return "Your phrase is " + number + " words long. Congrats!";
    }



}
