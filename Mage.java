/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #34: Ye Olde Role Playing Game, Unchained
2016-22-16  
*/
public class Mage extends Character{
    public Mage(String nameInput) {
	name = nameInput;
	health = 150;
	strength = 40;
	defense = 20;
	attack = 1;
}

        private static final int defaultDefense = 50;
    private static final double defaultAttack = 1;
    
	public String about(){
		return "You are a mage, intelligent and mysterious. Your priority weapon is a staff.";
	}

    public void specialize () {
	normalize();
	this.health -= 20;
	this.attack *= 4;
    }

    public void normalize(){
	this.defense = defaultDefense;
	this.attack = defaultAttack;
    }
    public static void main(String[] args) {
        
    }
}
