package utilities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Excelreader {
    private static final String FILE_PATH = "C:\\Users\\msira\\eclipse-workspace\\reyansh\\src\\test\\resources\\exceldata\\data.csv";

    public static Object[][] getCSVData() {Object[][] data = null;

    try (CSVReader reader = new CSVReader(new FileReader(FILE_PATH))) {
        List<String[]> records = reader.readAll();

        if (records.isEmpty()) {
            System.out.println("CSV file is empty.");
            return new Object[0][0];
        }

        int rowCount = records.size() - 1; // Exclude header row
        int columnCount = records.get(0).length;

        data = new Object[rowCount][columnCount];

        for (int i = 1; i <= rowCount; i++) {
            if (records.get(i).length < columnCount) {
                System.out.println("Skipping row " + (i + 1) + " due to missing values.");
                continue;
            }
            data[i - 1] = records.get(i);
        }
    } catch (IOException | CsvException e) {
        e.printStackTrace();
    }

    return data;
    }
}
