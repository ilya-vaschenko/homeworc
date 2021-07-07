package com.example.homework1_android_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button2).setOnClickListener(v -> {
            Toast.makeText(this, "Привет!!!", Toast.LENGTH_SHORT).show();
        });
    }

}

/* EMS - это ширина буквы M в заданном размере английского шрифта.
         Таким образом, 2em в два раза больше ширины буквы M в данном шрифте.
         Для неанглийского шрифта это ширина самой широкой Буквы в этом шрифте.
         Этот размер ширины в пикселях отличается от размера ширины M в английском шрифте но это все еще 1em.
 */