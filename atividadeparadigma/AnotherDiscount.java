package atividadeparadigma;
public class AnotherDiscount implements IDiscountCalculatorAdapter{

    @Override
    public double DiscountCalculator(Sale sale) {
        return sale.getTotal() - (sale.getTotal() * 0.5);
    }
    
}
