package ListWithoutCollection;

public class AnchorTest {
    public static void main(String[] args) {
        Anchor anchor = new Anchor();
        Anchor anchor3 = anchor.clone();
        Anchor anchor2 = new Anchor();
        anchor.insertAtTheFront(1);
        anchor.insertAtTheFront(2);
        anchor.insertAtTheEnd(3);
        anchor.insertAtTheEnd(4);
        anchor.insertAtTheEnd(5);
        System.out.println(anchor);

        anchor2.insertAtTheFront(1);
        anchor2.insertAtTheFront(2);
        anchor2.insertAtTheEnd(3);
        System.out.println(anchor2);

        System.out.println(anchor.equals(anchor2));

        System.out.println(anchor == anchor3);

        anchor.revert();
        System.out.println(anchor);

    }
}
