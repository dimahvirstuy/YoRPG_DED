/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #34: Ye Olde Role Playing Game, Unchained
2016-22-16  
*/
public class Cat extends Character{
    public Cat(String nameInput) {
	name = nameInput;
	health = 20;
	strength = 10;
	defense = 40;
	attack = 0.1;
}
    public void normalize(){
		this.defense *= 2;
		this.attack /= 2;
    }
	public String about(){
		return "You are a cat, lazy and annoying. Your priority weapon is falling asleep and not doing anything.";
	}

    public static void main(String[] args) {
        
    }
}
