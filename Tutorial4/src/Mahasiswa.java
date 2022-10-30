import java.lang.Comparable;

public class Mahasiswa implements Comparable<Mahasiswa> {
    private int kodeJurusan;
    private int angkatan;
    private float ipk;

    public Mahasiswa(int kodeJurusan, int angkatan, float ipk) {
        this.kodeJurusan = kodeJurusan;
        this.angkatan = angkatan;
        this.ipk = ipk;
    }

    public int getKodeJurusan() {
        return this.kodeJurusan;
    }

    public int getAngkatan() {
        return this.angkatan;
    }

    public float getIpk() {
        return this.ipk;
    }

    public int compareTo(Mahasiswa m) {
        if (this.kodeJurusan == m.kodeJurusan) {
            if (this.angkatan == m.angkatan) {
                if (this.ipk == m.ipk) {
                    return 0;
                    
                } else {
                    return this.ipk > m.ipk ? -1 : 1;
                }

            } else {
                return this.angkatan > m.angkatan ? -1 : 1;
            }

        } else {
            return this.kodeJurusan < m.kodeJurusan ? -1 : 1;
        }
    }
}
