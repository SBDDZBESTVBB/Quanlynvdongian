public class NhanVienFullTime extends NhanVien{
    private int heso;
    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String name, int age, String geder) {
        super(name, age, geder);
    }

    public NhanVienFullTime(String name, int age, String geder, int heso) {
        super(name, age, geder);
        this.heso = heso;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    @Override
    public int Tinhluong() {
        return heso*5000000;
    }

    @Override
    public String toString() {
        return
                "NhanVienFullTime{" +super.toString()+
                "heso=" + heso +
                '}';
    }
}
