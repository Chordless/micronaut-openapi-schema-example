package no.example;

/** A simple class that gets returned from the rest controller. */
public class MyData {

    private String simpleField;
    private CustomObject complexField;


    /** JavaDoc for simple property. */
    public String getSimpleField() {
        return simpleField;
    }

    /** JavaDoc for custom typed property (never gets shown anywhere).
     * @return An object of type CustomObject */
    public CustomObject getComplexField() {
        return complexField;
    }
}
