package exercises;

import java.util.StringJoiner;

public class StringJoinerEX {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(";", "{", "}");
        StringJoiner sj2 = new StringJoiner(",", "[", "]");
        sj1.add("A").add("B");
        sj2.add("C").add("D");
        System.out.println(sj1.merge(sj2).toString());

        StringBuffer sb = new StringBuffer("135");
        sb.replace(0, 5, "6789").insert(0, "12345");
        System.out.println(sb);
        System.out.println(sb.reverse().delete(0, 5));
        System.out.println(sb);
    }
}
