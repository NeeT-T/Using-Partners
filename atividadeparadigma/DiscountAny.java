package atividadeparadigma;
public class DiscountAny implements IDiscountCalculatorAdapter{
    @Override
    public double DiscountCalculator(Sale sale) {
        return sale.getTotal() - (sale.getTotal() * 0.2);
    }
    
}
