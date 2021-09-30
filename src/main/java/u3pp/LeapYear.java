package u3pp;

/**
 * YOUR COMMENTs HERE
 * 
 * @author //YOUR NAME HERE
 *
 */

public class LeapYear {
	/**
	 * YOUR COMMENTS HERE
	 * This is where we find out if the yea given is a leap year by seeing if it fills the conditions
	 */
	public static boolean isLeapYear(int year) {
		/* YOUR CODE HERE */
		if (year > 1585)
		{
		  if (year % 100 != 0)
		  {
		    if ( year % 4 == 0)
		    {
		      return true;
		    }
		    return false;
		  }
		  else if (year % 400 == 0)
		  {
		    return true;
		  }
		  else 
		  {
		    return false;
		  }
		}
		else 
		{
		  return false;
		}
	}
}