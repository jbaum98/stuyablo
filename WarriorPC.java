public class WarriorPC extends Warrior {
    public WarriorPC() {
	super();
	this.setHealth(randomFromTo(100,500));
	this.setMana(randomFromTo(100,500));
	this.setLevel(randomFromTo(1,20));
	this.setName("Monster");
    }
}