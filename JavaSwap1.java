import java.lang.reflect.Field;

public class JavaSwap1{
    public static void swap(int a, int b){
        try{
            Field t = Integer.class.getDeclaredField("value");
            t.setAccessible(true);
            Integer temp = new Integer(Integer.MIN_VALUE);
            t.set(temp, a);
            t.set(a, b);
            t.set(b, temp);
            t.set(temp, Integer.MIN_VALUE);
        }catch(Exception e){
        }  
    
    }
    public static void main(String []args){
        Integer a = 5;
        Integer b = 3;
        System.out.format("a:%d b:%d a*2:%d b.pow(3):%d\n", a, b, a*2, (int)Math.pow(b, 3));
        swap(a, b);
        System.out.format("a:%d b:%d a*2:%d b.pow(3):%d\n\n", a, b, a*2, (int)Math.pow(b, 3));
        System.out.format("Four:%d Eight:%d\n", 4, 8);
        swap(4, 8);
        System.out.format("Four:%d Eight:%d\n", 4, 8);
    }
}