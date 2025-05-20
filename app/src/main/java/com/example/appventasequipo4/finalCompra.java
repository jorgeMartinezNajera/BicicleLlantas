package com.example.appventasequipo4;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class finalCompra extends AppCompatActivity {
TextView resultado, resultado2,resultado3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_compra);


        ArrayList<String> elementosSeleccionados = getIntent().getStringArrayListExtra("elementosSeleccionados");
        ArrayList<String> preciosseleccionados = getIntent().getStringArrayListExtra("preciosseleccionados");

        StringBuilder stur = new StringBuilder();
        StringBuilder stur2 = new StringBuilder();

        resultado = (TextView) findViewById(R.id.resultado);
        for (int i = 0; i < elementosSeleccionados.size(); i++) {
            String elemento = elementosSeleccionados.get(i);
            stur.append(elemento).append("\n");
        }
        resultado.setText(stur.toString());
        resultado.setEnabled(false);

        resultado2 = (TextView) findViewById(R.id.resultado2);
        for (int i = 0; i < preciosseleccionados.size(); i++) {
            String elemento2 = preciosseleccionados.get(i);
            stur2.append(elemento2).append("\n");
        }

        resultado2.setText(stur2.toString());
        resultado2.setEnabled(false);

        resultado3 = (TextView) findViewById(R.id.resultado3);

        Bundle extras = getIntent().getExtras();
        Double tot = extras.getDouble("total");
        resultado3.setText("$"+tot.toString());

        // Botón de retroceso
        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(finalCompra.this, HomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
                startActivity(intent);
                finish();
            }
        });


    }
}

