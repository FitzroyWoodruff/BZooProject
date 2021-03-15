package zoo;

public class MembershipSystem
{
    private String memberName;
    private String memberNumber;
    private int membershipLevel;

    public MembershipSystem(String memberName,String memberNumber, int membershipLevel)
    {
        this.memberName = memberName;
        this.memberNumber = memberNumber;
        this.membershipLevel = membershipLevel;

        addMembership();
        System.out.println("===========================================================");
        printMembershipStatus(memberName, memberNumber, membershipLevel);
        System.out.println("===========================================================");

    }
    public MembershipSystem()
    {

    }

    public void addMembership()
    {
        System.out.println("THE MEMBERSHIP HAS BEEN CREATED");
    }
    public void cancelMembership()
    {
        System.out.println("THE MEMBERSHIP HAS BEEN CANCELED!!!");
    }

    public void editMembership()
    {
        System.out.println("the membership has been edited");
    }

    public void printMembershipStatus(String name, String number, int level){
        System.out.println("Member name: " + name);
        System.out.println("Member number: " + number);
        System.out.println("Membership Level: " + level);

    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public int getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(int membershipLevel) {
        this.membershipLevel = membershipLevel;
    }
}
