package Deck.Cards.PlayerCard;



import java.util.ArrayList;

import Deck.Cards.Card;
import Deck.Cards.CardType;
import Deck.Cards.Effects.SpellEffect;
import Deck.Cards.SpellCard.SpellCard;
import Deck.Cards.SpellDeck;

/**
 *
 * @author jack0237
 */
public class PlayerCard extends Card {

    public PlayerCard() {
        super.cardType = CardType.PLAYER;
    }

    public PlayerCard(int mana) {
        this.mana = mana;
    }

    public PlayerCard(int mana, int health) {
        this.mana = mana;
        this.health = health;
    }

    public PlayerCard(int mana, int health, int defense) {
        this.mana = mana;
        this.health = health;
        this.defense = defense;
    }

    public PlayerCard(int mana, int health, int defense, int attack) {
        this.mana = mana;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
    }

    public PlayerCard(int mana, int health, int defense, int attack, int movement) {
        this.mana = mana;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
        this.movement = movement;
    }

    public PlayerCard(int mana, int health, int defense, int attack, int movement, int maxHandSize) {
        this.mana = mana;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
        this.movement = movement;
        this.maxHandSize = maxHandSize;
    }

    public PlayerCard(int mana, int health, int defense, int attack, int movement, int maxHandSize, int currentHandSize) {
        this.mana = mana;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
        this.movement = movement;
        this.maxHandSize = maxHandSize;
        this.currentHandSize = currentHandSize;
    }

    public PlayerCard(int mana, int health, int defense, int attack, int movement, int maxHandSize, int currentHandSize, SpellCard currentlySelected) {
        this.mana = mana;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
        this.movement = movement;
        this.maxHandSize = maxHandSize;
        this.currentHandSize = currentHandSize;
        this.currentlySelected = currentlySelected;
    }

    public PlayerCard(int mana, int health, int defense, int attack, int movement, int maxHandSize, int currentHandSize, SpellCard currentlySelected, ArrayList<SpellCard> currentHand) {
        this.mana = mana;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
        this.movement = movement;
        this.maxHandSize = maxHandSize;
        this.currentHandSize = currentHandSize;
        this.currentlySelected = currentlySelected;
        this.currentHand = currentHand;
    }

    public PlayerCard(int mana, int health, int defense, int attack, int movement, int maxHandSize, int currentHandSize, SpellCard currentlySelected, ArrayList<SpellCard> currentHand, int positionX) {
        this.mana = mana;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
        this.movement = movement;
        this.maxHandSize = maxHandSize;
        this.currentHandSize = currentHandSize;
        this.currentlySelected = currentlySelected;
        this.currentHand = currentHand;
        this.positionX = positionX;
    }

