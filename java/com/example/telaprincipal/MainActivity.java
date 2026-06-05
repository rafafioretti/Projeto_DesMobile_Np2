package com.example.telaprincipal;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText campoCapital, campoMeses, campoTaxa;
    Button botaoCalcular;
    TextView resultadoTexto;



    double capital;
    int tempoMeses;
    double taxaJuros;
    double montanteFinal;

    Spinner spinnerJuros;

    String tipoJurosSelecionado = "Juros Simples";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        campoCapital = findViewById(R.id.capital);
        campoMeses = findViewById(R.id.tempoMeses);
        campoTaxa = findViewById(R.id.taxaJuros);
        resultadoTexto = findViewById(R.id.montanteFinal);
        botaoCalcular = findViewById(R.id.botaoCalcular);
        spinnerJuros = findViewById(R.id.spinnerJuros);

        ImageView infoCapital = findViewById(R.id.infoCapital);
        ImageView infoTaxaJuros = findViewById(R.id.infoTaxaJuros);
        ImageView infoPeriodo = findViewById(R.id.infoPeriodo);
        ImageView infoTipo = findViewById(R.id.infoTipoJuros);

        infoCapital.setOnClickListener(v ->{
            Toast.makeText(this, "Valor inicial a ser investido.", Toast.LENGTH_SHORT).show();
        });

        infoTaxaJuros.setOnClickListener(v -> {
            Toast.makeText(this, "Taxa de juros mensal (%). Percentual de ganho por mês.", Toast.LENGTH_SHORT).show();
        });

        infoPeriodo.setOnClickListener(v -> {
            Toast.makeText(this, "Tempo do investimento em meses.", Toast.LENGTH_SHORT).show();
        });

        infoTipo.setOnClickListener(v -> {
            Toast.makeText(this, "Escolha entre juros simples ou compostos.", Toast.LENGTH_SHORT).show();
        });

        String[] opcoes = {
                "Juros Simples",
                "Juros Compostos"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                opcoes
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJuros.setAdapter(adapter);

        botaoCalcular.setOnClickListener(v -> {

            if (campoCapital.getText().toString().isEmpty()) {
                campoCapital.setError("Digite o Capital");
                return;
            }
            if (campoMeses.getText().toString().isEmpty()) {
                campoMeses.setError("Digite os meses");
                return;
            }
            if (campoTaxa.getText().toString().isEmpty()) {
                campoTaxa.setError("Digite a taxa");
                return;
            }

            capital = Double.parseDouble(campoCapital.getText().toString().replace(",", "."));
            tempoMeses = Integer.parseInt(campoMeses.getText().toString());
            taxaJuros = Double.parseDouble(campoTaxa.getText().toString().replace(",", "."));

            taxaJuros = taxaJuros / 100;

            String tipoSelecionado = spinnerJuros.getSelectedItem().toString();

            if (tipoSelecionado.equals("Juros Simples")) {
                montanteFinal = capital * (1 + (taxaJuros * tempoMeses));
            } else {
                montanteFinal = capital * Math.pow((1 + taxaJuros), tempoMeses);
            }

            resultadoTexto.setText("Montante Final: R$ " + String.format("%.2f", montanteFinal));
        });
    }
}
