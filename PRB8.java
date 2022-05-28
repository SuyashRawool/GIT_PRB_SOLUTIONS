public class PRB {
    public static boolean check(String check){
        int cnt =1;
        char prev = '#';
        for(char i : check.toCharArray()){
            
            if(i == prev){
                cnt++;
                prev = i;
            }else{
                prev = i;
                cnt =1;
            } 
            if(cnt>=3)
                return true;
        }
        return false;
    }
    
    public static String remove3orMore(String str){
        while(check(str)){       
            int cnt=1;
            char delL='#';
            char ptr = str.charAt(0);
            for(int i=1; i<str.length(); i++){
                
                if(ptr != str.charAt(i)){
                    if(cnt>=3){
                        delL =ptr;
                        break;
                    }
                    ptr = str.charAt(i);
                    cnt=1;
                    
                }else{
                    cnt++;
                }
            }
            if(cnt>=3){              
                    str = str.substring(0,str.indexOf(delL)) + str.substring(str.indexOf(delL)+cnt,str.length());              
            }
        }
        return str;
    }
    
    public static void main(String[] args) {
        String str = new String("MNHHHHNNM");
        System.out.println(remove3orMore(str));
    }
    
}
