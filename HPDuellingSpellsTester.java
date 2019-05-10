/**
* The HPDuellingSpellsTester program creates a hPDuellingSpells object.
*
* <h2>Course Info:</h2>
* ICS4U0 with Krasteva, V.
*
* @version 19.02.18
* @author Juleen Chen
*/
public class HPDuellingSpellsTester
{
    /**
    * This is the main method which makes use the methods in the HPDuellingSpells class. It prints out the information for the HPDuellingSpells object.
    */
    public static void main (String[] args)
    {
	HPDuellingSpells expelliarmus = new HPDuellingSpells ("Expelliarmus", "charm", "disarming", "swirling motion", "scarlet beam of light", "opponent", "deactivated", 0, 10.0, 15.0, 10, 100);
	System.out.println ("Hello, students of Hogwarts!");
	System.out.println ("The " + expelliarmus.getClassification () + " " + expelliarmus.getIncantation () + " is used for " + expelliarmus.getEffect () + " the targeted " + expelliarmus.getTarget () + ".");
	System.out.println ("By default, the " + expelliarmus.getIncantation () + " " + expelliarmus.getClassification () + " has a range of " + expelliarmus.getRangeOfAttack () + " metres \nand reduces the target's health by " + expelliarmus.getDamage () + "% of its maximum health.");
	System.out.println ();

	expelliarmus.changeTarget ("dummy target");
	System.out.println ("To practice, let's take aim at the " + expelliarmus.getTarget () + " that is " + expelliarmus.getTargetDistance () + " metres away.");
	System.out.println ("Now that you're ready, move your wand in a(n) " + expelliarmus.getWandMovement () + " \nand say it with me: " + expelliarmus.getIncantation () + "!");
	expelliarmus.activateSpell ();
	System.out.println ("Wow! The " + expelliarmus.getClassification () + " has been " + expelliarmus.getStatus () + " and a(n) " + expelliarmus.getAppearance () + " \nis being emitted from the tip your wand.");
	expelliarmus.attack ();
	System.out.println ("If you concentrate, you can increase the range and damage of your spell.");
	expelliarmus.incRangeOfAttack (10.0);
	expelliarmus.incDamage (20);
	System.out.println ("Your " + expelliarmus.getIncantation () + " " + expelliarmus.getClassification () + " now has a range of " + expelliarmus.getRangeOfAttack () + " metres \nand reduces the target's health by " + expelliarmus.getDamage () + "% of its maximum health.");
	expelliarmus.attack ();
	System.out.println ("The target is now at " + expelliarmus.getTargetHealth () + "% of its full health.");
	;
	expelliarmus.incDuration (2);
	System.out.println ("Excellent, the " + expelliarmus.getClassification () + " lasted " + expelliarmus.getDuration () + " seconds!");
	expelliarmus.deactivateSpell ();
	System.out.println ("The " + expelliarmus.getClassification () + " as been " + expelliarmus.getStatus () + ". Good work!");
	System.out.println ("");
    }
}

