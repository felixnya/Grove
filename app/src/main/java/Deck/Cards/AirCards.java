package Deck.Cards;

import Deck.Cards.Effects.SpellEffect;
import Deck.Cards.SpellCard.SpellCard;
import Deck.Cards.SpellCard.SpellElement;
import Deck.Cards.SpellCard.SpellType;
import java.util.ArrayList;
import java.util.EnumSet;

/**
 *
 * @author jack0237
 */
public class AirCards {

    private ArrayList<SpellCard> airDeck = new ArrayList<>();

    public ArrayList<SpellCard> catalogCards() {

        airDeck.add(new SpellCard(2, SpellType.DAMAGE, SpellElement.AIR, 3, new ArrayList<SpellEffect>(), "Air Bolt", 3));
        airDeck.add(new SpellCard(3, SpellType.DAMAGE, SpellElement.AIR, 3, new ArrayList<SpellEffect>() {
            {
                {
                    {
                        add(SpellEffect.BLEED);
                    }
                    add(SpellEffect.BURN);
                }
            }
        }, "Crushing force", 3));

        return airDeck;

    }

}
