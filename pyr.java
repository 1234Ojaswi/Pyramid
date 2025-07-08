class pyr{
      public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
      public static void main(String[] args) {
        int n = 5;
                System.out.println("Pyramid");
        pyramid(n);
      }
}
