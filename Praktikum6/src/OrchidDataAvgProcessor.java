import java.util.List;
import java.io.IOException;

public class OrchidDataAvgProcessor implements Runnable {
    // Tambahkan atribut sesuai kebutuhan
    private OrchidMeanDatum meanDatum;
    private CSVReader csvReader;

    public OrchidDataAvgProcessor(OrchidMeanDatum meanDatum, String rawDataFilename) {
        // Konstruktor
        this.meanDatum = meanDatum;
        this.csvReader = new CSVReader(rawDataFilename, ",");
    }

    @Override
    public void run() {
        // Menghitung rata-rata dari data yang dibaca dengan CSVReader, lalu update
        // meanDatum dengan rata-rata dari setiap aspek data

        // Apabila muncul IOException, maka hasil pembacaan data adalah kosong
        // dan meanDatum tidak di-update (tidak di throw lagi)
        try {
            List<String[]> rawData = this.csvReader.read();
            int sumOfPetalLength = 0;
            int sumOfPetalWidth = 0;
            int sumOfStemLength = 0;

            for (String[] rawDatum : rawData) {
                sumOfPetalLength += Integer.parseInt(rawDatum[0]);
                sumOfPetalWidth += Integer.parseInt(rawDatum[1]);
                sumOfStemLength += Integer.parseInt(rawDatum[2]);
            }

            this.meanDatum.setMean((float) sumOfPetalLength / rawData.size(), (float) sumOfPetalWidth / rawData.size(), (float) sumOfStemLength / rawData.size());

        } catch (IOException e) {
            /* DO NOTHING */
        }
    }
}