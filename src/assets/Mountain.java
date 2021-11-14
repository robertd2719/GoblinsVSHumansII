package assets;

public class Mountain extends NonActor {
    public Mountain() {
        System.out.println("New Mountain Created");
        this.setName("Mountain");
    }
    @Override
    public String toString() {
        return "\uD83C\uDFD4";
    }
}
