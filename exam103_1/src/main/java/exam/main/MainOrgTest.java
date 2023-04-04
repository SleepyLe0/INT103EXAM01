package exam.main;

import exam.base.Group;
import exam.base.Loggable;
import exam.base.OrgUnit;
import exam.unit.*;

public class MainOrgTest {

    public static void main(String[] args) {
        testSchool();
        testDepartment();
        testSchoolAsOrgUnit();
        testDepartmentAsLoggable();
        testStaff();
        testDepartmentGroup();
    }

    public static void testSchool() {
        // Test School
        System.out.println("Test School ---------------------");
        // Create new object of School
        School sc1 = new School(1,"SIT");
        // Test Getter Method
        System.out.format("%s : code[%d] balance[%.2f] log[%s]\n",sc1.getName(),sc1.getCode(),sc1.getBalance(),sc1.getLog());
        // Test earn() and spend()
        sc1.earn(10000);
        sc1.spend(2500);
        System.out.format("%s : code[%d] balance[%.2f] log[%s]\n",sc1.getName(),sc1.getCode(),sc1.getBalance(),sc1.getLog());
        System.out.println();
    }

    public static void testDepartment() {
        // Test Department
        System.out.println("Test Department ---------------------");
        // Create new object of School and Department
        School sc1 = new School(1,"SIT");
        Department d1 = new Department(11,"IT",sc1);
        // Test Getter Method
        System.out.format("%s : code[%d] school[%s] log[%s]\n",d1.getName(),d1.getCode(),d1.getSchool().getName(),d1.getLog());
        // Test setSchool()
        d1.setSchool(new School(2,"DS"));
        System.out.format("%s : code[%d] school[%s] log[%s]\n",d1.getName(),d1.getCode(),d1.getSchool().getName(),d1.getLog());
        System.out.println();
    }

    public static void testSchoolAsOrgUnit() {
        // Test School as OrgUnit
        System.out.println("Test School as OrgUnit ---------------------");
        // Create new object of School as ORGUNIT
        OrgUnit org1 = new School(1,"SIT");
        // Test Getter Method
        System.out.format("%s : code[%d] balance[%.2f] log[%s]\n",org1.getName(),org1.getCode(),((School)org1).getBalance(),org1.getLog());
        // Test earn() and spend()
        ((School) org1).earn(7500);
        ((School) org1).spend(500);
        // Test setName()
        org1.setName("DS");
        System.out.format("%s : code[%d] balance[%.2f] log[%s]\n",org1.getName(),org1.getCode(),((School)org1).getBalance(),org1.getLog());
        // Test clearLog()
        org1.clearLog();
        System.out.format("%s : code[%d] balance[%.2f] log[%s]\n",org1.getName(),org1.getCode(),((School)org1).getBalance(),org1.getLog());
        System.out.println();

    }

    public static void testDepartmentAsLoggable() {
        // Test Department as Loggable
        System.out.println("Test Department as Loggable ---------------------");
        // Create new object of Department as Loggable
        Loggable d1 = new Department(11,"IT",new School(1,"SIT"));
        // test getLog() interface method
        System.out.format("log[%s]\n",d1.getLog());
        // test clearLog() interface method
        d1.clearLog();
        System.out.format("log[%s]\n",d1.getLog());
        System.out.println();
    }

    public static void testStaff() {
        // Test for Staff Object
        System.out.println("Test Staff ---------------------");
        // Create new object of Staff
        Staff s1 = new Staff(111,"Alex", "Sulpher", new Department(11,"IT",new School(1,"SIT")));
        // Test Getter Method
        System.out.format("%s : fname[%s] lname[%s] affiliation[%s]\n",s1.getId(),s1.getFirstName(),s1.getLastName(),s1.getAffiliation().getName());
        // Test Setter Method
        s1.setId(222);
        s1.setFirstName("Peter");
        s1.setLastName("Parker");
        s1.setAffiliation(new Department(12,"CS",new School(1,"SIT")));
        System.out.format("%s : fname[%s] lname[%s] affiliation[%s]\n",s1.getId(),s1.getFirstName(),s1.getLastName(),s1.getAffiliation().getName());
        System.out.println();
    }

    public static void testDepartmentGroup() {
        // Test for Group Object
        System.out.println("Test Department Group ---------------------");
        // Create new object of Department to store in Group
        Department d1 = new Department(11,"IT",new School(1,"SIT"));
        Department d2 = new Department(12,"CS",new School(1,"SIT"));
        Department d3 = new Department(13,"DSI",new School(1,"SIT"));
        // Create new object of Group to store Department
        Group<Department> g1 = new Group<>(3);
        // Store Department in Group
        g1.append(d1);
        g1.append(d2);
        g1.append(d3);
        // Print list of Department in Group
        for (int i = 0; i < g1.getSize(); i++) {
            System.out.format("%s : code[%d] school[%s] log[%s]\n",g1.get(i).getName(),g1.get(i).getCode(),g1.get(i).getSchool().getName(),g1.get(i).getLog());
        }
    }
}
