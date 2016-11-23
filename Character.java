/* You DED: Dasha, Edward, Dima
APCS1 pd4
HW #34: Ye Olde Role Playing Game, Unchained
2016-22-16  
*/
public abstract class Character {
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
    public abstract void specialize();
    
    //normalizes the settings for character
    public abstract void normalize();
    
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
	//abstract method. in each of subclasses about writes a short description of the class of the character you choose.
    public abstract String about();
public static void main(String[] args) {
}

}

