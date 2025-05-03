import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        String[] names = {"Jane Smith", "Steve Fox", "Michael Xin", "Maria Garcia"};
        String[] mini = {""};
        int b = 2017;

        ClubMembers a = new ClubMembers();
        for (int i = 0; i<names.length; i++) {
            mini[0] = names[i];
            a.addMembers(mini, b+i);
        }
        System.out.println(a);
        
        ClubMembers c = new ClubMembers();
        c.setMemberList(a.removeMembers(2018));
        System.out.println(c);
        System.out.println(a);
    }
}