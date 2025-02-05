package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Excelwrite{
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("exceldata");

        Row row = sheet.createRow(0);
        Cell cell1 = row.createCell(0);
        cell1.setCellValue("Username");
        Cell cell2 = row.createCell(1);
        cell2.setCellValue("Password");

        row = sheet.createRow(1);
        cell1 = row.createCell(0);
        cell1.setCellValue("validUser");
        cell2 = row.createCell(1);
        cell2.setCellValue("validPassword");

        try (FileOutputStream outputStream = new FileOutputStream("Book.csv")) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

