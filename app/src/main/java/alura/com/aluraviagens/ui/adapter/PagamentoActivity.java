package alura.com.aluraviagens.ui.adapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.math.BigDecimal;

import alura.com.aluraviagens.MoedaUtil;
import alura.com.aluraviagens.R;
import alura.com.aluraviagens.ResumoPacoteActivity;
import alura.com.aluraviagens.model.Pacote;

public class PagamentoActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Pagamento de pacote";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        setTitle(TITULO_APPBAR);

        Intent intent = new Intent (this, ResumoCompraActivity.class);
        startActivity(intent);

    }


}