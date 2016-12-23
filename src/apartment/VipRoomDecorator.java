package apartment;

public class VipRoomDecorator extends FasilitasDecorator {

    public VipRoomDecorator(Unit decoratedRoom) {
        super(decoratedRoom);
    }

    public void fasilitas() {
        decoratedRoom.fasilitas();
        setFurniture(decoratedRoom);
    }

    private void setFurniture(Unit decoratedRoom) {
        System.out.println("Tambahan untuk VIP : Living room set");
    }
}
