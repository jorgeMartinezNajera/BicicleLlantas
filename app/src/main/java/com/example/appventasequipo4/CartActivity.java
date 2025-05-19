package com.example.appventasequipo4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    ArrayList<String> elementosseleccionados=new ArrayList<>();
    ArrayList<String> preciosseleccionados=new ArrayList<>();
    Double total=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_carrito);
        Button btnCompra = findViewById(R.id.btnCompra);
        //Mover datos a finCompra

        CheckBox sec1 = findViewById(R.id.seleccion1);
        sec1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Aeolus RSL TLR Road");
                    preciosseleccionados.add("$1999.0");
                    total+=1450.0;
                } else {
                    elementosseleccionados.remove("Aeolus RSL TLR Road");
                    preciosseleccionados.remove("$1999.0");
                    total+=0.0;
                }
            }
        });

        CheckBox sec2 = findViewById(R.id.seleccion2);
        sec2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Vallnord RSL XR TLR");
                    preciosseleccionados.add("$1499.00");
                    total+=999.0;
                } else {
                    elementosseleccionados.remove("Vallnord RSL XR TLR");
                    preciosseleccionados.remove("$1499.00");
                    total+=0.0;

                }
            }
        });

        CheckBox sec3 = findViewById(R.id.seleccion3);
        sec3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Galbraith RSL SE TLR");
                    preciosseleccionados.add("$1499.00");
                    total+=1678.0;

                } else {
                    elementosseleccionados.remove("Galbraith RSL SE TLR");
                    preciosseleccionados.remove("$1499.00");
                    total+=0.0;

                }
            }
        });

        CheckBox sec4 = findViewById(R.id.seleccion4);
        sec4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Brevard RSL SE TLR");
                    preciosseleccionados.add("$1499.00");
                    total+=1265.0;
                } else {
                    elementosseleccionados.remove("Brevard RSL SE TLR");
                    preciosseleccionados.remove("$1499.00");
                    total+=0.0;
                }
            }
        });

        CheckBox sec5 = findViewById(R.id.seleccion5);
        sec5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Montrose RSL XT TLR");
                    preciosseleccionados.add("$1499.00");
                    total+=2000.0;
                } else {
                    elementosseleccionados.remove("Montrose RSL XT TLR");
                    preciosseleccionados.remove("$1499.00");
                    total+=0.0;
                }
            }
        });

        CheckBox sec6 = findViewById(R.id.seleccion6);
        sec6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Sainte-Anne RSL XR TLR");
                    preciosseleccionados.add("$1499.00");
                    total+=983.0;

                } else {
                    elementosseleccionados.remove("Sainte-Anne RSL XR TLR");
                    preciosseleccionados.remove("$1499.00");
                    total+=0.0;
                }
            }
        });

        CheckBox sec7 = findViewById(R.id.seleccion7);
        sec7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Gunnison RSL XT TLR");
                    preciosseleccionados.add("$1499.00");
                    total+=1455.0;
                } else {
                    elementosseleccionados.remove("Gunnison RSL XT TLR");
                    preciosseleccionados.remove("$1499.00");
                    total+=0.0;
                }
            }
        });

        CheckBox sec8 = findViewById(R.id.seleccion8);
        sec8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Betasso RSL GX TLR");
                    preciosseleccionados.add("$1299.00");
                    total+=1234.0;
                } else {
                    elementosseleccionados.remove("Betasso RSL GX TLR");
                    preciosseleccionados.remove("$1299.00");
                    total+=0.0;
                }
            }
        });

        CheckBox sec9 = findViewById(R.id.seleccion9);
        sec9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Estuche GOTIDEAL");
                    preciosseleccionados.add("$1286.00");
                    total+=1286.0;
                } else {
                    elementosseleccionados.remove("Estuche GOTIDEAL");
                    preciosseleccionados.remove("$1286.00");
                    total+=0.0;
                }
            }
        });

        CheckBox sec10 = findViewById(R.id.seleccion10);
        sec10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Brevard Pro XR TLR");
                    preciosseleccionados.add("$1199.00");
                    total+=2500.0;
                } else {
                    elementosseleccionados.remove("Brevard Pro XR TLR");
                    preciosseleccionados.remove("$1199.00");
                    total+=0.0;
                }
            }
        });

        //Mover a finCompra
        btnCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CartActivity.this, finalCompra.class);
                i.putStringArrayListExtra("elementosSeleccionados", elementosseleccionados);
                i.putStringArrayListExtra("preciosseleccionados", preciosseleccionados);
                i.putExtra("total",total);
                startActivity(i);
            }

        });
    }
}
