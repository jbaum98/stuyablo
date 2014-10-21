public class Warrior extends BaseChar {
  public Warrior() {
      super();
      setPAttack(getPAttack() * 1.50);
      setPDefense(getPAttack() * 1.50);
  }

  public Warrior(String name) {
      super();
      setPAttack(getPAttack() * 1.50);
      setPDefense(getPAttack() * 1.50);
  }
  //attributes

  //methods
  public void getPumped(){
    removeMana(30);
      setSpeedMod(getSpeedMod() + 20);
      setPDefense(getPAttack() + 30);
  }

  public void Discombobulate(BaseChar other){
    removeMana(50);
    other.setSpeedMod(other.getSpeedMod() -20);
    other.setAccuracyMod(other.getSpeedMod() -20);
  }

  public void sneakAttack(BaseChar other){
    int d = other.pDefenseMod;
    removeMana(40);
    other.setPDefenseMod(other.getSpeedMod(-1*other.getPDefense());
    baseAttack(other);
    other.setPDefenseMod(d);
  }

  public void doubleStrike(BaseChar other){
    removeMana(20);
    baseAttack(other);
    baseAttack(other);
  }

  public void Finisher(BaseChar other){
    removeMana(60);
    int a = getPAttackMod();
    setPAttackMod(getPAttack());
    baseAttack(other);
    baseAttack(other); 
    pAttackMod = a;
  }
}
