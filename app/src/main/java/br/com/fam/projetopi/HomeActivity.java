package br.com.fam.projetopi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_promos);
        setTitle("      Mercado do Bairro - Promoções");

        List<String> promocoes = new ArrayList<>(
                Arrays.asList("Arroz branco Camil 5kg", "Café 3 Corações trad 500g", "Ovos branco c/12",
                        "Presunto Sadia 100g", "Linguiça Pernil Seara 600g", "Alface América La Vita 250g",
                        "Licor 43 Diego Zamora 700ml", "Pack YoPRO Chocolate com 12 Unidades de 250ml",
                        "Kit Presente Hidromel Philip Mead - 500ml (Traditional + Red Fruits)",
                        "3 garrafas de Whisky Johnnie Walker 12 anos, Black Label , 750ml",
                        "Kit Cerveja Paulistania - 2 gfas 600 ml Marco Zero + 1 Copo 300 ml Paulistânia 600ML",
                        "Pasta de Amendoim Naked Nuts com Chocolate Branco 300g ")
        );

        GridView listaPromocoes = findViewById(R.id.activity_home_promos);
        listaPromocoes.setAdapter(new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, promocoes
        ));

        Button botaoMenu = findViewById(R.id.activity_home_menu);
        botaoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });

    }
}
