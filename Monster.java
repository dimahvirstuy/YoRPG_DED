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
	public String about(){
		return "A monster is terrifying and scary.";
	}

    public static void main(String[] args) {
        
    }
	}

