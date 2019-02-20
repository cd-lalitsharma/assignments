public class Question_5 {
    
    public static void main(String[] args) {
        System.out.println(" Question . Find common elements between two arrays.");
        int[] array1= {10,1,2,3,4,5,6,7,8,9};
        int[] array2= {10,1,22,3,24,15,26,7,38,9,1};
        int [] duplicateElements= new int[array1.length];
        int [] checkedIndex= new int[array1.length];
        int index=0,matched=0;
        for (int i=0;i<array1.length;i++){
            
          
            
            for (int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    
                    duplicateElements[index]=array1[i];
                    checkedIndex[i]=1;
                    if (matched==0){
                        index+=1;
                        matched=1;
                    }
                }
            }
            
            matched=0;
        }
    
        for (int i=0;i<duplicateElements.length;i++
             ) {
            System.out.println(duplicateElements[i]);
        }
    
    }
}
