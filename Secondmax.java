import java.util.Scanner;

public class Secondmax {
   public Secondmax() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 < 2) {
         System.out.println("can't possible to find second maximum element");
      } else {
         int[] var3 = new int[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var1.nextInt();
         }

         int var7 = var3[0];
         int var5 = Integer.MIN_VALUE;

         for(int var6 = 1; var6 < var2; ++var6) {
            if (var3[var6] > var7) {
               var5 = var7;
               var7 = var3[var6];
            } else if (var3[var6] < var7 && var3[var6] > var5) {
               var3[var6] = var5;
            }
         }

         if (var5 == Integer.MIN_VALUE) {
            System.out.println("Secondmax not found");
         } else {
            System.out.println("Second maximum element is :" + var5);
         }

      }
   }
}
