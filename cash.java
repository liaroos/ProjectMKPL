package apartment;

public class cash extends observer {

    public cash(subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        int hargaUnit = subject.getState();
        int cash = (hargaUnit - ((10 / 100) * hargaUnit));
        System.out.println("\nPEMBAYARAN CASH");
        System.out.println("Pembayaran dilakukan melalui resepsionis pada jam kantor\nHarga yang harus dibayar : " + cash + "\nNB : Diskon 10% karena pembayaran secara cash");
    }

}
