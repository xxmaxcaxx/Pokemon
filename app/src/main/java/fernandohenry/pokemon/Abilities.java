package fernandohenry.pokemon;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 27/10/2017.
 */

public class Abilities {

    private int slot;
    @SerializedName(value = "is_hidden")
    private boolean isHidden;
    private Ability ability;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}
