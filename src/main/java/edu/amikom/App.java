package edu.amikom;

import edu.amikom.domain.Divisi;
import edu.amikom.domain.Karyawan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        Divisi produksi = new Divisi();
        produksi.setId(5573);
        produksi.setNama("Divisi Produksi");

        Karyawan anton = new Karyawan();
        anton.setNama("Anton Suparjo");
        anton.setDivisi(produksi);

        Karyawan susi = new Karyawan();
        susi.setNama("Susi");
        susi.setDivisi(produksi);

        // System.out.println(anton.getDivisi().getNama());

        produksi.getKaryawan().add(susi);
        produksi.getKaryawan().add(anton);

        for(Karyawan ky: produksi.getKaryawan()){
            System.out.println("nama: " + ky.getNama());
        }

    }
}
