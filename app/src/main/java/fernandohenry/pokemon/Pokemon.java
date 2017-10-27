package fernandohenry.pokemon;

import java.util.List;

/**
 * Created by logonrm on 27/10/2017.
 */

public class Pokemon {

    private String name;
    private List<Abilities> abilities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Abilities> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Abilities> abilities) {
        this.abilities = abilities;
    }
}
