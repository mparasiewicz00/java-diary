public class MethOverloading {
    public static void main(String[] args) {
        System.out.println(comparsion(1,2));
        System.out.println(comparsion(1.0,2.0));
        System.out.println(comparsion(true, true));
        System.out.println(comparsion('a','A'));
        System.out.println(comparsion("Ala","Kot"));
        int[] taba = {1,2,3,4,5};
        int[] tabb = {1,2,3,4,5};
        System.out.println(comparsion(taba,tabb));

        String[] tabc = {"Ala", "Ma"};
        String[] tabd = {"Ala", "Ma"};
        System.out.println(comparsion(tabc,tabd));
    }

    public static boolean comparsion(int numberA, int numberB){
        boolean compared = false;
        return numberA > numberB ? true : false;
    }

    public static boolean comparsion(double numberA, double numberB){
        return numberA > numberB ? true : false;
    }

    public static boolean comparsion(boolean firstarg, boolean secondarg){
        return firstarg == secondarg ? true: false;
    }

    public static boolean comparsion(char firstarg, char secondarg){
        return firstarg == secondarg;
    }

    public static boolean comparsion(String firstarg, String secondarg){
       return firstarg.equals(secondarg);
    }

    public static boolean comparsion(int[] firstTab, int[] secondTab){
        boolean compared = true;

        if(firstTab.length != secondTab.length) {
            compared = false;
        } else {
            for (int i = 0; i <= firstTab.length -1; i++){
                if(firstTab[i] != secondTab[i]){
                    compared = false;
                    break;
                }
            }
        }
        return compared;
    }

    public static boolean comparsion(String[] firstTab, String[] secondTab) {
        boolean compared = true;
        if(firstTab.length != secondTab.length) {
            compared = false;
        } else {
            for (int i = 0; i <= firstTab.length -1; i++){
                if(!firstTab[i].equals(secondTab[i])){
                    compared = false;
                    break;
                }
            }
        }


        return compared;
    }




}
