package com.example.ogrencitakip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println();
    }

    public void hesapla(View view) {
        EditText editText = findViewById(R.id.sinav1);
        String message = editText.getText().toString();
        if (message.isEmpty()) {
            Toast.makeText(this, "Grade cannot be empty. FILL IT!!!!!!!!!!!", Toast.LENGTH_SHORT).show();
            return;
        }

        int sinav1 = Integer.parseInt(message);
        if (sinav1 > 100) {
            Toast.makeText(this, "Grade cannot be higher than 100", Toast.LENGTH_SHORT).show();
            return;
        }


        editText = findViewById(R.id.sinav2);
        message = editText.getText().toString();

        if (message.isEmpty()) {
            Toast.makeText(this, "Grade cannot be empty. FILL IT!!!!!!!!!!!", Toast.LENGTH_SHORT).show();
            return;
        }
        int sinav2 = Integer.parseInt(message);

        if (sinav2 > 100) {
            Toast.makeText(this, "Grade cannot be higher than 100", Toast.LENGTH_SHORT).show();
            return;
        }

        editText = findViewById(R.id.sozlu);
        message = editText.getText().toString();
        if (message.isEmpty()) {
            Toast.makeText(this, "Grade cannot be empty. FILL IT!!!!!!!!!!!", Toast.LENGTH_SHORT).show();
            return;
        }
        int sozlu = Integer.parseInt(message);

        if (sozlu > 100) {
            Toast.makeText(this, "Grade cannot be higher than 100", Toast.LENGTH_SHORT).show();
            return;
        }


        editText = findViewById(R.id.proje);
        message = editText.getText().toString();
        if (message.isEmpty()) {
            Toast.makeText(this, "Grade cannot be empty. FILL IT!!!!!!!!!!!", Toast.LENGTH_SHORT).show();
            return;
        }
        double proje = (double) Integer.parseInt(message);

        if (proje > 100) {
            Toast.makeText(this, "Grade cannot be higher than 100", Toast.LENGTH_SHORT).show();
            return;
        }

        editText = findViewById(R.id.devamsizlik);
        message = editText.getText().toString();
        if (message.isEmpty()) {
            Toast.makeText(this, "Grade cannot be empty. FILL IT!!!!!!!!!!!", Toast.LENGTH_SHORT).show();
            return;
        }
        int devamsizlik = Integer.parseInt(message);

        double sonuc = (sinav1 + sinav2 + sozlu + proje) / 4;

        if (devamsizlik > 2) {
            TextView sonucTv = findViewById(R.id.sonucTv);
            sonucTv.setText("Puanın 1");
            sonucTv.setVisibility(View.VISIBLE);
        } else if (sonuc > 0 & sonuc < 45) {
            TextView sonucTv = findViewById(R.id.sonucTv);
            sonucTv.setText("Puanın 1");
            sonucTv.setVisibility(View.VISIBLE);
        } else if (sonuc > 45 & sonuc < 55) {
            TextView sonucTv = findViewById(R.id.sonucTv);
            sonucTv.setText("Puanın 2");
            sonucTv.setVisibility(View.VISIBLE);
        } else if (sonuc > 55 & sonuc < 70) {
            TextView sonucTv = findViewById(R.id.sonucTv);
            sonucTv.setText("Puanın 3");
            sonucTv.setVisibility(View.VISIBLE);
        } else if (sonuc > 70 & sonuc < 85) {
            TextView sonucTv = findViewById(R.id.sonucTv);
            sonucTv.setText("Puanın 4");
            sonucTv.setVisibility(View.VISIBLE);
        } else if (sonuc > 85 & sonuc < 101) {
            TextView sonucTv = findViewById(R.id.sonucTv);
            sonucTv.setText("Puanın 5");
            sonucTv.setVisibility(View.VISIBLE);
        }


    }
}
