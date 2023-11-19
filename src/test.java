import java.util.*;

public class test {
    public static void main(String[] args) {
        /*
        list (przechowywanie klientow i losowanie z nich)
        set (pozwala na przypisanie imiona do produktu, ale są to wartosci unikalne)
        map (klucz imie a wartość liczba osob z danym imieniem)
        queue (pozwala na kolejkowanie i usuwanie z kolejki)
         */
        List<String> people = List.of("Pawel", "kamil");


        //ArrayList
        //ArrayList (lista tablicowa) – dynamiczna tablica, która odpowiednio zwiększa swój rozmiar. Domyślny rozmiar początkowy to 10.
        //Zalety: dostęp do losowych danych z ArrayListy jest bardzo szybki,
        // jak również szybkie jest wstawianie elementu na koniec listy czyli pierwsze wolne miejsce.
        //Wady: niska wydajność w przypadku wstawiania lub usuwania elementów w środku tablicy,
        // ponieważ wiąże się to z przesuwaniem sporej ilości elementów leżących „na prawo”.

        //Metody Listy:
        //•	add(E e) – dodaje element;
        //•	addAll(Collection c) – dodaje wszystkie element ze wskazanej kolekcji;
        //•	clear() – usuwa wszystkie elementy z listy;
        //•	get(int index) – zwraca element spod danego indeksu;
        //•	remove(int index) – usuwa element spod danego indeksu;
        //•	remove(Object o) – usuwa pierwsze wstąpienie obiektu, dla którego porównanie equals() z tym z argumentu zwróci true;
        //•	sort(Comparator c) – sortuje listę zgodnie z przekazanym komparatorem;
        //•	size() zwraca ilość elementów listy;
        List<Integer> integers = new ArrayList<>();
        integers.add(null);
        integers.add(null);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(0, 666);
        integers.add(3, -100);
        integers.remove(Integer.valueOf(1));
        System.out.println(integers);

        List<Integer> randomIntegers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomIntegers.add(random.nextInt(6) + 10); // (nextInt(majwyzszy + 1 - najniżwszy) + najniższy)
        }
        System.out.println(randomIntegers);


        //Linked list
        //LinkedList (lista podwójnie wiązana) – nie wykorzystuje wewnątrz tablicy, lecz wspomaga się obiektami dodatkowej klasy wewnętrzej,
        // tzw: NODE’ami czyli węzłami, które wskazują na poprzednika i następnika znajdującego się na liście.
        // Czyli element zawiera trzy referencje – na obiekt właściwy, na poprzednika i na następnika.
        //Zalety: szybkie wstawianie i usuwanie elementów ponieważ aktualizowane są tylko informacje o następnikach i poprzednikach odpowiednich elementów
        // (nie ma potrzeby przesuwania całego zbioru danych).
        //Wady: dostęp do losowych danych z listy jest bardzo wolny, ponieważ trzeba iterować po kolei po obiektach.
        // Jeżeli obiekt jest w pierwszej połowie to iteracja następuje od początku, jeżeli w drugiej połowie to iteracja następuje od końca.
        //Metody są te same co w ArrayLiscie, dodatkowo:
        //•	addFirst() / removeFirst() – dodanie i usunięcie elementu z początku listy;
        //•	addLast() / removeLast() - dodanie i usunięcie elementu z końca listy;
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        numbers.removeLast();
        System.out.println(numbers);

        //TODO niemodyfikowalne listy

        List<Integer> list = Arrays.asList(5, 10, 15, null);
        //System.out.println(list);
        // list.add(12);
        System.out.println(list);
        List<Integer> list2 = List.of(5, 10, 15);
        System.out.println(list2);
        //list2.add(12);
    }
}
