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
        int n = str.length();
        char [] arr = new char [n];
        for (int i=0; i < n; i++ ) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                arr[i] = (char)(c+32);
            } else {
                arr[i] = c;
            }
        }
        return new String(arr);
     
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
   public static boolean contains(String str1, String str2) {

    if (str2.length() == 0) {
        return true;
    }

    if (str2.length() > str1.length()) {
        return false;
    }

    boolean isSub;
    int lastIndex = str1.length() - str2.length() + 1;

    for (int i = 0; i < lastIndex; i++) {
        if (str2.charAt(0) == str1.charAt(i)) {
            isSub = true;
            for (int j = 0; j < str2.length() && isSub; j++) {
                if (str2.charAt(j) != str1.charAt(i + j)) {
                    isSub = false;
                }
            }
            if (isSub) {
                return true;
            }
        }
    }

    return false;
}
}
