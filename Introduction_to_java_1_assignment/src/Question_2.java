import java.util.Arrays;

public class Question_2 {
    
    public static void main(String[] args) {
        System.out.println("Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?");
        
        String str = "aabbbccssaacdaskdnlajdklasssssssddd";
        
        char a[]=str.toCharArray();
        int already[]= new int[a.length];
        int count=1;
        
        for (int i=0;i<a.length;i++){
                count=1;
           if(already[i]==1){
               continue;
           }
           
           for (int j=0;j<a.length;j++){
               
                    if(a[i]==a[j]){
                        count+=1;
                        already[j]=1;
                    }
                }
            System.out.println(a[i]+" occured "+count+ " times");
        }
    }
}
