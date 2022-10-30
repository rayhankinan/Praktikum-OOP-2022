import java.util.*;

public class Dompet<T extends Number> {
    private ArrayList<Transaction<T>> transactions;


    public Dompet() {
        this.transactions = new ArrayList<Transaction<T>>();
    }


    public Dompet(T initialBalance) {
        // Constructor dengan parameter T initialBalance, inisialisasi transactions dengan array list baru dan tambahkan transaksi tambah dengan value initial balance
        /* contoh transaksi tambah: new Transaction<T>('+', initialBalance) */
        this.transactions = new ArrayList<Transaction<T>>();
        this.addMoney(initialBalance);
    }

    public void addMoney(T money) {
        // Buat prosedur addMoney dengan parameter T money, tambahkan transaksi tambah dengan senilai money
        this.transactions.add(new Transaction<T>('+', money));
    }

    public boolean takeMoney(T money) {
        // Tambahkan transaksi kurang sebesar money (perlu ada pengecekan apakah balance cukup atau tidak)
        // false bila transaksi gagal, true bila berhasil
        if (this.getBalance() >= money.doubleValue()) {
            this.transactions.add(new Transaction<T>('-', money));
            return true;

        } else {
            return false;
        }
    }

    public void setBalance(T balance) {
        // Mengganti transaksi agar bernilai sama dengan balance
        // Tips: inisialisasi ulang transactions, lalu tambahkan transaksi tambah sebanyak balance
        this.transactions = new ArrayList<Transaction<T>>();
        this.addMoney(balance);
    }

    // Akses nilai Double dilakukan dengan .doubleValue()
    // Contoh: amount.doubleValue()

    public Double getBalance() {
        // Mencari balance dompet dari transaksi dengan cara menghitung total transaksi
        double sum = 0;

        for (Transaction<T> transaction : this.transactions) {
            if (transaction.getType() == '+') {
                sum += transaction.getAmount().doubleValue();
            } else if (transaction.getType() == '-') {
                sum -= transaction.getAmount().doubleValue();
            } else {
                /* EMPTY */
            }
        }

        return sum;
    }

    public void printTransactions() {
        // Print seluruh transaksi yang ada pada array
        // Format: Transactions [indeks + 1]: [tipe transaksi] [amount]
        // Contoh: Transactions 3: + 500

        for (int i = 0; i < this.transactions.size(); i++) {
            System.out.printf("Transactions %d: %c %d\n", i + 1, this.transactions.get(i).getType(), this.transactions.get(i).getAmount());
        }
    }

    public Double getAverageTransaction() {
        // Mencari rata-rata transaksi (jika tidak ada transaksi, berikan hasil null)
        if (this.transactions.isEmpty()) {
            return null;

        } else {
            return this.getBalance() / this.transactions.size();
        }
    }

    public Double getMinimumTransaction() {
        // Mencari nilai minimum transaksi (jika tidak ada transaksi, berikan hasil null; hanya perlu membandingkan nilainya saja tanpa peduli type)
        if (this.transactions.isEmpty()) {
            return null;

        } else {
            double minimum = Double.MAX_VALUE;

            for (Transaction<T> transaction : this.transactions) {
                if (transaction.getAmount().doubleValue() < minimum) {
                    minimum = transaction.getAmount().doubleValue();
                }
            }

            return minimum;
        }
    }

    public Double getMaximumTransaction() {
        // Mencari nilai maksimum transaksi (jika tidak ada transaksi, berikan hasil null; hanya perlu membandingkan nilainya saja tanpa peduli type)
        if (this.transactions.isEmpty()) {
            return null;

        } else {
            double maximum = 0;

            for (Transaction<T> transaction : this.transactions) {
                if (transaction.getAmount().doubleValue() > maximum) {
                    maximum = transaction.getAmount().doubleValue();
                }
            }

            return maximum;
        }
    }
}
