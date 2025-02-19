package co.edu.unipiloto.beeradviser;

import static co.edu.unipiloto.beeradviser.BeerExpert.getBrands;
import static co.edu.unipiloto.beeradviser.DogExpert.getPets;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

/*
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
*/
public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

        }

    public void onClickFindBeer(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf((color.getSelectedItem()));
        List<String> lista = getBrands(beerType);
        String resultados = String.join("\n", lista);
        brands.setText(resultados);
    }

    public void onClickFindDog(View view){
        TextView brands = (TextView) findViewById(R.id.pets);
        Spinner raza = (Spinner) findViewById(R.id.mascota);
        String breedType = String.valueOf((raza.getSelectedItem()));
        List<String> lista = getPets(breedType);
        String resultados = String.join("\n", lista);
        brands.setText(resultados);
    }

}