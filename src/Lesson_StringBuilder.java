public class Lesson_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" frend");
        System.out.println(sb.toString());
    }
}
