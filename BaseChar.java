import java.util.*;

public abstract class BaseChar {
    
    //Attributes
    private String name = "";
    private int level = 1;
    private int health = 100;
    private int mana = 100;
    
    //Tools
    public static int randomFromTo(int bottom, int top) {
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
    private int pAttackMod = 0;
    private int pDefenseMod = 0;
    private int mAttackMod = 0;
    private int mDefenseMod = 0;
    private int accuracyMod = 0;
    private int speedMod = 0;


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
    public void setHealth(int n) {
	this.health = n;
    }
    public void setMana(int n) {
	this.mana = n;
    }
    public void setLevel(int n) {
	this.level = n;
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

    public void setPAttackMod(int n) {
	this.pAttackMod = n;
    }

    public void setPDefenseMod(int n) {
	this.pDefenseMod = n;
    }

    public void setMAttackMod(int n) {
	this.mAttackMod = n;
    }

    public void setMDefenseMod(int n) {    
	this.mDefenseMod = n;
    }
    public void setAccuracyMod(int n) {
	this.accuracyMod = n;
    }

    public void setSpeedMod(int n) {
	this.speedMod = n;
    }
    

    //Attacks
    public void baseAttack(BaseChar other) {
        double defense = other.getPDefense() / 16 * (Math.random() + 1);
        double attack = this.getPAttack() / 8 * (Math.random() + 1);
	int damage = (int)(attack - defense);
	other.removeHealth(damage);
    }
}

