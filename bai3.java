public class bai3 {
   public static void main(String[] arg){
       int a = 1;
       int b = 2;
       int c = 3;
       int d = 4;
       int a1 = Math.max(a,b);
       int a2 = Math.max(c,d);
       System.out.println(Math.max(a,b));
       System.out.println(Math.max(c,d));
       String s = a1 > a2 ? "so lon nhat la " + a1 : "so lon nhat la " + a2;
       System.out.println(s);
   }
}
