import java.util.List;

public class Worker {
	public static int run(List<Integer> durations, int machineCount) {
		// implementation here

        int[] pekerja = new int[machineCount];
        int totalTime = 0;

        for (int duration: durations) {
            int minIndex = 0;

            for (int i = 1; i < machineCount; i++) {
                minIndex = pekerja[i] < pekerja[minIndex] ? i : minIndex;
            }

            pekerja[minIndex] += duration;
            totalTime = totalTime > pekerja[minIndex] ? totalTime : pekerja[minIndex];
        }

		return totalTime;
	}
}