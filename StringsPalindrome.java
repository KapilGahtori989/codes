public class StringsPalindrome{
    public static void main(String[] args) {
      String firstName = "Kapil";
      String lastName ="Gahtori";
      String fullName = firstName +" "+lastName;
      System.out.println(fullName);
      printLetters(fullName);
      //check if below number is a palindrome or not
      String pal = "racecar";
      checkPalindrome(pal);
    }
    private static void printLetters(String fullName){
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");
        }
        System.out.println();
    }

    private static void checkPalindrome(String pal){
     //we cant reverse String that easily in java so we use binary search to compare each element
     int start=0;
     int end=pal.length()-1;
     while(start<end){
        if(pal.charAt(start)==pal.charAt(end)){
            start++;
            end--;
        }else{
            System.out.println("it is not a palindrome");
            break;
        }
    }

if(start==end){
    System.out.println("it is a palindrome");
}    
    }
}