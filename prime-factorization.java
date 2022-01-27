impoert java.io.*;

class Find{
  public static void main(String args[]) throws IOException{
  BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    
   int t= Integer.parseInt(read.readLine());
    
   while(t--> 0){
     int n= Integer.parseInt(read.readLine());
     printPrimeFactorization(n);
     System.out.println();
   }
  }
}

public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

public static void printPrimeFactorization(int n){
    for (int i = 2; i <= n; i++) {
       if (isPrime(i)) {
           int x = i;
           while (n % x == 0) {
               System.out.print(i + " ");
               x *= i;
           }
       }
   }
    
}
