package com.example.telalogin_quickdeal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaLogin extends AppCompatActivity {
Button botaologar;

EditText campoemail;

EditText camposenha;

Button botao_naocadastro;

Button botao_esquecisenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela_login);

        botaologar = findViewById(R.id.btn_continuar);

        campoemail = findViewById(R.id.edt_email);

        camposenha = findViewById(R.id.edt_senha);

        botao_naocadastro = findViewById(R.id.btn_naotenhocadastro);

        botao_esquecisenha = findViewById(R.id.btn_esqueciasenha);

        botao_naocadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mudartela = new Intent(TelaLogin.this, TelaCadastro.class);
            startActivity(mudartela);
            }
        });

        botao_esquecisenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mudartela = new Intent(TelaLogin.this, TelaSenha.class);
            startActivity(mudartela);
            }
        });

        botaologar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mudartela = new Intent(TelaLogin.this, TelaInicial.class);
            startActivity(mudartela);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}