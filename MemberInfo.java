public class MemberInfo
{
    private String name;
    private int grad;
    private boolean gs;
/** Constructs a MemberInfo object for the club member with name name,
* graduation year gradYear, and standing hasGoodStanding.
*/
public MemberInfo(String name, int gradYear, boolean hasGoodStanding)
{
    this.name = name;
    grad = gradYear;
    gs = hasGoodStanding;
}
/** Returns the graduation year of the club member. */
public int getGradYear()
{
    return grad;
}
/** Returns true if the member is in good standing and false otherwise. */
public boolean inGoodStanding()
{
    return gs;
}
public String getName() {
    return name;
}
// There may be instance variables, constructors, and methods that are not shown.
}