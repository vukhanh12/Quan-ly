import java.util.Scanner;

public class NhanVien {
    private String name;
    private String gender;
    private int age;
    private ThucTapSinh[] thucTapSinhs;
    private int bacLuong;
    private int soNam;
    private float bonus;
    private int n;  // nhan su quan ly

    public NhanVien(int n) {
        this.n = n;
    }
    public NhanVien() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }

    public int getSoNam() {
        return soNam;
    }

    public void setSoNam(int soNam) {
        this.soNam = soNam;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setThucTapSinhs(){
        thucTapSinhs = new ThucTapSinh[n];
        for(int i=0;i<n;i++){
            thucTapSinhs[i]= new ThucTapSinh();
        }
        for(int i=0;i<n;i++){
            Scanner is = new Scanner(System.in);
            System.out.println("Nhap thong tin nguoi thu " + (i+1) +" :");
            System.out.print("Name : ");
            thucTapSinhs[i].setName(is.nextLine());
            System.out.print("Age: ");
            thucTapSinhs[i].setAge(is.nextInt());
            is.nextLine();
            System.out.print("Gender : ");
            thucTapSinhs[i].setGender(is.nextLine());
            System.out.print("Tien luong : ");
            thucTapSinhs[i].setLuong(is.nextFloat());
            System.out.print("So thang : ");
            thucTapSinhs[i].setSoThang(is.nextInt());
        }
    }
    public void getThucTapSinhs(){
        for(int i=0;i<n;i++){
            System.out.println("Thong tin nguoi thu " + (i+1) +" :");
            System.out.println("Name : " + thucTapSinhs[i].getName());
            System.out.println("Age: " +thucTapSinhs[i].getAge());
            System.out.println("Gender : " + thucTapSinhs[i].getGender());
            System.out.println("Tien luong : " + thucTapSinhs[i].getLuong() );
            System.out.println("So thang : " + thucTapSinhs[i].getSoThang());
        }
    }
}
