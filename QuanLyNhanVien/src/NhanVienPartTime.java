public class NhanVienPartTime extends NhanVien{
    private int soBuoi;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(String name, int age, String geder) {
        super(name, age, geder);
    }

    public NhanVienPartTime(String name, int age, String geder, int soBuoi) {
        super(name, age, geder);
        this.soBuoi = soBuoi;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    @Override
    public int Tinhluong() {
        return soBuoi*200000;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +super.toString()+
                "soBuoi =" + soBuoi +
                '}';
    }
}
