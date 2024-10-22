package com.example.puyuhku;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class onboarding1 extends AppCompatActivity {

    TextView descob1, btnLanjut1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_onboarding1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        descob1 = findViewById(R.id.tv_desc1);
        descob1.setText(Html.fromHtml("Temukan cara ternak yang lebih menyenangkan!<br/>Mulai ternak kapan saja.", Html.FROM_HTML_MODE_LEGACY));

        btnLanjut1 = findViewById(R.id.tb_next1);
        btnLanjut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), onboarding2.class);
                startActivity(i);
            }
        });
    }
}