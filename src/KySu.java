public class KySu extends CanBo{
    private String NganhDaoTao;

    public KySu(String hoTen, String namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        setHoTen(hoTen);
        setNamSinh(namSinh);
        setGioiTinh(gioiTinh);
        setDiaChi(diaChi);
        setNganhDaoTao(nganhDaoTao);
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }
    public void HienThiKySu(){
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Năm sinh: " + getNamSinh());
        System.out.println("Giới tinh: " + getGioiTinh());
        System.out.println("Địa chỉ: " + getDiaChi());
        System.out.println("Ngành đào tạo: " + getNganhDaoTao());
    }
}
