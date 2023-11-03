package com.example.p2p10inflar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class Principal extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Principal.this.PersonalizaToast();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Principal.this.PersonalizaToast2();}
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Principal.this.PersonalizaToast3();}
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Principal.this.PersonalizaToast4();}
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Principal.this.PersonalizaToast5();}
        });
    }

    private void PersonalizaToast(){
        LayoutInflater l = this.getLayoutInflater();
        View vi = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));

        ImageView imagen = vi.findViewById(R.id.img);
        Glide.with(Principal.this).load("https://fotosdememes.b-cdn.net/wp-content/uploads/2021/09/Bienvenidos-al-Himalaya.jpg").into(imagen);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.END, 10,700);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(vi);
        toast.show();
    }
    private void PersonalizaToast2(){
        LayoutInflater l = this.getLayoutInflater();
        View vi = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));

        TextView texto = vi.findViewById(R.id.texto);
        texto.setText("Mensaje 2");

        ImageView imagen = vi.findViewById(R.id.img);
        Glide.with(Principal.this).load("https://previews.123rf.com/images/aprillrain/aprillrain2212/aprillrain221200638/196354278-imagen-de-caricatura-de-un-astronauta-sentado-en-una-luna-ilustraci%C3%B3n-de-alta-calidad.jpg").into(imagen);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 10,700);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(vi);
        toast.show();
    }

    private void PersonalizaToast3(){
        LayoutInflater l = this.getLayoutInflater();
        View vi = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));

        TextView texto = vi.findViewById(R.id.texto);
        texto.setText("Mensaje 3");

        ImageView imagen = vi.findViewById(R.id.img);
        Glide.with(Principal.this).load("https://www.mundodeportivo.com/us/files/content_image_mobile_filter/uploads/2023/11/01/65430aa64bddc.jpeg").into(imagen);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 10,700);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(vi);
        toast.show();

    }

    private void PersonalizaToast4(){
        LayoutInflater l = this.getLayoutInflater();
        View vi = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));

        TextView texto = vi.findViewById(R.id.texto);
        texto.setText("Mensaje 4");

        ImageView imagen = vi.findViewById(R.id.img);
        Glide.with(Principal.this).load("https://pm1.aminoapps.com/6856/224eb65fb4f51a98d024e0e618cd65243fe56166v2_hq.jpg").into(imagen);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 10,700);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(vi);
        toast.show();


    }

    private void PersonalizaToast5(){
        LayoutInflater l = this.getLayoutInflater();
        View vi = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));

        TextView texto = vi.findViewById(R.id.texto);
        texto.setText("Mensaje 5");

        ImageView imagen = vi.findViewById(R.id.img);
        Glide.with(Principal.this).load("https://cdn.primordiagamers.com/monthly_2023_03/large.nissan-skyline-gt-r-nissan-skyline-gt-r-r34-car-vehicle-wallpaper-c9e028ad01ca8d2b1617d8afc041f6cd.jpg.29e4747aa672c556a9fad7bba3b5ee88.jpg").into(imagen);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 10,700);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(vi);
        toast.show();


    }
}