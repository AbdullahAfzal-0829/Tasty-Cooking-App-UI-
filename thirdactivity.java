package com.example.tasty;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class thirdactivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView nopeTextView = findViewById(R.id.nopeTextView);
        nopeTextView.setOnClickListener(v ->
        {
            Intent intent = new Intent(thirdactivity.this, fourthactivity.class);
            startActivity(intent);
        });
        TextView yesTextView = findViewById(R.id.yesTextView);
        yesTextView.setOnClickListener(v ->
        {
            Intent intent = new Intent(thirdactivity.this, fourthactivity.class);
            startActivity(intent);
        });
    }
}
