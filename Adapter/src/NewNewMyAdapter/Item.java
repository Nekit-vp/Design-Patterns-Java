package NewNewMyAdapter;

public class Item implements Object{

    private double position = 0.0;

     //* Конструктор задает начальное положение элемента
    public Item(double initialPosition) {
        position = initialPosition;
        System.out.printf("Now initial position is %.2f inches\n", initialPosition);
    }

    // Перемещает объект на inches дюймов
    public void move(double inches) {
        position +=inches;
        if (inches > 0) {
            System.out.printf("Move forward to %.2f inches\n", inches);
        } else if (inches < 0) {
            System.out.printf("Move backward to %.2f inches\n", Math.abs(inches));
        } else {
            System.out.println("Not moved");
        }
    }

    public double getPosition() {
        System.out.printf("Current position is %.2f inches\n", position);
        return position;
    }
}
