package Figur;

//Zaimplementuj interfejs Figur obejmujący figury różnego rodzaju z metodą move pozwalającą na ich przesuwanie i metodą flip pozwalającą na ich przerzucanie.
//        Zaimplementuj klasy Point, Line, Polygon, Group.
//        Przedostatnia klasa ma implementować wielokąty wyznaczone przez pewną liczbę punktów.
//        Ostatnia klasa ma implementować grupy figur (jak w przypadku edytorów typu Power Point).
//        Wszystkie klasy mają implementować interfejs Figur (lub klasę abstrakcyjną z abstrakcyjnymi metodami min. equals(Object o) żeby wymusić nadpisanie. Figure ma posiadać metody:
//        -move(double dx, double dy) przesuwającą daną figurę
//        -flip() przerzucająca daną figurę
//        -equals(Object o) sprawdzającą, czy figury są równe
//        -toString() zwracającą łańcuch znaków (String) reprezentujący daną figurę

interface Figur extends Cloneable {
    void move(double dx, double dy);
    void flip();
    boolean equals(Object o);
    String toString();
    Figur clone();  // Dodano metodę clone
}