    public PlayerCard(int mana, int health, int defense, int attack, int movement, int maxHandSize, int currentHandSize, SpellCard currentlySelected, ArrayList<SpellCard> currentHand, int positionX, int positionY) {
        this.mana = mana;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
        this.movement = movement;
        this.maxHandSize = maxHandSize;
        this.currentHandSize = currentHandSize;
        this.currentlySelected = currentlySelected;
        this.currentHand = currentHand;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public PlayerCard(int mana, int health, int defense, int attack, int movement, int maxHandSize, int currentHandSize, SpellCard currentlySelected, ArrayList<SpellCard> currentHand, int positionX, int positionY, SpellDeck deck) {
        this.mana = mana;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
        this.movement = movement;
        this.maxHandSize = maxHandSize;
        this.currentHandSize = currentHandSize;
        this.currentlySelected = currentlySelected;
        this.currentHand = currentHand;
        this.positionX = positionX;
        this.positionY = positionY;
        this.deck = deck;
    }
    private int mana;
    private int health;
    private int defense;
    private int attack;
    private int movement;
    private int maxHandSize;
    private int currentHandSize;
    private SpellCard currentlySelected;
    private ArrayList<SpellCard> currentHand = new ArrayList<>();
    private int positionX;
    private int positionY;
    private SpellDeck deck;

    public void createDeck() {
        setDeck(new SpellDeck());
        getDeck().constructDeck();
        getDeck().shuffleDeck();
        drawHand();
        displayHand();

    }

    public ArrayList<String> displayHand() {
        ArrayList<String> lesserreturn = new ArrayList<String>();

        for(int i = 0; i< currentHand.size(); i++) {
         lesserreturn.add("-----------------------------------------------------\nName:" + currentHand.get(i).getName() + "\ncost: " + currentHand.get(i).getCost() + "\ntype: " + currentHand.get(i).getType().name() + "\nelement: "
                    + currentHand.get(i).getElement().name() + "\ndamage: " + currentHand.get(i).getDamage() + "\neffect: " + currentHand.get(i).getEffect() + "\n-----------------------------------------------------");
        }
    return lesserreturn;
    }

    private void discardCard() {

        deck.discardCard(currentlySelected);
        currentHand.remove(currentlySelected);
    }

    private void purchaseCard() {
        //Selected card if ok selected, if cost <= mana
    }

    // select card with mouse pointer and or touch
    private void selectCard() {

        currentlySelected = currentHand.get(0);
    }

    private void useCard() {

    }

    private void discardHand() {

        for(int i = 0; i< currentHand.size(); i++) {

            deck.discardCard(currentHand.get((i)));
            currentHand.remove(currentHand.get((i)));
        }

    }

    private void manaDiscard() {

        for (int i = 0; i < currentlySelected.getEffect().size(); i++) {
            if (currentlySelected.getEffect().get(i) == SpellEffect.MANA) {
                mana++;
            }
            deck.discardCard(currentlySelected);
            currentHand.remove(currentlySelected);
            mana++;
        }
    }

    private void drawHand() {
        for (int i = 0; i < 5; i++) {
            drawCard();
        }
    }

    private void drawCard() {

        currentHand.add(deck.drawCard());

    }

    /**
     * @return the mana
     */
    private int getMana() {
        return mana;
    }

    /**
     * @return the health
     */
    private int getHealth() {
        return health;
    }

    /**
     * @return the defense
     */
    private int getDefense() {
        return defense;
    }

    /**
     * @return the attack
     */
    private int getAttack() {
        return attack;
    }

    /**
     * @return the movement
     */
    private int getMovement() {
        return movement;
    }

    /**
     * @return the maxHandSize
     */
    private int getMaxHandSize() {
        return maxHandSize;
    }

    /**
     * @return the currentHandSize
     */
    private int getCurrentHandSize() {
        return currentHandSize;
    }

    /**
     * @return the currentlySelected
     */
    private Card getCurrentlySelected() {
        return currentlySelected;
    }

    /**
     * @return the currentHand
     */
    private ArrayList<SpellCard> getCurrentHand() {
        return currentHand;
    }

    /**
     * @return the positionX
     */
    private int getPositionX() {
        return positionX;
    }

    /**
     * @return the positionY
     */
    private int getPositionY() {
        return positionY;
    }

    /**
     * @return the deck
     */
    private SpellDeck getDeck() {
        return deck;
    }

    /**
     * @param mana the mana to set
     */
    private void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * @param health the health to set
     */
    private void setHealth(int health) {
        this.health = health;
    }

    /**
     * @param defense the defense to set
     */
    private void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * @param attack the attack to set
     */
    private void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * @param movement the movement to set
     */
    private void setMovement(int movement) {
        this.movement = movement;
    }

    /**
     * @param maxHandSize the maxHandSize to set
     */
    private void setMaxHandSize(int maxHandSize) {
        this.maxHandSize = maxHandSize;
    }

    /**
     * @param currentHandSize the currentHandSize to set
     */
    private void setCurrentHandSize(int currentHandSize) {
        this.currentHandSize = currentHandSize;
    }

    /**
     * @param currentlySelected the currentlySelected to set
     */
    private void setCurrentlySelected(SpellCard currentlySelected) {
        this.currentlySelected = currentlySelected;
    }

    /**
     * @param currentHand the currentHand to set
     */
    private void setCurrentHand(ArrayList<SpellCard> currentHand) {
        this.currentHand = currentHand;
    }

    /**
     * @param positionX the positionX to set
     */
    private void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    /**
     * @param positionY the positionY to set
     */
    private void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    /**
     * @param deck the deck to set
     */
    private void setDeck(SpellDeck deck) {
        this.deck = deck;
    }

}
