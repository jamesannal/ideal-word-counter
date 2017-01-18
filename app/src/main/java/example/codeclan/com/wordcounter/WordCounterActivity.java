package example.codeclan.com.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import example.codeclan.com.wordcounter.R;

/**
 * Created by user on 17/01/2017.
 */
public class WordCounterActivity extends AppCompatActivity{

    EditText insertPhrase;
    Button getButton;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertPhrase = (EditText) findViewById(R.id.insert_phrase);
        getButton = (Button)findViewById(R.id.press_button);
        show = (TextView)findViewById(R.id.result_box);
        Log.d(getClass().toString(), "onCreate was created");
    }

    public void showResult(View button){

        WordCounter wordage = new WordCounter(insertPhrase.getText().toString());
        show.setText(wordage.userReplyAsString());
    }
}
