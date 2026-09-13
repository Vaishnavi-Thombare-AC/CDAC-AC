public class TestMember {

    public static void main(String[] args) {

        PrimeMembers member = new PrimeMembers();

        System.out.print("Enter name: ");
        member.setName(ConsoleInput.getString());

        System.out.print("Enter age: ");
        member.setAge(ConsoleInput.getInt());

        System.out.print("Enter phone number: ");
        member.setPhoneNumber(ConsoleInput.getString());

        System.out.print("Enter address: ");
        member.setAddress(ConsoleInput.getString());

        System.out.print("Enter salary: ");
        member.setSalary(ConsoleInput.getDouble());

        System.out.print("Enter joining year: ");
        member.setJoiningYear(ConsoleInput.getInt());

        System.out.print("Enter joining fees: ");
        member.setJoiningFees(ConsoleInput.getDouble());

        System.out.print("Enter isActive (true/false): ");
        member.setIsActive(Boolean.parseBoolean(ConsoleInput.getString()));

        System.out.println("\nMember Details:");

        member.display();
    }
}