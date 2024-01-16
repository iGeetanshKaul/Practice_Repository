package fifthPackage;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch;
            System.out.print(series + " ");
        }
        System.out.println();
        System.out.print(series);
    }
}