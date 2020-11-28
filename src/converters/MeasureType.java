package converters;

public enum MeasureType {
    
    DISTANCE("comprimento", "metre (m)"), //ok
    AREA("area", "square metre (m²)"),
    VOLUME("volume", "litre (L)"),
    MASS("mass", "kilogram (kg)"),
    TIME("time", "second (s)"),
    SPEED("speed", "m/s"), 
    ACCELERATION("accelerations", "m/s²"),
    FORCE("force", "newton (N)"),
    PRESSURE("pressure", "pascal (Pa)"),
    ENERGY("energy", "joule (J)"),
    POWER("power", "watt (W)"),
    VISCOSITY("viscosity", "Pa·s");
   
    private final String type;
    private final String basicUnit;

    MeasureType(String type, String basicUnit) {
        this.type = type;
        this.basicUnit = basicUnit;
    }

    public final String getBasicUnit() {
        return basicUnit;
    }
    public final String getTypeString() {
        return type;
    }
    
     @Override
    public String toString() {
        return this.type + " [" + this.basicUnit + "]";
    }
    
    
}