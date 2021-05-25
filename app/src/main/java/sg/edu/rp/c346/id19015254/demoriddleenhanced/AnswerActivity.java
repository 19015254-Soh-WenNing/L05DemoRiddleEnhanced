package sg.edu.rp.c346.id19015254.demoriddleenhanced;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Queue;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String qn = intentReceived.getStringExtra("Question");
        tvAnswer.setText(qn);
    }
}