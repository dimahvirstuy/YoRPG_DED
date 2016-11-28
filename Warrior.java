/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #34: Ye Olde Role Playing Game, Unchained
2016-22-16  
*/
public class Warrior extends Character{
    public Warrior(String nameInput) {
	name = nameInput;
	health = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }

    private static final int defaultDefense = 40;
    private static final double defaultAttack = 0.4;

    public String about(){
	return "You are a warrior, selfless and brave. Your primary weapon is a sword.";
    }

    public void specialize() {
	defense -= (int) ( Math.random() * 6 + 5 );
	attack *= ( Math.random() + 3 ) / 2 + 0.1;
    }

    public void normalize() {
	this.defense = defaultDefense;
	this.attack = defaultAttack;
    }

    public static void main(String[] args) {
        
    }
}
