public class Conversions {
    public static String decimalToBinary(int num){
        String bin="";
        while(num>0){
            int rem=num%2;
            bin=rem+bin;
          num=num/2;  
        }
        return bin+"";
    }

    public static String binaryToDecimal(String s){
        int dec=0; int twoMul=1;
        for(int i=s.length()-1; i>=0; i--){
            char c=s.charAt(i);
            if(c!='0' && c!='1'){
                return "Invalid input";
            }
            dec=dec+(c-48)*twoMul;
            twoMul *=2;
        }
        return dec+"";
    }

    public static String decimalToOctal(int num){
        String oct="";
        while(num>0){
            int rem=num%8;
            oct=rem+oct;
          num=num/8;  
        }
        return oct+"";
    }

    public static String octalToDecimal(int num){
        int dec=0; int eightMul=1;
        while(num>0){
            int rem=num%10;
            if(rem>7){
                return "Invalid input";
            }
            dec=dec+rem*eightMul;
            eightMul *=8;
          num=num/10;  
        }
        return dec+"";
    }

    public static String decimalToHexadecimal(int num){
        String hex="";
        while(num>0){
            int rem=num%16;
            if(num<=9){
                hex=rem+hex;
            }
            else{
                hex=(char)(rem+55)+hex;
            }
          num=num/16;  
        }
        return hex+"";
    }

    public static String hexaDecimalDecimal(String s1){
        int dec=0; int sixteenMul=1;
        for(int i=s1.length()-1; i>=0; i--){
            char c=s1.charAt(i);
             if(c>='0' && c<='9'){
                dec=dec+(c-48)*sixteenMul;
            }
            else if(c>='A' && c<='F'){
                dec=dec+(c-55)*sixteenMul;
            }
            else if(c>='a' && c<='f'){
                dec=dec+(c-87)*sixteenMul;
            }
           else{
            return "Invalid input";
           }
            sixteenMul *=16;
        }
        return dec+"";
    }
    
}
