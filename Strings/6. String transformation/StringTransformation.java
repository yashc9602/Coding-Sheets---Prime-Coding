public class StringTransformation {
    public static String transformString(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a')
                charArray[i] = 'b';
            else if (charArray[i] == 'b')
                charArray[i] = 'a';
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "abaabbcc";
        System.out.println(transformString(str));
    }
}