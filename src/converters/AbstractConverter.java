package converters;

public abstract class AbstractConverter{
    private String unitName;

    public AbstractConverter(String unitName){
        this.unitName = unitName;
    }

    public abstract double toBasicUnit(double unit);
    public abstract double fromBasicUnit(double value);


     public String getName() {
        return unitName;
    }    
}
