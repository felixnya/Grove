package Deck.Cards;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Collections;

import Deck.Cards.SpellCard.SpellCard;

/**
 *
 * @author jack0237
 */
public class SpellDeck {

    private ArrayList<SpellCard> spellDeck = new ArrayList<>();
    private ArrayList<SpellCard> discardPile = new ArrayList<>();
    private AirCards air = new AirCards();
    private FireCards fire = new FireCards();
    private WaterCards water = new WaterCards();
    private EarthCards earth = new EarthCards();


    public void constructDeck() {


        ArrayList<SpellCard> air = getAir().catalogCards();
        ArrayList<SpellCard> fire = getFire().catalogCards();
        ArrayList<SpellCard> water = getEarth().catalogCards();
        ArrayList<SpellCard> earth = getWater().catalogCards();
        for (int i = 0; i < air.size(); i++) {
            getSpellDeck().add(air.get(i));
        }
        for (int i = 0; i < fire.size(); i++) {
            getSpellDeck().add(fire.get(i));
        }
        for (int i = 0; i < water.size(); i++) {
            getSpellDeck().add(water.get(i));
        }
        for (int i = 0; i < earth.size(); i++) {
            getSpellDeck().add(earth.get(i));
        }
    }

    public void displayDeck() {
        for (int i = 0; i < getSpellDeck().size(); i++) {

            System.out.println(getSpellDeck().get(i).getString());
        }
    }

    /**
     * @return the spellDeck
     */
    private ArrayList<SpellCard> getSpellDeck() {
        return spellDeck;
    }

    /**
     * @param spellDeck the spellDeck to set
     */
    private void setSpellDeck(ArrayList<SpellCard> spellDeck) {
        this.spellDeck = spellDeck;
    }

    /**
     * @return the air
     */
    private AirCards getAir() {
        return air;
    }

    /**
     * @param air the air to set
     */
    private void setAir(AirCards air) {
        this.air = air;
    }

    /**
     * @return the fire
     */
    private FireCards getFire() {
        return fire;
    }

    /**
     * @param fire the fire to set
     */
    private void setFire(FireCards fire) {
        this.fire = fire;
    }

    /**
     * @return the water
     */
    private WaterCards getWater() {
        return water;
    }

    /**
     * @param water the water to set
     */
    private void setWater(WaterCards water) {
        this.water = water;
    }

    /**
     * @return the earth
     */
    private EarthCards getEarth() {
        return earth;
    }

    /**
     * @param earth the earth to set
     */
    private void setEarth(EarthCards earth) {
        this.earth = earth;
    }

    public void shuffleDeck() {
        Collections.shuffle(spellDeck);
    }
    public int getDeckCount(){
        return spellDeck.size();
    }
    public SpellCard drawCard(){
        SpellCard tempCard = spellDeck.get(0);
        spellDeck.remove(0);
        return tempCard;
    }
    public void discardCard(SpellCard discardedCard){
        discardPile.add(discardedCard);
    }

}
