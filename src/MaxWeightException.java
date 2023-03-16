public class MaxWeightException extends IllegalArgumentException {
  public MaxWeightException(int weight, int maxValue) {
    super(String.format("Максимальный вес пиццы: [%d] грамм. Ваш вес: [%s] грамм", maxValue,
            weight));
  }
}