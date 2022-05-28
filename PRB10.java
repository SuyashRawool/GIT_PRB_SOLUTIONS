/*
10.	Write a C program that checks if a given password is strong, weak or moderate as 
per the rules given below. 
i) If it contains a combination of digits, alphabets and special characters, then the password is strong. 
ii) If it contains a combination of only digits and alphabets, then the password is moderate. 
iii) If it contains only alphabets, then the password is weak. 
*/
public class PRB10 {
    public static String passCheck(String pass){
        boolean digit=false, sChar=false, alpha =false;
        for(char i: pass.toCharArray()){
            if(Character.isDigit(i))
                digit =true;
            else if(Character.isAlphabetic(i))
                alpha = true;
            else if(!Character.isDigit(i) && !Character.isAlphabetic(i) && !Character.isWhitespace(i))
                sChar = true;
            if(digit & sChar & alpha)
                return "Strong";       
        }
        
        if(digit & alpha)
           return "Moderate";      
        
        return "Weak";
    }
    
    public static void main(String[] args) {        
        System.out.println(passCheck("ASDCSC12s$"));
    }
    
}
