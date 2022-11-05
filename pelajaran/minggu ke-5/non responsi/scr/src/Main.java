import java.util.ArrayList;

public class Mahasiswa
{
    private String nama;
    private String npm;
    private int semester;

    public  Mahasiswa(String nama, String npm, int semester)
    {
        this.nama = nama;
        this.npm = npm;
        this.semester = semester;

    }

    public void cetak()
    {
        System.out.println("nama mahasiswa = "+this.nama);
  