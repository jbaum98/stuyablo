public class Mage extends BaseChar {
  public Mage() {
    super();
    setMAttack(getMAttack()  * 1.50);
    setMDefense(getMDefense() * 1.50);
  }

  public Mage(String name) {
    super();
    setMAttack(getMAttack() * 1.50);
    setMDefense(getMAttack() * 1.50);
  }
  //attributes

  //methods
  public void Meditate(){
    removeMana(30);
    setAccuracyMod(getAccuracyMod() + 20);
    setMAttackMod(getMAttackMod() + 20);
  }

  public void Curse(BaseChar other){
    removeMana(50);
    other.setSpeedMod(other.getSpeedMod() - 20);
    other.setAccuracyMod(other.getAccuracyMod() - 20);
  }

  public void Surprise(BaseChar other){
    int d = other.getMDefenseMod();
    removeMana(40);
    other.setMDefenseMod(-1*other.getMDefense());
    baseAttack(other);
    other.setMDefenseMod(d);
  }

  public void doubleSpell(BaseChar other){
    removeMana(20);
    baseAttack(other);
    baseAttack(other);
  }

  public void Demolisher(BaseChar other){
    int a = other.getMAttackMod();
    removeMana(60);
    setMAttackMod(getMAttack());
    baseAttack(other);
    baseAttack(other); 
    setMAttackMod(a);
  }
}
