public class Add{
    public static int addition(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = addition(a, b);
        System.out.println("The sum of "+a+" and "+b+" is "+result);
    }
}