

import java.util.Scanner;

public class QuanLyNhanVien {
    NhanVien[] quanLyNhanViens = new NhanVien[0];

    public void themNhanVien(NhanVien x) {
        NhanVien[] quanLyNhanViens1 = new NhanVien[quanLyNhanViens.length + 1];
        for (int i = 0; i < quanLyNhanViens.length; i++) {
            quanLyNhanViens1[i] = quanLyNhanViens[i];
        }
        quanLyNhanViens1[quanLyNhanViens1.length - 1] = x;
        quanLyNhanViens = quanLyNhanViens1;
    }

    public void xoaTheoName(String name) {
        for (int i = 0; i < quanLyNhanViens.length; i++) {
            if (name.equals(quanLyNhanViens[i].getName())) {
                NhanVien[] mangmoi = new NhanVien[quanLyNhanViens.length - 1];
                for (int j = 0; j < i; j++) {
                    mangmoi[j] = quanLyNhanViens[j];
                }
                for (int j = i; j < quanLyNhanViens.length; j++) {
                    mangmoi[j] = quanLyNhanViens[j + 1];
                }
                quanLyNhanViens = mangmoi;
            } else {
                System.out.println("ko co nhan vien" + name);
            }
        }
    }

    public void hienThiLuongTheoTen(String name) {
        for (int i = 0; i < quanLyNhanViens.length; i++) {
            if (name.equals(quanLyNhanViens[i].getName())) {
                if (quanLyNhanViens[i] instanceof NhanVienFullTime x) {
                    String s= String.valueOf(x.Tinhluong());
                    System.out.println("Luong cua " + name+ "la" +s );

                }
                if (quanLyNhanViens[i] instanceof NhanVienPartTime) {
                    NhanVienPartTime x = (NhanVienPartTime) quanLyNhanViens[i];
                    String s= String.valueOf(x.Tinhluong());
                    System.out.println("Luong cua " + name + "la" + s );
                }
            }
            else {
                System.out.println("khong co nhan vien ten "+name);
            }
        }
    }

    public NhanVienFullTime taoNvFullTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("T??n Nh??n Vi??n M???i");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Tu???i Nh??n Vi??n M???i");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Gi???i T??nh");
        String geder = scanner.nextLine();
        scanner.nextLine();
        System.out.println("H??? S??? L????ng");
        int heso = scanner.nextInt();
        NhanVienFullTime newfulltime = new NhanVienFullTime(name, age, geder, heso);
        return newfulltime;
    }

    public NhanVienPartTime taoNvPartTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("T??n Nh??n Vi??n M???i");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Tu???i Nh??n Vi??n M???i");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Gi???i T??nh");
        String geder = scanner.nextLine();
        scanner.nextLine();
        System.out.println("S??? Ngay ??i L??m");
        int soBuoi = scanner.nextInt();
        NhanVienPartTime newParttime = new NhanVienPartTime(name, age, geder, soBuoi);
        return newParttime;
    }

    public void hienThidanhsach() {
        for (int i = 0; i < quanLyNhanViens.length; i++) {
            if (quanLyNhanViens[i] instanceof NhanVienFullTime)
                System.out.println(((NhanVienFullTime) quanLyNhanViens[i]).toString());
            if (quanLyNhanViens[i] instanceof NhanVienPartTime)
                System.out.println(((NhanVienPartTime) quanLyNhanViens[i]).toString());

        }
    }

    public static void main(String[] args) {
        QuanLyNhanVien danhSach = new QuanLyNhanVien();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Th??m Nh??n Vi??n");
            System.out.println("2.X??a Nh??n Vi??n");
            System.out.println("3.Hi???n th??? L????ng Nh??n Vien");
            System.out.println("4.Hi???n th??? danh s??ch nh??n vi??n");
            System.out.println("5.Thoat chuong trinh");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("1.Nhan Vien Full Time");
                    System.out.println("2.Nhan vien part time");

                    int choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1: {
                            danhSach.themNhanVien(danhSach.taoNvFullTime());
                        }
                        break;
                        case 2: {
                            danhSach.themNhanVien(danhSach.taoNvPartTime());
                        }
                        break;
                    }
                }
                break;
                case 2: {
                    System.out.println("1.nhap ten muon xoa");
                    String name = scanner.nextLine();
                    danhSach.xoaTheoName(name);
                }
                break;
                case 3: {
                    System.out.println("nhap ten nhan vien muon in luong");
                    String name = scanner.nextLine();
                    scanner.nextLine();
                    danhSach.hienThiLuongTheoTen(name);
                }
                break;
                case 4: {
                    danhSach.hienThidanhsach();
                }
                break;
                case 5:return;
            }

        } while (true);
    }
}
