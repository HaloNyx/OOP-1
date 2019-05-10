/**
* The HPSpellsTester program creates a hPSpells object.
*
* <h2>Course Info:</h2>
* ICS4U0 with Krasteva, V.
*
* @version 19.02.18
* @author Juleen Chen
*/
public class HPSpellsTester
{
    /**
    * This is the main method which makes use the methods in the HPSpells class. It prints out the information for the HPSpells object.
    */
    public static void main (String[] args)
    {
	HPSpells expelliarmus = new HPSpells ("Expelliarmus", "charm", "disarming", "swirling motion", "scarlet beam of light", "opponent", "deactivated", 0);
	System.out.println ("Hello, students of Hogwarts!");
	System.out.println ("The " + expelliarmus.getClassification () + " " + expelliarmus.getIncantation () + " is used for " + expelliarmus.getEffect () + " the targeted " + expelliarmus.getTarget () + ".");
	expelliarmus.changeTarget ("dummy target");
	System.out.println ("To practice, let's take aim at the " + expelliarmus.getTarget () + ".");
	System.out.println ("Now that you're ready, move your wand in a(n) " + expelliarmus.getWandMovement () + " \nand say: " + expelliarmus.getIncantation () + "!");
	expelliarmus.activateSpell ();
	System.out.println ("Wow! The " + expelliarmus.getClassification () + " has been " + expelliarmus.getStatus () + " and a(n) " + expelliarmus.getAppearance () + " \nis being emitted from the tip your wand. \nNow, hold the spell until you have successful in " + expelliarmus.getEffect () + " your " + expelliarmus.getTarget () + ".");
	expelliarmus.incDuration (2);
	System.out.println ("Excellent, the " + expelliarmus.getClassification () + " lasted " + expelliarmus.getDuration () + " seconds!");
	expelliarmus.deactivateSpell ();
	System.out.println ("The " + expelliarmus.getClassification () + " as been " + expelliarmus.getStatus () + ". Good work!");
	System.out.println ("");
    }
}
