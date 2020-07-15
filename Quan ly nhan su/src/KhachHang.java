import java.util.Scanner;

public class KhachHang {
    private String name;
    private float money;
    private int[] cacThang;
    private int soDuAn;
    private DuAn[] duAns;

    public KhachHang() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int[] getCacThang() {
        return cacThang;
    }

    public void setCacThang(int[] cacThang) {
        this.cacThang = cacThang;
    }

    public int getSoDuAn() {
        return soDuAn;
    }

    public void setSoDuAn(int soDuAn) {
        this.soDuAn = soDuAn;
    }

    public void setDuAns(){
        for(int i=0;i<soDuAn;i++){
            duAns = new DuAn[soDuAn];
        }
        System.out.println("Thong tin cac du an dau tu.");
        for(int i = 0;i<soDuAn;i++){
            Scanner is = new Scanner(System.in);
            System.out.println("Du an " + (i+1) + " .");
            System.out.println("ID: ");
            duAns[i].setID(is.nextInt());
        }
    }

}
