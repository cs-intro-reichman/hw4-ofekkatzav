public class Primes {
    public static void main(String[] args) {
    
    int n = Integer.parseInt(args[0]);
    boolean[] isPrime = new boolean[n+1];
        
        for (int i = 0; i < isPrime.length; i++) {
            if(i<=1)
            isPrime[i] = false;
            else
            isPrime[i] = true;
        }
        for (int j = 2; j < n; j++) {
            for(int i = 3; i < isPrime.length; i++) {
                if(i % j == 0 && i != j ){//if index is even >2
                    isPrime[i] = false;
                }
            }
        }
        for (int i = 0; i < isPrime.length; i++) {
            if(isPrime[i])
            System.out.println(i);
        }
    }



}

