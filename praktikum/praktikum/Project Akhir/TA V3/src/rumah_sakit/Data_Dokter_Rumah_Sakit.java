package rumah_sakit;


public class Data_Dokter_Rumah_Sakit
{
    //digunakan untuk menyimpan data dokter
    String email, password;

    public Data_Dokter_Rumah_Sakit(String email_dokter, String password_dokter)
    {
        email = email_dokter;
        password = password_dokter;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword()
    {
        return password;
    }

}
