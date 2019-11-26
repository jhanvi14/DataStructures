import java.util.*;

public class pretopost {

    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        String str = S.next();

        Stack<String> st = new Stack<String>();

        String res = "";
        String str1 = "";
        String str2 = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
            {
                String s = "";
                s = s + str.charAt(i);
                st.push(s);
            }
            else
            {
                if (!st.empty())
                {
                    str1 = st.pop();
                }
                if (!st.empty())
                {
                    str2 = st.pop();
                }
                res = str1 + str2 + str.charAt(i);
                st.push(res);
            }
        }
        System.out.println(st.pop());
    }

}
import java.util.*;

public class PreToPost {

    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        String str = S.next();

        Stack<String> st = new Stack<String>();

        String res = "";
        String str1 = "";
        String str2 = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
            {
                String s = "";
                s = s + str.charAt(i);
                st.push(s);
            }
            else
            {
                if (!st.empty())
                {
                    str1 = st.pop();
                }
                if (!st.empty())
                {
                    str2 = st.pop();
                }
                res = str1 + str2 + str.charAt(i);
                st.push(res);
            }
        }
        System.out.println(st.pop());
    }

}
