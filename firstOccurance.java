public class firstOccurance {
    public static void printIndex(String str, String s) {
        int pos = str.indexOf(s);

        if (pos == -1)
            System.out.println("NONE");

        while (pos != -1) {
            System.out.print(pos + " ");
            pos = str.indexOf(s, pos + 1);
        }
    }

    public static void main(String[] args) {
        String str1 = "GeeksforGeeks";
        String str2 = "Geeks";
        printIndex(str1, str2);

    }
}

