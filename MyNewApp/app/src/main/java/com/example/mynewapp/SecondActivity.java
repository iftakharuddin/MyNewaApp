package com.example.mynewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = findViewById(R.id.editTextId);
        button = findViewById(R.id.secondButtonId);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String string = editText.getText().toString();
        Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
        intent.putExtra("key", string );

        setResult(1, intent);
        finish();

    }
}
