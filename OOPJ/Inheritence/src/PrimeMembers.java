public class PrimeMembers extends Member {

    private int joiningYear;
    private double joiningFees;
    private boolean isActive;

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningFees(double joiningFees) {
        this.joiningFees = joiningFees;
    }

    public double getJoiningFees() {
        return joiningFees;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void display() {

        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());

        System.out.println("Joining Year: " + joiningYear);
        System.out.println("Joining Fees: " + joiningFees);
        System.out.println("Is Active: " + isActive);
    }
}