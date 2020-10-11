import java.util.*; 
  
class Question_15
{ 
public static void order(int[] arr, int n) 
{ 
    Arrays.sort(arr); 
    for (int i = 0; i < n / 2; i++)  
        System.out.print(arr[i]+" "); 
    for (int j = n - 1; j >= n / 2; j--) 
    System.out.print(arr[j]+" "); 
      
} 
public static void main(String[] args) 
{ 
    Scanner sc=new scanner(System.in);
    int n=sc.nextInt(); 
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    order(arr, n); 
  
} 
}