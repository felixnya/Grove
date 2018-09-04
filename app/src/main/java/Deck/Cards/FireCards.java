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
public class FireCards {

    private ArrayList<SpellCard> fireDeck = new ArrayList<>();

    public ArrayList<SpellCard> catalogCards() {

        fireDeck.add(new SpellCard(2, SpellType.DAMAGE, SpellElement.FIRE, 3, new ArrayList<SpellEffect>(), "Blind", 3));
        fireDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.FIRE, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Blistering Flesh", 3));
        fireDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.FIRE, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Smoke Cloud", 3));
        fireDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.FIRE, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Soul Fire", 3));
        fireDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.FIRE, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Heat Purge", 3));
        fireDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.FIRE, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Flesh To Char", 3));
        fireDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.FIRE, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Boiling Blood", 3));
        fireDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.FIRE, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Blaze The Trail", 3));

        return fireDeck;
    }
}
