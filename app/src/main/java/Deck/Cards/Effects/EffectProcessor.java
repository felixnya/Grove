package Deck.Cards.Effects;

/**
 *
 * @author jack0237
 */
public class EffectProcessor {

    private void processEffect(SpellEffect effect) {
        switch (effect) {
            case BLEED:
                bleed();
                break;
            case BURN:
                burn();
                break;
            case FREEZE:
                freeze();
                break;
            case POSION:
                posion();
                break;
            case SLOW:
                slow();
                break;
            case STOP:
                stop();
                break;
            case STUN:
                stun();
                break;
            case SLEEP:
                sleep();
                break;
            case HEAL:
                heal();
                break;
            case INVINCIBLE:
                invincible();
                break;
            case HASTE:
                haste();
                break;
            case SHIFT_RIGHT:
                shiftRight();
                break;
            case SHIFT_LEFT:
                shiftLeft();
                break;
            case SHIFT_FORWARD:
                shiftForward();
                break;
            case SHIFT_BACKWARDS:
                shiftBackwards();
                break;
            case LOWER_ATTACK:
                lowerAttack();
                break;
            case LOWER_DEFENSE:
                lowerDefense();
                break;
            case RAISE_ATTACK:
                raiseAttack();
                break;
            case RAISE_DEFENSE:
                raiseDefense();
                break;
            case CONFUSION:
                confusion();
                break;
            case BLIND:
                blind();
                break;
            default:


        }
    }

    private void bleed() {

    }

    private void burn() {

    }

    private void blind() {

    }

    private void freeze() {

    }

    private void posion() {

    }

    private void slow() {

    }

    private void stop() {

    }

    private void stun() {

    }

    private void sleep() {
    }

    private void heal() {
    }

    private void invincible() {
    }

    private void haste() {
    }

    private void shiftRight() {
    }

    private void shiftLeft() {
    }

    private void shiftForward() {
    }

    private void shiftBackwards() {
    }

    private void lowerAttack() {
    }

    private void lowerDefense() {
    }

    private void raiseAttack() {
    }

    private void raiseDefense() {
    }

    private void confusion() {
    }

}
