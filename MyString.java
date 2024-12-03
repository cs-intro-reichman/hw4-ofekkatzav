public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
       
        return str.toLowerCase();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) { //happy unhappy
                                                                
        String str3 ="";                                                      
        
        if(str1.length() < str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            for(int j = str3.length(); j < str2.length(); j++){
                if((str1.charAt(i) == str2.charAt(j)) || str1.charAt(i) == 32 ){
                    str3 += str1.charAt(i);
                    break;
                }
            }
        }
        if(str2.length() != str3.length())
            return false;
        
        for (int i = 0; i < Math.min(str2.length(),str3.length()); i++) {
            if(str2.charAt(i) != str3.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
