package fernandohenry.pokemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText etIdPokemon;
    private TextView tvNome;
    private TextView tvAbilidade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etIdPokemon = (EditText)findViewById(R.id.etIdPokemon);
        tvNome = (TextView)findViewById(R.id.tvNome);
        tvAbilidade = (TextView)findViewById(R.id.tvAbilidade);
    }

    public void pesquisar(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://pokeapi.co")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PokemonService service = retrofit.create(PokemonService.class);

        service.buscarPokemon(etIdPokemon.getText().toString())
                .enqueue(new Callback<Pokemon>() {
                    @Override
                    public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                        tvNome.setText(response.body().getName());
                        StringBuilder sb = new StringBuilder();
                        for(Abilities abilities : response.body().getAbilities()) {
                            sb.append(abilities.getAbility().getName());
                            sb.append("\n");
                        }
                        tvAbilidade.setText(sb.toString());
                    }

                    @Override
                    public void onFailure(Call<Pokemon> call, Throwable t) {

                    }
                });

    }
}
