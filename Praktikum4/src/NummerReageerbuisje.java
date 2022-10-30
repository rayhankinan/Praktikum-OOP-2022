import java.util.Stack;

// ANDA TIDAK BOLEH MENAMBAH, MENGURANGI, ATAU MENGUBAH NAMA ATRIBUT KELAS
class NummerReageerbuisje {
    private Stack<Integer> contents;      // Isi dari NummerReageerbuisje
    private int capacity;                 // Kapasitas maksimal dari NummerReageerbuisje
    private int filledCap;                // Berapa banyak angka yang telah mengisi NummerReageerbuisje

    public NummerReageerbuisje() {
        // Default konstruktor dengan capacity = 3
        this.filledCap = 0;
        this.capacity = 3;
        this.contents = new Stack<Integer>();
    }

    public NummerReageerbuisje(int cap) {
        // Modified konstruktor dengan capacity = cap
        this.filledCap = 0;
        this.capacity = cap;
        this.contents = new Stack<Integer>();
    }

    public int getCapacity() {
        // getter atribut capacity
        return this.capacity;
    }

    public int getFilledCap() {
        // getter atribut filledCap
        return this.filledCap;
    }

    public void receiveOneSubstance(int substance) {
        // NummerReageerbuisje menerima satu "substance" yaitu angka yang masuk
        if (this.filledCap < this.capacity) {
            this.contents.push(substance);
            this.filledCap++;
        }

    } 

    public void pour(NummerReageerbuisje other) {
        // NummerReageerbuisje menuangkan isi dari contents ke NummerReageerbuisje other hingga other penuh
        // Note: Angka yang dituangkan terlebih dahulu adalah angka yang paling atas posisinya
        while (other.getFilledCap() < other.getCapacity() && this.filledCap > 0) {
            Integer substance = this.contents.pop();
            this.filledCap--;

            other.receiveOneSubstance(substance);
        }
    }

    public void pourAllContents() {
        // NummerReageerbuisje ditumpahkan sepenuhnya, sehigga contents kosong
        // Melakukan println untuk setiap elemen yang tumpah berurut dari yang paling awal tumpah
        while (this.filledCap > 0) {
            Integer substance = this.contents.pop();
            this.filledCap--;

            System.out.println(substance);
        }
    }

    public void stirSwirl() {
        // contents dari NummerReageerbuisje menjadi terbalik urutannya
        Stack<Integer> newStack = new Stack<Integer>();

        while (!this.contents.empty()) {
            Integer substance = this.contents.pop();

            newStack.push(substance);
        }

        this.contents = newStack;
    }

    public void centrifuge() {
        // contents dari NummerReageerbuisje diurutkan berdasarkan nilai angkanya, 
        // dengan yang terbesar di paling bawah dan yang terkecil di paling atas
        Stack<Integer> newStack = new Stack<Integer>();

        while (!this.contents.empty()) {
            Integer substance = this.contents.pop();

            while (!newStack.empty() && newStack.peek() < substance) {
                this.contents.push(newStack.pop());
            }

            newStack.push(substance);
        }

        this.contents = newStack;
    }
}