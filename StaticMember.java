public class StaticMember {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.name = "Piotr";
        dad.age = 32;

        FamilyMember mom = new FamilyMember();
        mom.name = "Anna";
        mom.age = 31;


        FamilyMember kid = new FamilyMember();
        kid.name = "Zosia";
        kid.age = 3;

        show(mom);
        show(dad);
        show(kid);

    }

    static void show(FamilyMember familyMember) {
        System.out.print(familyMember.name);
        System.out.print(" ");
        System.out.print(familyMember.surname);
        System.out.print(" ");
        System.out.print(familyMember.age);
        System.out.print(" lat/a");
    }
}

class FamilyMember {
    static String surname = "Mowak";
    String name;
    int age;
    }