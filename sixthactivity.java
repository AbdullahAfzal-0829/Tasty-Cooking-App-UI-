package com.example.tasty;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sixthactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sixthactivity);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton discoverButton = findViewById(R.id.discoverButton);
        ImageButton communityButton = findViewById(R.id.communityButton);
        ImageButton profileButton = findViewById(R.id.profileButton);


        discoverButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("CommitTransaction")
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, discoverfragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("discoverFragment")
                        .commit();
            }
        });

        communityButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("CommitTransaction")
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, communityfragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("communityFragment")
                        .commit();
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("CommitTransaction")
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, profilefragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("profileFragment")
                        .commit();
            }
        });
    }
}
