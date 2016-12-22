package apartment;

import java.util.Scanner;

public class Apartment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        subject subject = new subject();
        new cash(subject);
        new cicil(subject);
        int hargaUnit2BR = 9000000;
        int hargaUnit1BR = 6000000;
        int hargaUnitStudio = 3500000;
        int hargaUnitStudioDeluxe = 4000000;

        int hargaUnit2BRVIP = 9000000 + 2000000;
        int hargaUnit1BRVIP = 6000000 + 2000000;
        int hargaUnitStudioVIP = 3500000 + 2000000;
        int hargaUnitStudioDeluxeVIP = 4000000 + 2000000;

        System.out.println("----- APARTMENT SILVER TOWER A -----");
        System.out.println("2 Tipe Unit\n1. Small (2 Orang)\n2. Family (2-3 Orang)");
        System.out.println("Apakah anda memilih fasilitas VIP (0/1)?");
        int vip = input.nextInt();
        if (vip == 0) {
            System.out.print("Inputkan pilihan tipe unit untuk melihat fasilitas : ");
            int tipe = input.nextInt();

            switch (tipe) {
                case 1:
                    Unit unit = TipeUnit.getUnit("Small1");
                    unit.fasilitas();
                    System.out.println("");
                    unit = TipeUnit.getUnit("Small2");
                    unit.fasilitas();
                    break;
                case 2:
                    unit = TipeUnit.getUnit("Family1");
                    unit.fasilitas();
                    System.out.println("");
                    unit = TipeUnit.getUnit("Family2");
                    unit.fasilitas();
                    break;
                default:
                    System.out.println("Inputan anda salah!");
            }

            System.out.println("\nUnit apartment yang tersedia\n1. Family 2BR\n2. Family 1BR\n3. Studio\n4. Studio Deluxe\nSilhkan inputkan pilihan anda:");
            System.out.print("-> ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("\nJenis Pembayaran Unit Apartment dengan tipe Family 2BR");
                    subject.setState(hargaUnit2BR);
                    break;
                case 2:
                    System.out.println("\nJenis Pembayaran Unit Apartment dengan tipe Family 1BR");
                    subject.setState(hargaUnit1BR);
                    break;
                case 3:
                    System.out.println("\nJenis Pembayaran Unit Apartment dengan tipe Studio");
                    subject.setState(hargaUnitStudio);
                    break;
                case 4:
                    System.out.println("\nJenis Pembayaran Unit Apartment dengan tipe Studio Deluxe");
                    subject.setState(hargaUnitStudioDeluxe);
                    break;
                default:
                    System.out.println("\nInputan anda salah!");
            }

        } else if (vip == 1) {
            System.out.print("Inputkan pilihan tipe unit untuk melihat fasilitas (Khusus VIP): ");
            int tipe = input.nextInt();

            switch (tipe) {
                case 1:
                    Unit unit = new VipRoomDecorator(TipeUnit.getUnit("Small1"));
                    unit.fasilitas();
                    System.out.println("");
                    unit = new VipRoomDecorator(TipeUnit.getUnit("Small2"));
                    unit.fasilitas();
                    break;
                case 2:
                    unit = new VipRoomDecorator(TipeUnit.getUnit("Family1"));
                    unit.fasilitas();
                    System.out.println("");
                    unit = new VipRoomDecorator(TipeUnit.getUnit("Family2"));
                    unit.fasilitas();
                    break;
                default:
                    System.out.println("Inputan anda salah!");
            }

            System.out.println("\nUnit apartment yang tersedia\n1. Family 2BR\n2. Family 1BR\n3. Studio\n4. Studio Deluxe\nSilhkan inputkan pilihan anda:");
            System.out.print("-> ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("\nJenis Pembayaran Unit Apartment dengan tipe Family 2BR + Fasilitas VIP");
                    subject.setState(hargaUnit2BRVIP);
                    break;
                case 2:
                    System.out.println("\nJenis Pembayaran Unit Apartment dengan tipe Family 1BR + Fasilitas VIP");
                    subject.setState(hargaUnit1BRVIP);
                    break;
                case 3:
                    System.out.println("\nJenis Pembayaran Unit Apartment dengan tipe Studio + Fasilitas VIP");
                    subject.setState(hargaUnitStudioVIP);
                    break;
                case 4:
                    System.out.println("\nJenis Pembayaran Unit Apartment dengan tipe Studio Deluxe + Fasilitas VIP");
                    subject.setState(hargaUnitStudioDeluxeVIP);
                    break;
                default:
                    System.out.println("\nInputan anda salah!");
            }
        }
    }

}
