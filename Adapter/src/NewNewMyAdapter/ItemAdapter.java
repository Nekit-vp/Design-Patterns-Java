package NewNewMyAdapter;

public class ItemAdapter implements Object{

    private Item item;

    private static final double cmInInches = 2.54;

    //     * Конструктор принимает начальную позицию элемента в сантиметрах
    public ItemAdapter(double initialPosition) {
        item = new Item(convertCmToInches(initialPosition));
        System.out.printf("Now initial position is %.2f cm\n", initialPosition);
    }

    //     * @param cm смещение в сантиметрах
    public void move(double cm) {
        item.move(convertCmToInches(cm));
        System.out.printf("Move item to %.2f cm\n", cm);
    }

    //     * Возврашает текущую позицию в сантиметрах
    public double getPosition() {
        double position = convertInchesToCm(item.getPosition());
        System.out.printf("Current position is %.2f cm\n", position);
        return position;
    }

    //     * Конвертирует сантиметры в дюймы
    private double convertCmToInches(double cm) {
        return cm/cmInInches;
    }

//     * Конвертирует дюймы в сантиметры
    private double convertInchesToCm(double inches) {
        return inches*cmInInches;
    }
}
