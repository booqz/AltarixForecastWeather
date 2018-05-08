package com.funcriper.weatherforecast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button goToActivity2;
    TextView textView;
    String txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        goToActivity2 = (Button) findViewById(R.id.goToActivity2);
        textView = (TextView) findViewById(R.id.textFromActivity2);

        txtName = getIntent().getStringExtra("text2");
        textView.setText(textView.getText().toString() + " " + txtName);
    }


    public void goToActivity2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("text1", editText.getText().toString());
        startActivity(intent);
    }
}
