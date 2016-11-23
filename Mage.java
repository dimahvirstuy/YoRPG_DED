/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #34: Ye Olde Role Playing Game, Unchained
2016-22-16  
*/
public class Mage extends Character{
    public Mage(String nameInput) {
	name = nameInput;
	health = 110;
	strength = 30;
	defense = 100;
	attack = 0.4;
}
	public String about(){
		return "You are a mage, intelligent and mysterious. Your priority weapon is a staff.";
	}

    public void specialize () {
    }

    public void normalize(){
	this.defense *= 2;
	this.attack /= 2;
    }
    public static void main(String[] args) {
        
    }
}
