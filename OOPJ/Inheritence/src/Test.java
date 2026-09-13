public class Test {

    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        //Parent method by Parent object
        p.parentMethod();

        //Child method by Child object
        c.childMethod();

        //Parent method by Child object
        c.parentMethod();
    }
}