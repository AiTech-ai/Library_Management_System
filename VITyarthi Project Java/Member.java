public class Member {
    private int memberid;
    private String name;
    private String email;

    public Member(int memberid, String name, String email) {
        this.memberid = memberid;
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }    

    public int getMemberId() {
        return memberid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "Member ID: " + memberid +
               ", Name: " + name +
               ", Email: " + email;
    }
}
