/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #34: Ye Olde Role Playing Game, Unchained
2016-22-16  
*/
public class Pineapple extends Character{
    public Pineapple(String nameInput) {
	name = nameInput;
	health = 400;
	strength = 80;
	defense = 100;
	attack = 0.1;
}
    private static final int defaultDefense = 100;
    private static final double defaultAttack = 0.1;
    
    public void normalize(){
		this.defense = defaultDefense;
		this.attack = defaultAttack;
    }

    public void specialize () {
	normalize();
	if(0.1 > Math.random()) {
	    attack += 100;
	}
	else {defense = 0;
	    attack *= 2;
	}
	    
    }

    public String about(){
	return "You are a pineapple, strong and wise. Your priority weapon is your stem.";
    }


    public static void main(String[] args) {
        
    }
}
