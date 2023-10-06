import java. util. *;
public class longestCommonPrefix {

    public static String prefix(String[] str) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();

    }

    public static void main(String[] args) {
        String str[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};
        String ans= prefix(str);
        if (ans.length() > 0) {
            System.out.printf("The longest common prefix is - %s",
                    ans);
        } else {
            System.out.printf("There is no common prefix");
        }




        }

    }


