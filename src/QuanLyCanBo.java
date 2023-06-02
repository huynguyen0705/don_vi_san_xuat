import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuanLyCanBo {
    ArrayList<NhanVien> DsNhanVien;
    ArrayList<KySu> DsKySu;
    ArrayList<CongNhan> DsCongNhan;

    public QuanLyCanBo() {
        DsNhanVien = new ArrayList<>();
        DsCongNhan = new ArrayList<>();
        DsKySu = new ArrayList<>();
    }
    public void ThemThongTinNhanVien(String hoTen, String namSinh, String gioiTinh, String diaChi, String congViec){
        NhanVien nhanVien = new NhanVien(hoTen,namSinh,gioiTinh,diaChi,congViec);
        DsNhanVien.add(nhanVien);
        System.out.println("Nhập thành công");
    }
    public void ThemThongTinCongNhan(String hoTen, String namSinh, String gioiTinh, String diaChi,String capBac){
        CongNhan congNhan = new CongNhan(hoTen,namSinh,gioiTinh,diaChi,capBac);
        DsCongNhan.add(congNhan);
        System.out.println("Nhập thành công");
    }
    public void ThemThongTinKySu(String hoTen, String namSinh, String gioiTinh, String diaChi,String nganhDaoTao){
        KySu kySu = new KySu(hoTen,namSinh,gioiTinh,diaChi,nganhDaoTao);
        DsKySu.add(kySu);
        System.out.println("Nhập thành công");
    }
    public ArrayList<NhanVien> TimKiemTheoTenNhanVien(String ten){
        NhanVien nhanVien = null;
        ArrayList<NhanVien> DsNhanViens = new ArrayList<>();
        for (int i = 0; i < DsNhanVien.size(); i++) {
            if (DsNhanVien.get(i).getHoTen().contains(ten)) {
                nhanVien = DsNhanVien.get(i);
                DsNhanViens.add(nhanVien);
            }
        }
        if (nhanVien == null) {
            System.out.println("không có người tên là: " + ten);
        }
        return DsNhanViens;
    }

    public void TimKiemTheoTenCongNhan(String ten){
        CongNhan congNhan = null;
        for (int i = 0; i < DsCongNhan.size(); i++) {
            if (DsCongNhan.get(i).getHoTen().contains(ten)) {
                congNhan = DsCongNhan.get(i);

            }
        }
        if (congNhan == null) {
            System.out.println("không có người tên là: " + ten);
            return;
        }else {
            congNhan.HienThiCongNhan();
        }
    }
    public void TimKiemTheoTenKySu(String ten){
        KySu kySu = null;
        for (int i = 0; i < DsKySu.size(); i++) {
            if (DsKySu.get(i).getHoTen().equals(ten)) {
                kySu = DsKySu.get(i);
                break;
            }
        }
        if (kySu == null) {
            System.out.println("không có người tên là: " + ten);
            return;
        }else {
            kySu.HienThiKySu();
        }
    }
    public void HienThiDanhSachCacCanBo(){
        System.out.println("Danh sách nhân viên: ");
        for (int i = 0; i < DsNhanVien.size(); i++){
            DsNhanVien.get(i).HienThiNhanVien();
            System.out.println("\n");
        }
        System.out.println("Danh sách công nhân: ");
        for (int i = 0; i < DsCongNhan.size(); i++){
            DsCongNhan.get(i).HienThiCongNhan();
            System.out.println("\n");
        }
        System.out.println("Danh sách kỹ sư: ");
        for (int i = 0; i < DsKySu.size(); i++){
            DsKySu.get(i).HienThiKySu();
            System.out.println("\n");
        }
    }
    public void GhiFileNhanVien(){
        try {
            File file = new File("nhanvien.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < DsNhanVien.size(); i++){
                bw.write("Nhan vien thu " + (i +1) +":" + "\n");
                bw.write("Ho ten: " + DsNhanVien.get(i).getHoTen() + "\n");
                bw.write("Nam sinh: " + DsNhanVien.get(i).getNamSinh() + "\n");
                bw.write("Gioi tinh: " + DsNhanVien.get(i).getGioiTinh() + "\n");
                bw.write("Dia chi: " + DsNhanVien.get(i).getDiaChi() + "\n");
                bw.write("Cong viec: " + DsNhanVien.get(i).getCongViec() + "\n");
            }
            System.out.println("Ghi file thanh cong");
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Loi ghi file");
        }
    }
    public void DocFileNhanVien(){
        try {
            File file = new File("nhanvien.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String vanBan = ;
            vanBan.replaceAll("\n","");
            System.out.println(vanBan);



        }catch (Exception e){
            System.out.println("loi doc file");
        }
    }
}