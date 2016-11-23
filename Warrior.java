/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #32: Ye Olde Role Playing Game, Expanded
2016-20-16  
*/
public class Warrior extends Character{
    public Warrior(String nameInput) {
	name = nameInput;
	health = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
}
    public void normalize(){
	this.defense *= 2;
	this.attack /= 2;
    }
    public static void main(String[] args) {
        
    }
}
