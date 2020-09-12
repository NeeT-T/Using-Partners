package atividadeparadigma;
public class Sale {
    
    private IDiscountCalculatorAdapter _IDiscountCalculatorAdapter;
    
    public Sale(IDiscountCalculatorAdapter IDiscountCalculatorAdapter){
        this._IDiscountCalculatorAdapter = IDiscountCalculatorAdapter;
    }
    
    public double DiscountCalculator(){
       return _IDiscountCalculatorAdapter.DiscountCalculator(this);
    }
    
    public double getTotal() {
        return 200;
    }
}
