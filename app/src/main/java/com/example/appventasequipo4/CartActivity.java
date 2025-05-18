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
                    elementosseleccionados.add("Set 10 pinceles");
                    preciosseleccionados.add("$1450.0");
                    total+=1450.0;
                } else {
                    elementosseleccionados.remove("Set 10 pinceles");
                    preciosseleccionados.remove("$1450.0");
                    total+=0.0;
                }
            }
        });

        CheckBox sec2 = findViewById(R.id.seleccion2);
        sec2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Estuche de pinceles de cerda");
                    preciosseleccionados.add("$999.00");
                    total+=999.0;
                } else {
                    elementosseleccionados.remove("Estuche de pinceles de cerda");
                    preciosseleccionados.remove("$999.00");
                    total+=0.0;

                }
            }
        });

        CheckBox sec3 = findViewById(R.id.seleccion3);
        sec3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Estuche para pinceles Acuarela, oleo");
                    preciosseleccionados.add("$1678.00");
                    total+=1678.0;

                } else {
                    elementosseleccionados.remove("Estuche para pinceles Acuarela, oleo");
                    preciosseleccionados.remove("$1678.00");
                    total+=0.0;

                }
            }
        });

        CheckBox sec4 = findViewById(R.id.seleccion4);
        sec4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Set estuche y pinceles de viaje");
                    preciosseleccionados.add("$1265.00");
                    total+=1265.0;
                } else {
                    elementosseleccionados.remove("Set estuche y pinceles de viaje");
                    preciosseleccionados.remove("$1265.00");
                    total+=0.0;
                }
            }
        });

        CheckBox sec5 = findViewById(R.id.seleccion5);
        sec5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Estuche de cuero");
                    preciosseleccionados.add("$2000.00");
                    total+=2000.0;
                } else {
                    elementosseleccionados.remove("Estuche de cuero");
                    preciosseleccionados.remove("$2000.00");
                    total+=0.0;
                }
            }
        });

        CheckBox sec6 = findViewById(R.id.seleccion6);
        sec6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Estuche recargable");
                    preciosseleccionados.add("$983.00");
                    total+=983.0;

                } else {
                    elementosseleccionados.remove("Estuche recargable");
                    preciosseleccionados.remove("$983.00");
                    total+=0.0;
                }
            }
        });

        CheckBox sec7 = findViewById(R.id.seleccion7);
        sec7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Estuche azul");
                    preciosseleccionados.add("$1455.00");
                    total+=1455.0;
                } else {
                    elementosseleccionados.remove("Estuche azul");
                    preciosseleccionados.remove("$1455.00");
                    total+=0.0;
                }
            }
        });

        CheckBox sec8 = findViewById(R.id.seleccion8);
        sec8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elementosseleccionados.add("Estuche Artecho");
                    preciosseleccionados.add("$1234.00");
                    total+=1234.0;
                } else {
                    elementosseleccionados.remove("Estuche Artecho");
                    preciosseleccionados.remove("$1234.00");
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
                    elementosseleccionados.add("Caja de madera");
                    preciosseleccionados.add("$2500.00");
                    total+=2500.0;
                } else {
                    elementosseleccionados.remove("Caja de madera");
                    preciosseleccionados.remove("$2500.00");
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
