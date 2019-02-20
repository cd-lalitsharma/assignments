public class Question_4 {
    public static void main(String[] args) {
        
        
        System.out.println("Calculate the number & % Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String");
        String str ="_This Is the % (percentage) Symbol used on Numbers like [1,2,3,4] not on #$^&";
        
        int count[] = new int[5];
        
        char strInArray []= str.toCharArray();
        
        for (int i=0;i<strInArray.length;i++){
        
            if (strInArray[i] >='a' && strInArray[i] <='z'){
                count[0]+=1;
            }else if(strInArray[i] >='A' && strInArray[i] <='Z'){
                count[1]+=1;
            }else if(strInArray[i] >=0 && strInArray[i] <=9){
                count[2]+=1;
            }else if(strInArray[i] =='_'){
                count[3]+=1;
            }else if(strInArray[i] =='%'){
                count[4]+=1;
            }
        }
        
        System.out.println(count[4]);
        
        
    }
}
