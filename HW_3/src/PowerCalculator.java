public class PowerCalculator {
    public static int calculatePower(int a, int b) throws InvalidInputException {
        if (a == 0) {
            throw new InvalidInputException("Основание не может быть нулем");
        }
        if (b <= 0) {
            throw new InvalidInputException("Степень должен быть больше нуля");

        } else {
            return (int) Math.pow(a, b);
        }
    }
}
