/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #34: Ye Olde Role Playing Game, Unchained
2016-22-16  
*/
public class Rogue extends Character{
    public Rogue(String nameInput) {
	name = nameInput;
	health = 150;
	strength = 40;
	defense = 40;
	attack = 1;
    }

        private static final int defaultDefense = 40;
    private static final double defaultAttack = 1;

    public void normalize(){
	this.defense = defaultDefense;
	this.attack = defaultAttack;
    }

    public void specialize () {
	normalize();
	if (Math.random() < 0.7) {
	    defense *= 2;
	    attack *= 2;
	}
	else {
	    defense -= 40;
		}
	
    }

    public String about(){
	return "You are a rogue, quick and agile. Your priority weapon is a bow.";
    }
   

    public static void main(String[] args) {
        
    }
}
