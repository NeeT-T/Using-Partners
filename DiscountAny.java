package atividadeparadigma;
public class DiscountAny implements IDiscountCalculatorAdapter{
//Poderia fazer varias classes como essa criando qualquer tipo de desconto porem não quiz
    @Override
    public double DiscountCalculator(Sale sale) {
        return sale.getTotal() - (sale.getTotal() * 0.2);
    }
    
}
