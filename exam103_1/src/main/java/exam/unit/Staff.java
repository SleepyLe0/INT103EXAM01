package exam.unit;

import exam.base.OrgUnit;

public class Staff {

    private int id;
    private String firstName;
    private String lastName;
    private OrgUnit affiliation;

    public Staff(int id, String firstName, String lastName, OrgUnit affiliation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.affiliation = affiliation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public OrgUnit getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(OrgUnit affiliation) {
        this.affiliation = affiliation;
    }
}
