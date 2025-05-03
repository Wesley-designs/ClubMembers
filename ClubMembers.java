import java.util.ArrayList;

public class ClubMembers
{
private ArrayList<MemberInfo> memberList = new ArrayList<>();
/** Adds new club members to memberList, as described in part (a).
* Precondition: names is a non-empty array.
*/
public void addMembers(String[] names, int gradYear)
{
    for (String x: names) {
        memberList.add(new MemberInfo(x, gradYear, true));
    }
}
/** Removes members who have graduated and returns a list of members who have graduated
* and are in good standing, as described in part (b).
*/
public ArrayList<MemberInfo> removeMembers(int year)
{
    ArrayList<MemberInfo> newList = new ArrayList<>();
    ArrayList<MemberInfo> nextList = new ArrayList<>();
    for (MemberInfo x: memberList) {
        if (x.getGradYear()<=year) {
            if (x.getGradYear()==year) {
                newList.add(x);
            }
        } else {
            nextList.add(x);
        }
    }
    memberList = nextList;
    return newList;
}
public String toString() {
    String a = "";
    for (MemberInfo x: memberList) {
        a+=x.getName() + " " + x.getGradYear() + " " + x.inGoodStanding() + "\n";
    }
    return a;
}
public void setMemberList(ArrayList<MemberInfo> a) {
    memberList = a;
}
// There may be instance variables, constructors, and methods that are not shown.
}