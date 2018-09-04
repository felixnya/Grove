package Deck.Cards.MonsterCard;

import Deck.Cards.Card;
import Deck.Cards.CardType;
import Deck.Cards.Effects.SpellEffect;

public class MonsterCard extends Card {

    public MonsterCard() {
        super.cardType = CardType.MONSTER;
    }
    private MonsterType monsterType;

    private int health;
    private int defense;
    private int attack;
    private int movement;
    private int damage;
    private int range;
    private int positionX;
    private int positionY;

    private SpellEffect atkEffect;
    /**
     * @return the monsterType
     */
    private MonsterType getMonsterType() {
        return monsterType;
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
     * @return the damage
     */
    private int getDamage() {
        return damage;
    }

    /**
     * @return the range
     */
    private int getRange() {
        return range;
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
     * @return the atkEffect
     */
    private SpellEffect getAtkEffect() {
        return atkEffect;
    }

    /**
     * @param monsterType the monsterType to set
     */
    private void setMonsterType(MonsterType monsterType) {
        this.monsterType = monsterType;
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
     * @param damage the damage to set
     */
    private void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @param range the range to set
     */
    private void setRange(int range) {
        this.range = range;
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
     * @param atkEffect the atkEffect to set
     */
    private void setAtkEffect(SpellEffect atkEffect) {
        this.atkEffect = atkEffect;
    }


}
