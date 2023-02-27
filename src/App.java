public class App {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int f1 = 0;
        int f2 = 1;

        for (int i = 1; i <= n; i ++) {
            int a = f1 + f2;
            f1 = f2;
            f2 = a;
        }
        System.out.println(f1);
    }
}

// public class App{
   
//     // Function to print the fibonacci series
//     static int fib(int n)
//     {
//         // Base Case
//         if (n <= 1)
//             return n;
  
//         // Recursive call
//         return fib(n - 1)
//             + fib(n - 2);
//     }

//     public static void main(String args[]){
//         int n;

//         if (args.length > 0) {
//             try {
//                 n = Integer.parseInt(args[0]);
//                 System.out.println(fib(n));
//             } catch (NumberFormatException e) {
//                 System.err.println("Argument" + args[0] + " must be an integer.");
//                 System.exit(1);
//             }
//         }
//     }
// }