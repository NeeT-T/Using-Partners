package atividadeparadigma;
public class StandardDiscounts implements IDiscountCalculatorAdapter{
    
    @Override
    public double DiscountCalculator(Sale sale) {
        return sale.getTotal();
    }
}
