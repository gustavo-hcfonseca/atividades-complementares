package com.example.atividade_avaliativa_n1;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivityConsulta extends AppCompatActivity {

    private ListView listViewAtividades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_consulta);

        // Obtendo a lista de atividades complementares da MainActivity
        ArrayList<AtividadeComplementar> listaAtividades = null;
        if (getIntent() != null && getIntent().getSerializableExtra("listaAtividades") != null) {
            listaAtividades = (ArrayList<AtividadeComplementar>) getIntent().getSerializableExtra("listaAtividades");
        }

        listViewAtividades = findViewById(R.id.listViewAtividades);

        // Criando um ArrayAdapter para exibir a lista de atividades na ListView
        ArrayAdapter<AtividadeComplementar> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaAtividades);
        listViewAtividades.setAdapter(adapter);
    }
}