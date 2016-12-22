package apartment;

//Factory class to generate object of concrete class
public class TipeUnit {

    //Family1 --> family 2BR
    //Family2 --> family 1BR
    //Small1 --> studio
    //Small2 --> studio deluxe
    public static Unit getUnit(String fasilitas) {
        if (fasilitas.equals("Family1")) {
            return new twoBR();
        } else if (fasilitas.equals("Family2")) {
            return new oneBR();
        } else if (fasilitas.equals("Small1")) {
            return new studio();
        } else if (fasilitas.equals("Small2")) {
            return new studiodeluxe();
        }

        return null;

    }
}
