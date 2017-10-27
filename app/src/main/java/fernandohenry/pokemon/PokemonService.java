package fernandohenry.pokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by logonrm on 27/10/2017.
 */

public interface PokemonService {
    @GET("/api/v2/pokemon/{id}")
    Call<Pokemon> buscarPokemon(
            @Path(value = "id")String id);
}
