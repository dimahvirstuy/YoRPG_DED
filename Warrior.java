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
	attack = 0.4;}
	public String about(){
		return "You are a warrior, selfless and brave. Your priority weapon is a sword.";
	}
    public void normalize(){
		this.defense *= 2;
		this.attack /= 2;
    }

    public static void main(String[] args) {
        
    }
}
