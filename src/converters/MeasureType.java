package converters;

public enum MeasureType {
    
    DISTANCE("comprimento", "meter (m)"), //ok calculado
    AREA("area", "square meter (m\\u33a1)"),//ok calculado
    VOLUME("volume", "litre (L)"), //ok
    MASS("mass", "kilogram (kg)"),//ok calculado
    TIME("time", "second (s)"),//ok calculado
    SPEED("speed", "m/s"), //ok calculado
    ACCELERATION("acceleration", "m/s\u00b2"),//ok calculado
    STORAGE("storage", "B");
   
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
