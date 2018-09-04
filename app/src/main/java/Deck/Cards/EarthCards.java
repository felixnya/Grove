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
public class EarthCards {

    private ArrayList<SpellCard> earthDeck = new ArrayList<>();

    public ArrayList<SpellCard> catalogCards() {

        earthDeck.add(new SpellCard(2, SpellType.DAMAGE, SpellElement.EARTH, 3, new ArrayList<SpellEffect>(), "Earth Bolt", 3));
        earthDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.EARTH, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Crushing force", 3));

        return earthDeck;

    }

}
