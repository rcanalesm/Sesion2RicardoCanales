package com.ricardocanales.sesion2ricardocanales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public Button myboton1next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.myTextView1);
        textView.setText(getResources().getString(R.string.stringText1activity));

        myboton1next = findViewById(R.id.button1next);
        myboton1next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Sample","Click en el botón myboton1next...");
                startActivity(new Intent(MainActivity.this,Activity2.class));
            }
        });

        new SimplifyManager().setOwner(getLifecycle());
    }

}