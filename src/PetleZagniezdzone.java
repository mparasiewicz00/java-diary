public class PetleZagniezdzone {
    public static void main(String[] args) {
        petla_glowna:
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 1 ) {
                continue;
            }

            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
                if (j > i) {
                    continue petla_glowna;
                }
            }
        }
    }
}
