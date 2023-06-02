public class NhanVien extends CanBo{
    private String CongViec;

    public NhanVien(String hoTen, String namSinh, String gioiTinh, String diaChi, String congViec) {
        setHoTen(hoTen);
        setNamSinh(namSinh);
        setGioiTinh(gioiTinh);
        setDiaChi(diaChi);
        setCongViec(congViec);
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }
    public void HienThiNhanVien(){
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Năm sinh: " + getNamSinh());
        System.out.println("Giới tinh: " + getGioiTinh());
        System.out.println("Địa chỉ: " + getDiaChi());
        System.out.println("Công việc: " + getCongViec());
    }
}
