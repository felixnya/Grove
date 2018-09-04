package Deck.Cards;
import Deck.Cards.Effects.SpellEffect;
import Deck.Cards.SpellCard.SpellCard;
import Deck.Cards.SpellCard.SpellElement;
import Deck.Cards.SpellCard.SpellType;
import java.util.ArrayList;

/**
 *
 * @author jack0237
 */
public class WaterCards {

    private ArrayList<SpellCard> waterDeck = new ArrayList<>();

    public ArrayList<SpellCard> catalogCards() {

        waterDeck.add(new SpellCard(2, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>(), "Storm Cloud", 3));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Boil", 3));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Drown", 3));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Crushing Force", 3));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Ice Block", 3));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Healing Waters", 3));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Strip Flesh", 4));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Tidal Push", 4));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Sea Hags Wisdom", 0));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Gacious Bubbles", 3));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Mists", 1));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Sirens Call", 0));
        waterDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.WATER, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Coral Bolt", 3));

        return waterDeck;
    }
}
