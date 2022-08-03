public class Source {
    public static void main(String[] args) {
    String str = "5 years old";
        System.out.println(howOld(str)==5);
    }
    public static int howOld(final String herOld) {
    return Integer.parseInt(String.valueOf(herOld.charAt(0)));
    }
}
