/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #32: Ye Olde Role Playing Game, Expanded
2016-20-16  
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

    public static void main(String[] args) {
        
    }
}
