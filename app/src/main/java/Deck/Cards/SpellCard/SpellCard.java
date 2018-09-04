package Deck.Cards.SpellCard;

import Deck.Cards.Card;
import Deck.Cards.CardType;
import Deck.Cards.Effects.SpellEffect;
import java.util.ArrayList;
/**
 *
 * @author jack0237
 */
public class SpellCard extends Card {

    public SpellCard() {
    }

    public SpellCard(int cost) {
        this.cost = cost;
    }

    public SpellCard(int cost, SpellType type) {
        this.cost = cost;
        super.cardType = CardType.SPELL;
        this.spellType = type;
    }

    public SpellCard(int cost, SpellType type, SpellElement element, int range) {
        this.cost = cost;
        super.cardType = CardType.SPELL;
        this.spellType = type;
        this.element = element;
        this.range = range;
    }

    public SpellCard(int cost, SpellType type, SpellElement element, int damage, int range) {
        this.cost = cost;
        super.cardType = CardType.SPELL;
        this.spellType = type;
        this.element = element;
        this.damage = damage;
        this.range = range;
    }

    public SpellCard(int cost, SpellType type, SpellElement element, int damage, ArrayList<SpellEffect> effect, int range) {
        this.cost = cost;
        super.cardType = CardType.SPELL;
        this.spellType = type;
        this.element = element;
        this.damage = damage;
        this.effect = effect;
        this.range = range;
    }

    public SpellCard(int cost, SpellType type, SpellElement element, int damage, ArrayList<SpellEffect> effect, String name, int range) {
        this.cost = cost;
        super.cardType = CardType.SPELL;
        this.spellType = type;
        this.element = element;
        this.damage = damage;
        this.effect = effect;
        super.name = name;
        this.range = range;
    }

    public SpellCard(int cost, SpellType type, SpellElement element, int damage, ArrayList<SpellEffect> effect, String name, int range, String frontImage) {
        this.cost = cost;
        super.cardType = CardType.SPELL;
        this.spellType = type;
        this.element = element;
        this.damage = damage;
        this.effect = effect;
        super.name = name;
        super.frontImage = frontImage;
        this.range = range;
    }

    public SpellCard(int cost, SpellType type, SpellElement element, int damage, ArrayList<SpellEffect> effect, String name, int range, String frontImage, String backImage) {
        this.cost = cost;
        super.cardType = CardType.SPELL;
        this.spellType = type;
        this.element = element;
        this.damage = damage;
        this.effect = effect;
        super.name = name;
        super.frontImage = frontImage;
        super.backImage = backImage;
        this.range = range;
    }

    private int cost = 0;
    private SpellType spellType = null;
    private SpellElement element = null;
    private int damage = 0;
    private int range = 0;
    private ArrayList<SpellEffect> effect = new ArrayList<>();

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    private void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the type
     */
    public SpellType getType() {
        return getSpellType();
    }

    /**
     * @param type the type to set
     */
    private void setType(SpellType type) {
        this.setSpellType(getSpellType());
    }

    /**
     * @return the element
     */
    public SpellElement getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    private void setElement(SpellElement element) {
        this.element = element;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    private void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the effect
     */
    public ArrayList<SpellEffect> getEffect() {
        //      String effects = "";

//        for (int i = 0; i < effect.size(); i++) {
//            if (!effect.isEmpty()) {
//                if (i > 0) {
//                    effects += ", " + effect.get(i).name();
//                } else {
//                    effects += effect.get(i).name();
//                }
//
//            }
//
//        }
        return effect;
    }

    /**
     * @param effect the effect to set
     */
    private void setEffect(ArrayList<SpellEffect> effect) {
        this.effect = effect;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        super.name = name;
    }

    /**
     * @return the frontImage
     */
    public String getFrontImage() {
        return frontImage;
    }

    /**
     * @param frontImage the frontImage to set
     */
    private void setFrontImage(String frontImage) {
        this.frontImage = frontImage;
    }

    /**
     * @return the backImage
     */
    public String getBackImage() {
        return backImage;
    }

    /**
     * @param backImage the backImage to set
     */
    private void setBackImage(String backImage) {
        this.backImage = backImage;
    }

    /**
     * @return the spellType
     */
    public SpellType getSpellType() {
        return spellType;
    }

    /**
     * @param spellType the spellType to set
     */
    private void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }

    public String getString() {
        return "-----------------------------------------------------\nName:" + getName() + "\ncost: " + getCost() + "\ntype: " + getType().name() + "\nelement: "
                + getElement().name() + "\ndamage: " + getDamage() + "\neffect: " + getEffect() + "\n-----------------------------------------------------";
    }
}
