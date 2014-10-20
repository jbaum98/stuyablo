import java.util.*;

public class Warrior extends BaseChar {
    //attributes

    //methods
    public void getPumped(){
	removeMana(30);
	super.speedMod = 20;
	super.pAttackMod = 20;
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
