public class StringTabCompare {
    public static void main(String[] args) {
        String[] compstring = {"Ala", "Ma", "Kota"};
        String[] compstring2 = {"Ala", "Ma", "Kota"};
        boolean isidentical = true;


        if(compstring.length != compstring2.length){
            isidentical = false;
        } else {
            for (int i = 0; i < compstring.length; i++){
                if (!compstring[i].equals(compstring2[i])){
                    isidentical = false;
                    break;
                }
            }
        }

        if (isidentical){
            System.out.println("Tablice są takie same.");
        } else {
            System.out.println("Tablice się różnią");
        }


    }
}
