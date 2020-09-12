package atividadeparadigma;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TryMakeFactory {
    
    private static TryMakeFactory fac = new TryMakeFactory();
    private IDiscountCalculatorAdapter _IDiscountCalculatorAdapter;
    private TryMakeFactory(){}
    
    public static TryMakeFactory getInstance(){
        return fac;
    }
    
    public IDiscountCalculatorAdapter getDiscount(String className) throws ClassNotFoundException{
        setSystem();
        try {
            _IDiscountCalculatorAdapter = (IDiscountCalculatorAdapter) Class.forName(System.getProperty(className)).newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(TryMakeFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TryMakeFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return _IDiscountCalculatorAdapter;
    }
    
    private void setSystem(){
        System.setProperty("No discount", StandardDiscounts.class.getName());
        System.setProperty("Twenty percent discount", DiscountAny.class.getName());
        System.setProperty("Fifty percent discount", AnotherDiscount.class.getName());
    }
}