public class Question_6 {
    public static void main(String[] args) {
    
        System.out.println("Question. There is an array with every element repeated twice except one. Find that element");
        
        int arr[]= {1,1,2,2,3,3,5,5,6,6,7,7,8,8,90};
        int count=0;
        
        for (int i=0;i<arr.length;i++){
            count=0;
            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count+=1;
                }
            }
            
            if (count==1){
                System.out.println("Single element in array is "+arr[i]);
                break;
            }
        }
        
    }
}
