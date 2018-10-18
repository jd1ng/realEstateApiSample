package docgenerator;

import dto.crexi.PropertyDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.List;

public class ExcelGenerator {

    /*
    Creates excel document by taking in list of properties and columns to generate.
     */
    public void excelGen(String file, List<PropertyDTO> properties, String[] columns){
        try {

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("House Properties");

            // Create a Font for styling header cells
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setFontHeightInPoints((short) 14);
            headerFont.setColor(IndexedColors.RED.getIndex());

            // Create a CellStyle with the font
            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFont(headerFont);

            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerCellStyle);
            }

            int rowNum = 1;
            for (PropertyDTO property : properties) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(property.getName());
                row.createCell(1).setCellValue(property.getDescription());

            }
            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }

            FileOutputStream fileOut = new FileOutputStream(file);
            workbook.write(fileOut);
            fileOut.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }



}
