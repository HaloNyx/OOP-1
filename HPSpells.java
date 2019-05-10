/**
* The HPSpells program sets and stores information about a spell from the Harry Potter franchise,
* and allows the spell to perform certain actions.
*
* <h2>Course Info:</h2>
* ICS4U0 with Krasteva, V.
*
* @version 19.02.18
* @author Juleen Chen
*/
public class HPSpells
{
    /** The spell's name. */
    private String incantation;
    /** The spell's classification (transfiguration, charm, jinx, hex, curse, counter-spell, or healing spell.) */
    private String classification;
    /** The spell's effect (levitation, summoning objects, etc). */
    private String effect;
    /** The wand movement required to cast the spell. */
    private String wandMovement;
    /** The spell's appearance when cast. */
    private String appearance;
    /** The spell's target. */
    private String target;
    /** The spell's status (activated, deactivated) */
    private String status;
    /** The amount of time the spell is cast for */
    private int duration;

    /**
    * This is the class constructor for the HPSpells class. Sets initial values based on values set by the programmer.
    *
    * @param inc The spell's name.
    * @param cla The spell's classification.
    * @param eff The spell's effect.
    * @param wm The spell's necessary wand movement.
    * @param app The spell's appearance when cast.
    * @param tar The spell's target.
    * @param sta The spell's status.
    * @param dur The spell's duration.
    */
    public HPSpells (String inc, String cla, String eff, String wm, String app, String tar, String sta, int dur)
    {
	incantation = inc;
	classification = cla;
	effect = eff;
	wandMovement = wm;
	appearance = app;
	target = tar;
	status = sta;
	duration = dur;
    }

    /**
    * This is the class constructor for the HPSpells class. Sets initial values based on default values.
    */
    public HPSpells ()
    {
	incantation = "name";
	classification = "spell";
	effect = "no effect";
	wandMovement = "pointed forwards";
	appearance = "none";
	target = "object";
	status = "deactivated";
	duration = 0;
    }

    /**
    * The activateSpell method is used to set the status of the spell to "activated".
    */
    public void activateSpell ()
    {
	status = "activated";
    }

    /**
    * The deactivateSpell method is used to set the status of the spell to "deactivated".
    */
    public void deactivateSpell ()
    {
	status = "deactivated";
    }

    /**
    * The changeTarget method is used to set a new target for the spell.
    *
    * @param newTarget The new target.
    */
    public void changeTarget (String newTarget)
    {
	target = newTarget;
    }

    /**
    * The incDuration method is used to increase the duration of the spell.
    *
    * @param addDuration The time the duration is increased by.
    */
    public void incDuration (int addDuration)
    {
	duration += addDuration;
    }

    /**
    * The getIncantation method is used to return the spell's incantation.
    *
    * @return String incantation This is the spell's incantation.
    */
    public String getIncantation ()
    {
	return incantation;
    }

    /**
    * The getClassification method is used to return the spell's classification.
    *
    * @return String classification This is the spell's classification.
    */
    public String getClassification ()
    {
	return classification;
    }

    /**
    * The getEffect method is used to return the spell's effect.
    *
    * @return String effect This is the spell's effect.
    */
    public String getEffect ()
    {
	return effect;
    }

    /**
    * The getWandMovement method is used to return the spell's wand movement.
    *
    * @return String wandMovement This is the wand movement.
    */
    public String getWandMovement ()
    {
	return wandMovement;
    }

    /**
    * The getAppearance method is used to return the spell's appearance.
    *
    * @return String appearance This is the spell's appearance.
    */

    public String getAppearance ()
    {
	return appearance;
    }

    /**
    * The getTarget method is used to return the spell's target.
    *
    * @return String target This is the spell's target.
    */
    public String getTarget ()
    {
	return target;
    }

    /**
    * The getStatus method is used to return the spell's status.
    *
    * @return String status This is the spell's status.
    */
    public String getStatus ()
    {
	return status;
    }

    /**
    * The getStatus method is used to return the spell's status.
    *
    * @return int duration This is the spell's duration.
    */
    public int getDuration ()
    {
	return duration;
    }
} //HPSpells class
