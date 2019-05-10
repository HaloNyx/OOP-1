/**
 * The HPDuellingSpells program extends the HPSpells class and sets and stores information about a duelling spell from the Harry Potter franchise,
 * and allows the spell to perform certain actions.
 *
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 19.02.18
 * @author Juleen Chen
 */
public class HPDuellingSpells extends HPSpells
{
    /** The spell's range. */
    private double rangeOfAttack;
    /** The distance between the caster and the target. */
    private double targetDistance;
    /** The damage that the spell does on the target */
    private int damage;
    /** The amount of health that the target has left. */
    private int targetHealth;

    /**
     * This is the class constructor for the HPDuellingSpells class. Sets initial values based on values set by the programmer.
     *
     * @param inc The spell's name.
     * @param cla The spell's classification.
     * @param eff The spell's effect.
     * @param wm The spell's necessary wand movement.
     * @param app The spell's appearance when cast.
     * @param tar The spell's target.
     * @param sta The spell's status.
     * @param dur The spell's duration.
     * @param ran The spell's range.
     * @param td The distance from the target.
     * @param dam The damage that the spell does on the target.
     * @param th amount of health that the target has left.
     */
    public HPDuellingSpells (String inc, String cla, String eff, String wm, String app, String tar, String sta, int dur, double ran, double td, int dam, int th)
    {
	super (inc, cla, eff, wm, app, tar, sta, dur);
	rangeOfAttack = ran;
	targetDistance = td;
	damage = dam;
	targetHealth = th;
    }


    /**
     * This is the class constructor for the HPDuellingSpells class. Sets initial values based on default values.
     */
    public HPDuellingSpells ()
    {
	super ();
	rangeOfAttack = 0;
	damage = 0;
    }


    /**
     * The attack method is used to reduce the health of the target by the amount of damage inflicted by the spell, if the target is within range.
     * It prints out a different statement for each outcome.
     */
    public void attack ()
    {
	if (targetDistance <= rangeOfAttack)
	{
	    System.out.println ("The attack is successful.");
	    targetHealth -= damage;
	}
	else
	{
	    System.out.println ("The target is out of range.");
	}
    }


    /**
     * The incRangeOfAttack method is used to increase the range of the spell.
     *
     * @param addRange The distance that the range is increased by.
     */
    public void incRangeOfAttack (double addRange)
    {
	rangeOfAttack += addRange;
    }


    /**
     * The incDamage method is used to increase the damage done by the spell.
     *
     * @param addDamage The spell's damage increase.
     */
    public void incDamage (int addDamage)
    {
	damage += addDamage;
    }


    /**
     * The getRangeOfAttack method is used to return the spell's range.
     *
     * @return double rangeOfAttack This is the spell's range.
     */
    public double getRangeOfAttack ()
    {
	return rangeOfAttack;
    }


    /**
     * The getTargetDistance method is used to return the distance from the spell's target.
     *
     * @return double targetDistance This is the distance from the spell's target.
     */
    public double getTargetDistance ()
    {
	return targetDistance;
    }


    /**
     * The getDamage method is used to return the amount of damage the spell infllicts on the target.
     *
     * @return int damage This is the amount of damage the spell inflicts.
     */
    public int getDamage ()
    {
	return damage;
    }


    /**
     * The getTargetHealth method is used to return the amount of health the target has.
     *
     * @return int targetHealth This is the target's health.
     */
    public int getTargetHealth ()
    {
	return targetHealth;
    }
}
