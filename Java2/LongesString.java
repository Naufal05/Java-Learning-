public class LongesString {
    public static void main(String[] args) {
        String[] array = { "Almabetter", "Newton School", "Edureka" };
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        System.out.format("Longest string: `%s`/n", longestString);
    }

}
