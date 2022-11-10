public class QlNv2chieu {
    NhanVien[][] qlnv2chieu;
    public QlNv2chieu() {
    }

    public QlNv2chieu(NhanVien[][] qlnv2chieu) {
        qlnv2chieu[0] = new NhanVienFullTime[0];
        qlnv2chieu[1] = new NhanVienPartTime[0];
        this.qlnv2chieu = qlnv2chieu;
    }
}
