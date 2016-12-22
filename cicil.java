package apartment;

public class cicil extends observer {

    public cicil(subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        int hargaUnit = subject.getState();
        int cicil6 = (hargaUnit / 6);
        int cicil8 = (hargaUnit / 8);
        System.out.println("\nPEMBAYARAN CICIL");
        System.out.println("Harga yang harus dibayar selama 6x : " + cicil6);
        System.out.println("Harga yang harus dibayar selama 8x  : " + cicil8);
    }

}
