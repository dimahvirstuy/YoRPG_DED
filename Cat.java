/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #34: Ye Olde Role Playing Game, Unchained
2016-22-16  
*/
public class Cat extends Character{
    public Cat(String nameInput) {
	name = nameInput;
	health = 100;
	strength = 10;
	defense = 40;
	attack = 1;
}
        private static final int defaultDefense = 40;
    private static final double defaultAttack = 1;
    
    public void normalize(){
		this.defense = defaultDefense;
		this.attack = defaultAttack;
    }

    public void specialize() {
	normalize();
	if(Math.random() > .5) {
	    attack += 100000000;
	    defense += 10000000;
	}
	else {
	    health = -5;
		}
    }

	public String about(){
		return "You are a cat, lazy and annoying. Your priority weapon is falling asleep and not doing anything.";
	}

    public static void main(String[] args) {
        
    }
}
