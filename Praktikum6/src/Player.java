import java.util.Timer;
import java.util.TimerTask;

public class Player {
    protected Timer timer;
    protected long timeout;
    protected long lastActive;

    public Player(Timer timer, long timeout) {
        this.timer = timer;
        this.timeout = timeout;
        this.lastActive = System.nanoTime();
        // TODO: Me-set timer untuk menginvoke checkLastActive
        //       dengen delay {timeout} ms
        //       dan diinvoke tiap {timeout} ms.
        TimerTask timerTask = new TimerTask() {
            public void run() {
                checkLastActive();
            }
        };
        timer.schedule(timerTask, this.timeout, this.timeout);
    }

    public void checkLastActive() {
        // TODO: Membandingkan apakah lastActive < waktu sekarang - timeout
        //       Jika ya, panggil logout dan cancel timer agar timer berhenti.
        //       Gunakan System.nanoTIme() untuk mendapat waktu sekarang.
        if (this.lastActive < System.nanoTime() - this.timeout) {
            this.logout();
            this.timer.cancel();
        }
    }

    public void logout() {
        System.out.println("logout");
    }

    public void click() {
        // TODO: Update lastActive menjadi waktu sekarang
        this.lastActive = System.nanoTime();
    }
}