import java.util.*;

public class Mage extends BaseChar {
    //attributes

    //methods
    public void Meditate(){
	removeMana(30);
	super.accuracyMod = 20;
	super.mAttackMod = 20;
    }

    public void Curse(BaseChar other){
	removeMana(50);
	other.speedMod = -20;
	other.accuracyMod = -20;
    }

    public void Surprise(BaseChar other){
	int a = other.mDefenseMod;
	removeMana(40);
	other.mDefenseMod = -1*other.getMDefense();
	baseAttack(other);
	other.mDefenseMod = a;
    }

    public void doubleSpell(BaseChar other){
        removeMana(20);
	baseAttack(other);
	baseAttack(other);
    }

    public void Demolisher(BaseChar other){
	removeMana(60);
	this.mAttackMod = getMAttack();
	baseAttack(other);
	baseAttack(other); 
	this.mAttackMod = 0;
    }
}
