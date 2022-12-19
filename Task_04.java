public class Task_03 {
    public static void main(String[] args) {
        reverseWords("the sky is blue");
    }
    
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0){
            if(s.chartAt(end) == " "){
                end -= 1;
                continue;
            }
            int start = end - 1;

            while (start >= 0 && s.chartAt(start) != " "){
                start -= 1;
            }
            sb.append(" ");
            sb.append(s.substring(start + 1, end + 1));
        }
        if (sb.length() > 0){
            sb.deleteCharAt(0);
        }
        return sb.ToString();
    }
}