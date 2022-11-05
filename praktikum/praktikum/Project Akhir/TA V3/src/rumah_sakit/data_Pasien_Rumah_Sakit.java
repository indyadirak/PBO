package rumah_sakit;
public class data_Pasien_Rumah_Sakit
{
    String email,password,verifikasi,nama,alamat;


    public data_Pasien_Rumah_Sakit(String email_pasien, String password_pasien, String verifika_pasien,String nama_pasien,String alamat_pasien)
    {
        email = email_pasien;
        password = password_pasien;
        nama=nama_pasien;
        alamat=alamat_pasien;
        verifikasi = verifika_pasien;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setVerifikasi(String verifikasi) {
        this.verifikasi = verifikasi;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getVerifikasi() {
        return verifikasi;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
