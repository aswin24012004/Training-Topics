class Loops {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int n = a.length; // corrected: array uses .length, not .lenth() 

        System.out.println("=== For Loop ===");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("=== While Loop ===");
        int i = 0;
        while (i < n) {
            System.out.print(a[i] + " ");
            i++;
        }
        System.out.println();

        System.out.println("=== Do-While Loop ===");
        i = 0;
        do {
            System.out.print(a[i] + " ");
            i++;
        } while (i < n);
        System.out.println();

        System.out.println("=== For-Each Loop ===");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
