import java.util.ArrayList;

public class ScraperThread implements Runnable {
    private Website website;
    private ThreadListener listener;
    private String prefix;
    private String year;
    private int suffixFirst;
    private int suffixLast;
    private ArrayList<Student> studentList;

	// TODO: constructor
	public ScraperThread(Website website, ThreadListener listener, String prefix, String year, int suffixFirst, int suffixLast) {
        this.website = website;
        this.listener = listener;
        this.prefix = prefix;
        this.year = year;
        this.suffixFirst = suffixFirst;
        this.suffixLast = suffixLast;
        this.studentList = new ArrayList<>();
	}
	
	// TODO: thread method
	// PROCEDURE:
	// 1. Construct NIM from given prefix, year, and suffixes.
	// 2. For each NIM constructed, get data from website.
	// 3. For each student data got from website, store in ArrayList
	public void run() {
        for (int i = this.suffixFirst; i <= this.suffixLast; i++) {
            String NIM = prefix + year + String.format("%03d", i);
            Student S = this.website.getStudentDataByNIM(NIM);
            this.studentList.add(S);
        }

        this.listener.onSuccess(studentList);
	}
}