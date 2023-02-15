public class Main {

    public static void main(String[] args) {
        String[] countdown  = {"one","two","three"};
        String[] names = {"Sjaak","Sjimmy","Sjonny"};
        System.out.println(countdown[2]);
        System.out.println(countdown[1]);
        System.out.println(countdown[0]);
        System.out.println("boom!");
        for (String name : names) { //for (int i = 0; i < names.length; i++)
            System.out.println(name);
        }
        for (int i = 0; i < countdown.length; i++) {
            System.out.println(countdown[i] + names[i]);
        }
    }

}
