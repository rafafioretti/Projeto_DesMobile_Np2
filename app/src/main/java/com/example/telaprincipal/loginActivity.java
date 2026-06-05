package com.example.telaprincipal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {

    EditText email, senha;
    Button botaoEntrar, botaoCadastrar;

    String senhaCadastrada, emailCadastrado, senhaDigitada, emailDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        senha = findViewById(R.id.senha);
        email = findViewById(R.id.email);
        botaoEntrar = findViewById(R.id.botaoEntrar);
        botaoCadastrar = findViewById(R.id.botaoCadastrar);

        senhaCadastrada = getIntent().getStringExtra("senha");
        emailCadastrado = getIntent().getStringExtra("email");

        botaoCadastrar.setOnClickListener(v -> {
            Intent intent = new Intent(loginActivity.this, cadastroActivity.class);
            startActivity(intent);
        });

        botaoEntrar.setOnClickListener(v -> {

            emailDigitado = email.getText().toString();
            senhaDigitada = senha.getText().toString();

            if(emailDigitado.isEmpty()){
                email.setError("Digite seu Email.");
            }
            else if(senhaDigitada.isEmpty()){
                senha.setError("Digite sua senha.");
            }

            if (emailDigitado.equals(emailCadastrado) &&
                    senhaDigitada.equals(senhaCadastrada)) {

                Intent intent = new Intent(loginActivity.this, MainActivity.class);
                startActivity(intent);

            } else {
                Toast.makeText(loginActivity.this, "Email ou senha incorretos, tente novamente.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}