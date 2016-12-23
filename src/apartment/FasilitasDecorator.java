package apartment;

public abstract class FasilitasDecorator implements Unit {

    protected Unit decoratedRoom;

    public FasilitasDecorator(Unit decoratedRoom) {
        this.decoratedRoom = decoratedRoom;
    }

    public void fasilitas() {
        decoratedRoom.fasilitas();
    }
}
