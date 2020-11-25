package converters;

public abstract class AbstractConverter{
    private final String unitName;

    public AbstractConverter(String unitName){
        this.unitName = unitName;
    }
    public double toBasicUnit(double value) {
           return value;
	}
    public double fromBasicUnit(double value) {
           return value;
    }
 
    @Override
    public String toString() {
        return unitName;
    }
    
}