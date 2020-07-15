import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class DuAn {
    private int soKhachHang;  // so khach hang
    private KhachHang[] khachHangs;
    private float soTien;
    private float tienDo;
    private String thongTin;
    private int ID;

    public DuAn() {
    }

    public int getSoKhachHang() {
        return soKhachHang;
    }

    public void setSoKhachHang(int soKhachHang) {
        this.soKhachHang = soKhachHang;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public float getTienDo() {
        return tienDo;
    }

    public void setTienDo(float tienDo) {
        this.tienDo = tienDo;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public void setKhachHangs(){
        for(int i=0;i<soKhachHang;i++){
            khachHangs = new KhachHang[soKhachHang];
        }
        System.out.println("Nhap thong tin khach hang tham gia du an.");
        for (int i=0;i<soKhachHang;i++){
            Scanner is = new Scanner(System.in);
            System.out.println("Khach hang thu " + (i+1) + " : ");
            System.out.println("Name : ");
            khachHangs[i].setName(is.nextLine());
            System.out.println("Money : ");
            khachHangs[i].setMoney(is.nextFloat());
            System.out.println("Cac thang phai dong tien : ");
            String a = is.nextLine();
            String[] A = a.split(" ");
            int[] B = new int[A.length];
            for(int j=0;j<A.length;i++){
                B[j] = Integer.parseInt(A[j]);
            }
            khachHangs[i].setCacThang(B);
        }
    }
}
