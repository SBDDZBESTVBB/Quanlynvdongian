public abstract class  NhanVien {
private String name;
private int age;
private String geder;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String geder) {
        this.name = name;
        this.age = age;
        this.geder = geder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGeder() {
        return geder;
    }

    public void setGeder(String geder) {
        this.geder = geder;
    }

    public abstract int Tinhluong();

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", geder='" + geder + '\'' +
                '}';
    }
}
