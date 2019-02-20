public class Question_2a {
    
    public static void main(String[] args) {
        String str="hello new new days lorem ipsum lorem ipsum";
       
        String seprated[]=str.split("\\s");
        int count;
        int ar[] = new int[seprated.length];
        
        for (int i=0;i<seprated.length;i++){
    
            count=0;
            if(ar[i]==1) {


                continue;
            }

            
            
            for (int j=0;j<seprated.length;j++){
                
                if (seprated[i].equals(seprated[j])){
                    count+=1;
                    ar[j]=1;
                    
                }
                
            }
            System.out.println(seprated[i]+" occured "+ count+" times");
        }
        }
        
    
      
    
    
    
}
