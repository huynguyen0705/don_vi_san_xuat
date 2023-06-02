public class CongNhan extends CanBo{
    private String CapBac;

    public CongNhan(String hoTen, String namSinh, String gioiTinh, String diaChi, String capBac) {
        setHoTen(hoTen);
        setNamSinh(namSinh);
        setGioiTinh(gioiTinh);
        setDiaChi(diaChi);
        setCapBac(capBac);
    }

    public String getCapBac() {
        return CapBac;
    }

    public void setCapBac(String capBac) {
        CapBac = capBac;
    }
    public void HienThiCongNhan(){
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Năm sinh: " + getNamSinh());
        System.out.println("Giới tinh: " + getGioiTinh());
        System.out.println("Địa chỉ: " + getDiaChi());
        System.out.println("Cấp bậc: " + getCapBac());
    }
}
