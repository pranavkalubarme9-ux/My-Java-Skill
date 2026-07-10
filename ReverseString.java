public class ReverseStringBuilder {
    public static void main(String[] args) {
        String original = "Hello Pranav";
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
