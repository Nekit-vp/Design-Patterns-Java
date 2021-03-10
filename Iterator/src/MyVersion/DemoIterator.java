package MyVersion;

import java.util.*;

/*
boolean hasNext(). Возвращает true, если есть больше элементов. В противном случае возвращает false.
Object next(). Возвращает следующий элемент. Выдает исключение NoSuchElementException, если следующего элемента нет.
void remove(). Удаляет текущий элемент. Вызывает IllegalStateException, если была предпринята попытка вызвать метод remove(),
которому не предшествует вызов next().

void add(Object obj). Вставляет obj в список перед элементом, который будет возвращен при следующем вызове next().
boolean hasNext(). Возвращает true, если есть следующий элемент. В противном случае возвращает false.
boolean hasPrevious(). Возвращает true, если есть предыдущий элемент. В противном случае возвращает false.
Object next(). Возвращает следующий элемент. NoSuchElementException генерируется, если нет следующего элемента.
int nextIndex(). Возвращает индекс следующего элемента. Если следующего элемента нет, возвращает размер списка.
Object previous(). Возвращает предыдущий элемент. NoSuchElementException генерируется, если нет предыдущего элемента.
int previousIndex(). Возвращает индекс предыдущего элемента. Если предыдущего элемента нет, возвращает -1.
void remove(). Удаляет текущий элемент из списка. IllegalStateException генерируется, если remove() вызывается перед вызовом next() или previous().
void set (Object obj). Назначает объект текущему элементу. Этот элемент последний раз возвращается при вызове next () или previous ().

Для коллекций, которые реализуют List, вы также можете получить итератор, вызвав ListIterator.
Гораздо больший набор методов предоставляет другой итератор - интерфейс ListIterator.


*/
public class DemoIterator {
    public static void main(String args[]) {
        // Create an array list
        ArrayList al = new ArrayList();
        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Use iterator to display contents of al
        System.out.print("Original contents of al: ");
        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Modify objects being iterated
        ListIterator litr = al.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        // Now, display the list backwards
        System.out.print("Modified list backwards: ");

        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
