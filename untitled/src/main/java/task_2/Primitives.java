package task_2;

public class Primitives {
    public  static  void main(String[] arrs){
        int a =0;
        int b =1;

        System.out.println(add(a,b));
        System.out.println(minus(a,b));
        System.out.println(mult(a,b));
        System.out.println(divide(a,b));



    }
    private static int add(int a, int b){
        return a+b;
    }
    private static int minus(int a, int b){
        return a-b;
    }
    private static int mult(int a, int b){
        return a*b;
    }
    private static int divide(int a, int b){
        return a/b;
    }
}
