package com.ricardocanales.sesion2ricardocanales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    public TextView textView;
    public Button myboton2back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView = findViewById(R.id.myTextView2);
        textView.setText(getResources().getString(R.string.stringText2activity));

        myboton2back = findViewById(R.id.button2back);
        myboton2back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Sample","Click en el botón myboton2back...");
                startActivity(new Intent(Activity2.this,MainActivity.class));
            }
        });

        new SimplifyManager().setOwner(getLifecycle());
    }
}