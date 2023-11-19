package ListWithoutCollection;

import java.util.Objects;

public class Anchor implements Cloneable {
    private Element first;

    public Anchor() {
        this.first = null;
    }

    public void insertAtTheFront(int x) {
        Element newElement = new Element(x);
        newElement.nextElement = first;
        first = newElement;
    }

    public void insertAtTheEnd(int x) {
        Element newElement = new Element(x);
        if (first == null) {
            first = newElement;
        } else {
            Element temp = first;
            while (temp.nextElement != null) {
                temp = temp.nextElement;
            }
            temp.nextElement = newElement;
        }
    }

    public void removeFirst() {
        if (first != null) {
            first = first.nextElement;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Element current = this.first;
        while (current != null) {
            sb.append(current.val);
            if (current.nextElement != null) {
                sb.append(",");
            }
            current = current.nextElement;
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Anchor anchor = (Anchor) o;

        Element elementOfList1 = this.first;
        Element elementOfList2 = anchor.first;

        while (elementOfList1 != null && elementOfList2 != null) {
            if (elementOfList1.val != elementOfList2.val) {
                return false;
            }
            elementOfList1 = elementOfList1.nextElement;
            elementOfList2 = elementOfList2.nextElement;
        }

        return elementOfList1 == null && elementOfList2 == null;
    }

    @Override
    protected Anchor clone() {
        try {
            Anchor cloned = (Anchor) super.clone();
            if (this.first != null) {
                cloned.first = new Element(this.first.val);
                Element currentOriginal = this.first;
                Element currentCloned = cloned.first;

                while (currentOriginal.nextElement != null) {
                    currentCloned.nextElement = new Element(currentOriginal.nextElement.val);
                    currentOriginal = currentOriginal.nextElement;
                    currentCloned = currentCloned.nextElement;
                }
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }

    public void revert() {
        if (first == null || first.nextElement == null) {
            return; // No need to reverse if the list is empty or has only one element
        }

        Element previous = null;
        Element current = first;
        Element next = null;
        while (current != null) {
            next = current.nextElement; // Store next node
            current.nextElement = previous; // Reverse the current node's pointer
            previous = current; // Move pointers one position ahead
            current = next;
        }
        first = previous; // Update the head to new first node
    }

}