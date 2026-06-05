package com.example.telaprincipal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class cadastroActivity extends AppCompatActivity {

    EditText senha, email, nomeUsuario;
    Button botaoCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro);

        senha = findViewById(R.id.senha);
        email = findViewById(R.id.email);
        nomeUsuario = findViewById(R.id.nomeUsuario);
        botaoCadastrar = findViewById(R.id.botaoCadastro);

        botaoCadastrar.setOnClickListener(v -> {

            String emailTexto = email.getText().toString();
            String senhaTexto = senha.getText().toString();
            String nome = nomeUsuario.getText().toString();

            if (nome.isEmpty()) {
                nomeUsuario.setError("Digite seu nome de usuário.");
                return;
            }

            if (emailTexto.isEmpty()) {
                email.setError("Digite o seu email.");
                return;
            }

            if (senhaTexto.isEmpty()) {
                senha.setError("Digite sua senha.");
                return;
            }

            Intent intent = new Intent(cadastroActivity.this, loginActivity.class);
            intent.putExtra("email", emailTexto);
            intent.putExtra("senha", senhaTexto);
            startActivity(intent);
            finish();
        });
    }
}