package apartment;

public class cicil extends observer {

    public cicil(subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        int hargaUnit = subject.getState();
        int cicil12 = (hargaUnit / 12);
        int cicil6 = (hargaUnit / 8);
        System.out.println("\nPEMBAYARAN CICIL");
        System.out.println("Harga yang harus dibayar selama 12x : " + cicil12);
        System.out.println("Harga yang harus dibayar selama 8x  : " + cicil6);
    }

}
