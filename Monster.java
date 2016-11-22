/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #32: Ye Olde Role Playing Game, Expanded
2016-20-16  
*/

public class Monster extends Character{
    public Monster() {
	health = 150;
	strength = (int) Math.random() * 45 + 20;
	defense = 20;
	attack = 1;
}
    public static void main(String[] args) {
        
    }
}
