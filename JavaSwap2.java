import java.lang.reflect.Field;

public class JavaSwap2{
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
        int a = 5;
        int b = 3;
        System.out.format("a:%d b:%d\n", a, b);
        swap(a, b);
        System.out.format("a:%d b:%d\n\n", a, b);
        System.out.format("Four:%d Eight:%d\n", 4, 8);
        swap(4, 8);
        System.out.format("Four:%d Eight:%d\n", 4, 8);
    }
}