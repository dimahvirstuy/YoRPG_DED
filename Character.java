/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #32: Ye Olde Role Playing Game, Expanded
2016-20-16  
*/
public class Character {
    protected String name;
    protected int health;
    protected int strength;
    protected int defense;
    protected double attack;
    //gets name
    public String getName(){
	return this.name;
    }
    //uses the special attack
    public void specialize(){
	this.defense /= 2;
	this.attack *= 2;
    }
    //normalizes the settings for warrior
    public void normalize(){
	this.defense *= 2;
	this.attack /= 2;
    }
    //checks if alive
    public boolean isAlive(){
	return this.health>=1;
    }
    //gets defense
    public int getDefense(){
	return this.defense;
    }
    //Lowers HP
    public void lowerHP(int damage){
	this.health -= damage;
}
    //Attacks another character
    public int attack(Character swag){
	int damage = 0;
	damage = (int)((this.strength * this.attack) - swag.defense);
	swag.lowerHP(damage);
	return damage;
    }
    public static String about(String charPlaying) {
		if (charPlaying == "Warrior"){
			return "You are a warrior, selfless and brave. Your priority weapon is a sword.";
		}
		else if (charPlaying == "Monster"){
			return "A monster is terrifying and scary.";
		}
		else if (charPlaying == "Rogue"){
			return "You are a rogue, quick and agile. Your priority weapon is a bow.";
		}
		else if(charPlaying == "Mage"){
			return "You are a mage, intelligent and mysterious. Your priority weapon is a staff.";
		}
		else if(charPlaying == "Cat"){
			return "You are a cat, lazy and annoying. Your priority weapon is falling asleep and not doing anything.";
		}
		else{
			return "You are a pineapple, strong and wise. Your priority weapon is your stem.";
		}
	}
	
public static void main(String[] args) {
}

}

