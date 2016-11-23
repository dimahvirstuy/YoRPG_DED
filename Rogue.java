/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #34: Ye Olde Role Playing Game, Unchained
2016-22-16  
*/
public class Rogue extends Character{
    public Rogue(String nameInput) {
	name = nameInput;
	health = 80;
	strength = 80;
	defense = 80;
	attack = 0.9;
}
    public void normalize(){
		this.defense *= 2;
		this.attack /= 2;
    }
 	public String about(){
		return "You are a rogue, quick and agile. Your priority weapon is a bow.";
	}
   

    public static void main(String[] args) {
        
    }
}
