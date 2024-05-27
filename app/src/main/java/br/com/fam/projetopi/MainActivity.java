package br.com.fam.projetopi;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Mercado do Bairro - Categorias");

        List<String> categorias = new ArrayList<>(
                Arrays.asList("Promoções", "Frescos", "Secos e Enlatados", "Produtos Congelados",
                        "Bebidas", "Lanches e Doces", "Higiene Pessoal", "Limpeza", "Pets",
                        "Panificação", "Confeitaria")
        );

        ListView listaCategorias = findViewById(R.id.activity_main_list_categorias);
        listaCategorias.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                categorias));
    }
}