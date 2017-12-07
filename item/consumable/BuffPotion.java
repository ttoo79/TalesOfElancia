package item.consumable;

public abstract class BuffPotion extends Potion {

    public BuffPotion(String NAME, String DESCRIPTION, int BONUS_INTELLIGENCE, int BONUS_HEALTH, int BONUS_ARMOR, int BONUS_FORCE, int BONUS_AGILITY) {
        super(NAME, DESCRIPTION, BONUS_INTELLIGENCE, BONUS_HEALTH, BONUS_ARMOR, BONUS_FORCE, BONUS_AGILITY);
    }

    @Override
    public abstract void use();
}