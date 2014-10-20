public class Warrior extends BaseChar {
  public Warrior() {
    this.pAttack  *= 1.50;
    this.pDefense *= 1.50;
    super();
  }

  public Warrior(String name) {
    this.pAttack  *= 1.50;
    this.pDefense *= 1.50;
    super(name);
  }
  //attributes

  //methods
  public void getPumped(){
    removeMana(30);
    this.speedMod = 20;
    this.pAttackMod = 20;
  }

  public void Discombobulate(BaseChar other){
    removeMana(50);
    other.speedMod = -20;
    other.accuracyMod = -20;
  }

  public void sneakAttack(BaseChar other){
    int a = other.pDefenseMod;
    removeMana(40);
    other.pDefenseMod = -1*other.getPDefense();
    baseAttack(other);
    other.pDefenseMod = a;
  }

  public void doubleStrike(BaseChar other){
    removeMana(20);
    baseAttack(other);
    baseAttack(other);
  }

  public void Finisher(BaseChar other){
    removeMana(60);
    this.pAttackMod = getPAttack();
    baseAttack(other);
    baseAttack(other); 
    this.pAttackMod = 0;
  }
}
