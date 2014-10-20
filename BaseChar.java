import java.util.*;

public abstract class BaseChar {
    
    //Attributes
    private String name = "";
    
    private int health = 100;
    private int mana = 100;
    
    //Tools
    private static int randomFromTo(int bottom, int top) {
        Random r = new Random();
        return r.nextInt(top-bottom) + bottom;
    }
    
        
    
    //Battle Attributes
    private int pAttack = randomFromTo(10,30);
    private int pDefense = randomFromTo(10,30);
    private int mAttack = randomFromTo(10,30);
    private int mDefense = randomFromTo(10,30);
    private int accuracy = randomFromTo(60,80);
    private int speed = randomFromTo(40,60);
    
    //Attributes Modifiers
    public int pAttackMod = 0;
    public int pDefenseMod = 0;
    public int mAttackMod = 0;
    public int mDefenseMod = 0;
    public int accuracyMod = 0;
    public int speedMod = 0;


    //Constructors
    public BaseChar() {
	this.name = "DEFAULT";
    }

    public BaseChar(String n) {
	this.name = n;
    }

    //Mindless Getters
    public String getName() {
        return this.name;
    }
    
    public int getHealth() {
        return this.health;
    
    }
    
    public int getMana() {
        return this.mana;
    
    }
    
    public int getPAttack() {
        return this.pAttack + this.pAttackMod;
    }
    
    public int getPDefense() {
        return this.pDefense + this.pDefenseMod;
    }
    
    public int getMAttack() {
        return this.mAttack + this.mAttackMod;
    }
    
    public int getMDefense() {
        return this.mDefense + this.mDefenseMod;
    }
    
    
    public int getAccuracy() {
        return this.accuracy + this.accuracyMod;
    }
    
    public int getSpeed() {
        return this.speed + this.speedMod;
    }
    
    //Formulas
    private int getMaxHealth() {
        return 100;
    }
    
    private int getMaxMana() {
        return 100;
    }
    
    //Setters
    public void setName(String s){
	this.name = s;
    }

    public void addHealth(int h) {
        this.health += h;
        if ( this.health > this.getMaxHealth() )
            this.health = this.getMaxHealth();
    }
    
    public void removeHealth(int h) {
        this.addHealth(-h);
    }
    
    public void addMana(int m) {
        this.mana += m;
        if ( this.mana > this.getMaxMana() )
            this.mana = this.getMaxMana();
    }
    
    public void removeMana(int m) {
        this.addMana(-m);
    }
    
    //Attacks
    public void baseAttack(BaseChar other) {
        double defense = other.getPDefense() / 16 * (Math.random() + 1);
        double attack = this.getPAttack() / 8 * (Math.random() + 1);
	int damage = (int)(attack - defense);
	other.removeHealth(damage);
    }
}

