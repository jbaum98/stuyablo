import java.util.*;

public class BaseChar {

//Attributes
    private String name;
    
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
    private int pAttackMod = 0;
    private int pDefenseMod = 0;
    private int mAttackMod = 0;
    private int mDefenseMod = 0;
    private int accuracyMod = 0;
    private int speedMod = 0;

//Mindless Getters
    public getName() {
        return this.name;
    }
    
    public getHealth() {
        return this.health;
    
    }
    
    public getMana() {
        return this.mana;
    
    }
    
    public getPAttack() {
        return this.pAttack;
    }
    
    public getPDefense() {
        return this.pDefense;
    }
    
    public getMAttack() {
        return this.mAttack;
    }
    
    public getMDefense() {
        return this.mDefense;
    }
    
    
    public getAccuracy() {
        return this.accuracy;
    }
    
    public getSpeed() {
        return this.speed;
    }
    
//Formulas
    private getMaxHealth() {
        return 100;
    }
    
    private getMaxMana() {
        return 100;
    }
    
//Setters
    public addHealth(int h) {
        this.health += h;
        if ( this.health > this.getMaxHealth() )
            this.health = this.getMaxHealth();
    }
    
    public removeHealth(int h) {
        this.addHealth(-h);
    }
    
    public addMana(int m) {
        this.mana += m;
        if ( this.mana > this.getMaxMana() )
            this.mana = this.getMaxMana();
    }
    
    public removeHealth(int m) {
        this.addMana(-m);
    }

//Attacks
    public baseAttack(BaseChar other) {
        double defense = other.getPDefense() / 16 * (Math.random() + 1);
        double attack = this.getPAttack() / 8 * (Math.random() + 1));
        int damage = (int)(attack - defense);
        other.removeHealth(damage);
}