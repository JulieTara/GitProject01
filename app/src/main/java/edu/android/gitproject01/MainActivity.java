package edu.android.gitproject01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    
    private TextView textView;
    private Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i;
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textVeiw);
    }
}
