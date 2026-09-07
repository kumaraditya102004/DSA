public class polymorphism {
    public static void main(String []args){
        polymorphism p = new polymorphism();
        System.out.println(p.add(5, 10));
        System.out.println(p.add(5.5, 10.5));
    }

 

    int add(int a, int b){
        return a+b;

    }

    int add(double a, double b){
        return (int)(a + b);
    }
    
}
 