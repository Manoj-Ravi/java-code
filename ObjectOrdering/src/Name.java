import java.util.*;
/**
 * 
 * @author SNC
 *
 */
public class Name implements Comparable<Name> {
    private final String firstName, lastName;
/**
 * 
 * @param firstName
 * @param lastName
 */
    public Name(String firstName, String lastName) {
        if (firstName == null || lastName == null)
            throw new NullPointerException();
	this.firstName = firstName;
        this.lastName = lastName;
    }
/**
 * 
 * @return
 */
    public String firstName() { return firstName; }
    /**
     * 
     * @return
     */
    public String lastName()  { return lastName;  }
/**
 * 
 */
    public boolean equals(Object o) {
        if (!(o instanceof Name))
            return false;
        Name n = (Name)o;
        return n.firstName.equals(firstName) &&
               n.lastName.equals(lastName);
    }
/**
 * 
 */
    public int hashCode() {
        return 31*firstName.hashCode() + lastName.hashCode();
    }
/**
 * 
 */
    public String toString() {
	return firstName + " " + lastName;
    }
/**
 * 
 */
    public int compareTo(Name n) {
        int lastCmp = lastName.compareTo(n.lastName);
        return (lastCmp != 0 ? lastCmp :
                firstName.compareTo(n.firstName));
    }
}