/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #34: Ye Olde Role Playing Game, Unchained
2016-22-16  
*/

public class Monster extends Character{
    public Monster() {
	health = 150;
	strength = (int) Math.random() * 45 + 20;
	defense = 20;
	attack = 1;
	}

    public void normalize () {
    }

    public void specialize() {
    }

    public String about(){
	return "Terrifying creatures created by the Demon King.";
    }

    public static void main(String[] args) {
        
    }
}
