public class Task_01 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder merge = new StringBuilder();

        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length())
                merge.append(word1.charAt(i));

            if (i < word2.length())
                merge.append(word2.charAt(i));
        }

        return merge.toString();
    }

}