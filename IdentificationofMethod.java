public class IdentificationofMethod {

    public int additionofnumbers(int a, int b, int c) {

        int add = a + b + c;
        return add;
    }

    public static void main(String[] args) {

        IdentificationofMethod obj = new IdentificationofMethod();

        int result = obj.additionofnumbers(20, 30, 40);

        System.out.println("Addition is " + result);
    }
}