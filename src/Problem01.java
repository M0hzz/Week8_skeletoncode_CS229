public class Problem01 {
    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */

    /**
     *
     * @author MoaathAlrajab
     */
        public static boolean isPrime(int n){
            boolean x = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    x = false;
                    break;
                }
            }
            return x;
        }
        public static long getSumOfPrimes(int n){
            long sum = 0;
            for(int x = 2; x < n; x++){
                if(isPrime(x) == true){
                    sum += x;
                }
            }
            // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
            //          Test your solution
            //          Analyze its space and time
            return sum;
        }
        public static void main(String args[]){
            System.out.println(isPrime(4));
            System.out.println(getSumOfPrimes(5));
        }
}

