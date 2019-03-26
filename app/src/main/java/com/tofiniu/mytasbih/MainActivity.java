package com.tofiniu.mytasbih;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textDzikir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitung(View view){
//        PANGGIL TEXTVIEW
        textDzikir = findViewById(R.id.textDzikir);

//        AMBIL NILAI DARI TEXTVIEW
        String dzikirString = textDzikir.getText().toString();

//        UBAH NILAI DARI TEXTVIEW MENJADI INTEGER
        int dzikir = Integer.parseInt(dzikirString);

//        OPERASI ARITMATIKA PADA NILAI TEXTVIEW TADI
//        dzikir = dzikir + 1;
//        dzikir += 1;
        dzikir++; //INCREMENT penambahan 1 angka

//        TAMPILKAN HASIL PERHITUNGAN (ARITMATIKA) KE TEXTVIEW
        textDzikir.setText(dzikir + "");
    }
}
