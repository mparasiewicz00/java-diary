package Address;

public class AddressAndPersonalUsage {
    public static void main(String[] args) {
        Personal personalJan = new Personal("Jan", "Kochanowski", 1530,
                new Address("Sycyna Północna", "01-100", "Pod brzozą", 15));

        Personal personalAlbert = new Personal("Albert", "Einstein", 1879,
                "Ulm", "03-999", "EMC", 2 );

        Personal personalAlbertForEqual = new Personal(null, "Einstein", 1879,
                null, "03-999", "EMC", 2 );


        System.out.println(personalJan);
        System.out.println(personalAlbert);

        if (personalAlbert.equals(personalAlbertForEqual)) {
            System.out.println("Objects are idencical");
        } else {
            System.out.println("Objects not identical");
        }

    }
}
