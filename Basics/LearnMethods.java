public class LearnMethods {
    public static void main(String[] args) {
        greet();
    }

    static void greet(){
        System.out.println("Hello world!");
    }
    public static void average(int a, int b){
        int avg = (a + b) / 2;
    }
    public static void mathfunctions(){
        int a = 4;
        int b = 6;
        System.out.println("minimum is : " + Math.min(a, b));
        System.out.println("maximum is : " + Math.max(a, b));
        System.out.println("power is : " + Math.pow(a, b));
        System.out.println("Square root is : " + Math.sqrt(a));
        
    }

}
