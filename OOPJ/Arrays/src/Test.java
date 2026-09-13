class Test {

    public static void main(String[] args) 
    {

        ComplexNumber[] arr = new ComplexNumber[5];

        for (int in = 0; in < 5; in++)
        {

            arr[in] = new ComplexNumber();

            System.out.print("Enter number1 for object " + (in + 1) + ": ");
            arr[in].setNumber1(ConsoleInput.getInt());

            System.out.print("Enter number2 for object " + (in + 1) + ": ");
            arr[in].setNumber2(ConsoleInput.getInt());
        }

        System.out.println("\nResults of multiplication:");

        for (int in = 0; in < 5; in++) {

            System.out.println(
                "Object " + (in + 1) + " result: "
                + arr[in].computeComplexNumber()
            );
        }
    }
}