import java.util.*;

class PrimeCoding {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newstr = "";
        for (int i = 0; i < str.length(); i++)
            if(str.charAt(i) != ' ')
                newstr += str.charAt(i);
        char [] arr = newstr.toCharArray();
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}