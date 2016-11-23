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
	defense = 300;
	attack = 0.1;
}
    public void normalize(){
		this.defense *= 2;
		this.attack /= 2;
    }

    public void specialize () {
    }

    public String about(){
	return "You are a pineapple, strong and wise. Your priority weapon is your stem.";
    }


    public static void main(String[] args) {
        
    }
}
