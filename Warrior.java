public class Warrior extends BaseChar {

  protected void boostAttributes() {
    attack *= 1.1;
    accuracy *= 1.5;
  }

  //methods
  public void boost(){
    removeMana(30);
    accuracyMod += 20;
    attackMod += 10;
  }

  public void special(BaseChar other) {
    removeMana(80);
    while (Math.random() > .6) {
      int damage = (int) (Math.random() * attack / 2);
      other.removeHealth(damage);
    }
  }
}
