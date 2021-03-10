//пример будет представлять собой пользовательский объект документа, состоящий из конкретных элементов JSON и XML;
// элементы имеют общий абстрактный суперкласс, элемент.

package Visitor;

public abstract class Element {

    public String uuid;

    public Element(String uuid) {
        this.uuid = uuid;
    }

    public abstract void accept(Visitor v);
}