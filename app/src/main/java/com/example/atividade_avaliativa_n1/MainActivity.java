package com.example.atividade_avaliativa_n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //  declarando variáveis globais

    TextView tv1, tv2;
    Button btn1, btn2;

    ArrayList<AtividadeComplementar> listaAtividades = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  vinculando variaveis criadas a elementos do xml

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        // Obtendo a lista de atividades complementares da MainActivityCadastro
        if (getIntent() != null && getIntent().getSerializableExtra("listaAtividades") != null) {
            listaAtividades = (ArrayList<AtividadeComplementar>) getIntent().getSerializableExtra("listaAtividades");
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.button1) {
            // redireciona para a tela 2
            Intent intent1 = new Intent(MainActivity.this, MainActivityCadastro.class);
            startActivity(intent1);
        } else if (view.getId() == R.id.button2) {
            // redireciona para a tela 3
            Intent intent2 = new Intent(MainActivity.this, MainActivityConsulta.class);
            //envia o Arraylist com os dados cadastrados na tela 2
            intent2.putExtra("listaAtividades", listaAtividades);
            startActivity(intent2);
        }
    }
}