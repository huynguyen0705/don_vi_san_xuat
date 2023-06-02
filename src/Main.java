import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        while (isRunning) {
            try {
                System.out.println("Quản lý cán bộ");
                System.out.println("1. Nhập thông tin mới cho cán bộ");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Ghi file");
                System.out.println("4. Nhap file");
                System.out.println("5. Hiện thị danh sách các cán bộ");
                System.out.println("6. Thoát");
                System.out.println("Mời nhập: ");
                int input1 = scanner.nextInt();
                if (input1 < 1 || input1 > 6) {
                    System.out.println("Nhập sai");
                }
                switch (input1) {
                    case 1:
                        System.out.println("1. Nhập thông tin cho nhân viên");
                        System.out.println("2. Nhập thong tin cho công nhân");
                        System.out.println("3. Nhập thông tin cho kỹ sư");
                        System.out.println("Mời nhập: ");
                        int input2 = scanner.nextInt();
                        if (input2 < 1 || input2 > 3) {
                            System.out.println("Nhập sai");
                        }
                        switch (input2) {
                            case 1:
                                System.out.println("Nhập thông tin cho nhân viên");
                                System.out.println("Nhập ho têm: ");
                                Scanner scanner1 = new Scanner(System.in);
                                String hoTen = scanner1.nextLine();
                                System.out.println("Nhập năm sinh (dd/mm/yy): ");
                                Scanner scanner2 = new Scanner(System.in);
                                String namSinh = scanner2.next();
                                System.out.println("Nhập giới tính: ");
                                Scanner scanner3 = new Scanner(System.in);
                                String gioiTinh = scanner3.next();
                                System.out.println("Nhập địa chỉ: ");
                                Scanner scanner4 = new Scanner(System.in);
                                String diaChi = scanner4.next();
                                System.out.println("Nhập công việc: ");
                                Scanner scanner5 = new Scanner(System.in);
                                String congViec = scanner5.next();
                                quanLyCanBo.ThemThongTinNhanVien(hoTen, namSinh, gioiTinh, diaChi, congViec);
                                break;
                            case 2:
                                System.out.println("Nhập thông tin cho công nhân");
                                System.out.println("Nhập ho têm: ");
                                Scanner scanner6 = new Scanner(System.in);
                                String hoTenCn = scanner6.next();
                                System.out.println("Nhập năm sinh (dd/mm/yy): ");
                                Scanner scanner7 = new Scanner(System.in);
                                String namSinhCn = scanner7.next();
                                System.out.println("Nhập giới tính: ");
                                Scanner scanner8 = new Scanner(System.in);
                                String gioiTinhCn = scanner8.next();
                                System.out.println("Nhập địa chỉ: ");
                                Scanner scanner9 = new Scanner(System.in);
                                String diaChiCn = scanner9.next();
                                System.out.println("Nhập công việc: ");
                                Scanner scanner10 = new Scanner(System.in);
                                String capBac = scanner10.next();
                                quanLyCanBo.ThemThongTinCongNhan(hoTenCn, namSinhCn, gioiTinhCn, diaChiCn, capBac);
                                break;
                            case 3:
                                System.out.println("Nhập thông tin cho kỹ sư");
                                System.out.println("Nhập ho têm: ");
                                Scanner scanner11 = new Scanner(System.in);
                                String hoTenKs = scanner11.next();
                                System.out.println("Nhập năm sinh (dd/mm/yy): ");
                                Scanner scanner12 = new Scanner(System.in);
                                String namSinhKs = scanner12.next();
                                System.out.println("Nhập giới tính: ");
                                Scanner scanner13 = new Scanner(System.in);
                                String gioiTinhKs = scanner13.next();
                                System.out.println("Nhập địa chỉ: ");
                                Scanner scanner14 = new Scanner(System.in);
                                String diaChiKs = scanner14.next();
                                System.out.println("Nhập công việc: ");
                                Scanner scanner15 = new Scanner(System.in);
                                String nganhDaoTao = scanner15.next();
                                quanLyCanBo.ThemThongTinKySu(hoTenKs, namSinhKs, gioiTinhKs, diaChiKs, nganhDaoTao);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Tìm kiếm theo tên");
                        System.out.println("1. Tìm nhân viên");
                        System.out.println("2. Tìm công nhân");
                        System.out.println("3. Tìm kỹ sư");
                        System.out.println("Mời nhập");
                        int input3 = scanner.nextInt();
                        if (input3 < 1 || input3 > 3){
                            System.out.println("Nhập sai");
                        }
                        switch (input3){
                            case 1:
                                System.out.println("Tìm nhân viên");
                                System.out.println("Nhập tên: ");
                                Scanner scanner16 = new Scanner(System.in);
                                String ten = scanner16.next();
                                ArrayList<NhanVien> DsNhanVien = quanLyCanBo.TimKiemTheoTenNhanVien(ten);
                                for (int i = 0; i < DsNhanVien.size(); i++){
                                    DsNhanVien.get(i).HienThiNhanVien();
                                }
                                break;
                            case 2:
                                System.out.println("Tìm công nhân");
                                System.out.println("Nhập tên: ");
                                Scanner scanner17 = new Scanner(System.in);
                                String tenCn = scanner17.next();
                                quanLyCanBo.TimKiemTheoTenCongNhan(tenCn);
                                break;
                            case 3:
                                System.out.println("Tìm ky sư");
                                System.out.println("Nhập tên: ");
                                Scanner scanner18 = new Scanner(System.in);
                                String tenKs = scanner18.next();
                                quanLyCanBo.TimKiemTheoTenKySu(tenKs);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("ghi file danh sách nhân viên");
                        quanLyCanBo.GhiFileNhanVien();
                        break;
                    case 4:
                        quanLyCanBo.DocFileNhanVien();
                        break;
                    case 5:
                        quanLyCanBo.HienThiDanhSachCacCanBo();
                        break;
                    case 6:
                        isRunning = false;
                        break;

                }

            } catch (InputMismatchException ex) {
                System.out.println("Nhập sai kiểu rồi");
            }
        }
    }
}