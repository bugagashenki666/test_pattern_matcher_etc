package test_stringbuilder1;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        sb1.append("java");
        sb2.append("java");

        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.hashCode() == sb2.hashCode());
    }
}
