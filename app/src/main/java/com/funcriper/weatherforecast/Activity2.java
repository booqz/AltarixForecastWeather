package com.funcriper.weatherforecast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText2;
    String txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        button = (Button)findViewById(R.id.goToActivity1);
        textView = (TextView)findViewById(R.id.textFromActivity1);
        editText2 = (EditText)findViewById(R.id.editText2);


        txtName = getIntent().getStringExtra("text1");
        textView.setText(textView.getText().toString() + " " + txtName);
    }

    public void goToActivity1(View view) {
        Intent intent = new Intent(Activity2.this, MainActivity.class);
        intent.putExtra("text2", editText2.getText().toString());
        startActivity(intent);
    }
}
