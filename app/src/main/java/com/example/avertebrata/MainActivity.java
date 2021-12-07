package com.example.avertebrata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {

    ImageButton btnKucing,btnAnjing,btnMonyet;
    public static final String JENIS_GALERI_KEY="JENIS_GALERI";
    Button profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnMonyet = findViewById(R.id.btn_buka_ras_monyet);
        profil = findViewById(R.id.dialog_button);
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
        btnMonyet.setOnClickListener(view -> bukaGaleri("Monyet"));
        profil.setOnClickListener(view -> bukaBiodataActivity());

    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    private void bukaBiodataActivity(){
        Log.d("MAIN","Buka Activity biodata");
        Intent intent = new Intent(this, BiodataActivity.class);
        startActivity(intent);
    }
}