package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText eName=(EditText)findViewById(R.id.eName);
        Button bClick=(Button)findViewById(R.id.bClick);
        final TextView tName=(TextView)findViewById(R.id.tName);

        bClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tName.getText().toString().equals("")) {
                    tName.setText(eName.getText().toString());
                    tName.setText("Hello, " + eName.getText().toString());
                } else {
                    tName.setText("");
                }
            }
        });
    }
}