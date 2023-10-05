package com.example.atividade_avaliativa_n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivityCadastro extends AppCompatActivity {

    //  declarando variáveis globais
    private TextView tv5;
    private TextView tv3;
    private EditText edit;
    private EditText editEmail;
    private TextView tv6;
    private TextView tv7;
    private EditText edit2;
    private TextView tv8;
    private EditText edit3;
    private TextView tv9;
    private Spinner spinner1;
    private Button btnSalvar;

    private ArrayList<AtividadeComplementar> listaAtividades = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastro);

        //  vinculando variaveis criadas a elementos do xml

        tv5 = findViewById(R.id.textView5);
        tv3 = findViewById(R.id.textView3);
        edit = findViewById(R.id.editTextText);
        editEmail = findViewById(R.id.editTextTextEmailAddress);
        tv6 = findViewById(R.id.textView6);
        tv7 = findViewById(R.id.textView7);
        edit2 = findViewById(R.id.editTextText2);
        tv8 = findViewById(R.id.textView8);
        edit3 = findViewById(R.id.editTextText3);
        tv9 = findViewById(R.id.textView9);
        spinner1 = findViewById(R.id.spinner);
        btnSalvar = findViewById(R.id.button);

        //criando e populando Arraylist com a opções do spinner
        ArrayList<String> dadosSpinner = new ArrayList<>();
        dadosSpinner.add("Categoria 1 – Cursos");
        dadosSpinner.add("Categoria 2 – Projetos");
        dadosSpinner.add("Categoria 3 – Pesquisas");

        //criando Arrayadapter para exibir uma lista de atividades complementares na MainActivityConsulta
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, dadosSpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Recuperar os dados do formulário
                String nome = edit.getText().toString();
                String email = editEmail.getText().toString();
                String descricao = edit2.getText().toString();
                String cargaHoraria = edit3.getText().toString();
                String categoria = spinner1.getSelectedItem().toString();

                // Criar um objeto AtividadeComplementar com os dados do formulário
                AtividadeComplementar atividade = new AtividadeComplementar(nome, email, descricao, cargaHoraria, categoria);

                // Adicionar o objeto na lista de atividades
                listaAtividades.add(atividade);

                // Exibir um Toast informando que os dados foram salvos
                Toast.makeText(MainActivityCadastro.this, "Dados salvos com sucesso!", Toast.LENGTH_SHORT).show();

                // Voltar à tela inicial, enviando a lista de atividades cadastradas via Intent
                Intent intent = new Intent(MainActivityCadastro.this, MainActivity.class);
                intent.putExtra("listaAtividades", listaAtividades);
                startActivity(intent);


            }
        });
    }
}