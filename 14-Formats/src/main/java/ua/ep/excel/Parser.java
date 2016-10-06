package ua.ep.excel;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/**
 * Created by Oleksii_Sydorenko on 10/5/2016.
 */
public class Parser {

    public static String parse(String fileName) {

        String result = "";
        InputStream inputStream = null;
        HSSFWorkbook workBook = null;
        try {
            inputStream = new FileInputStream(fileName);
            workBook = new HSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = workBook.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();

        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                int cellType = cell.getCellType();

                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        result += cell.getStringCellValue() + "=";
                        break;

                    case Cell.CELL_TYPE_NUMERIC:

                        if (HSSFDateUtil.isCellDateFormatted(cell)) {
                            if (cell.getDateCellValue() == null) {
                                return null;
                            }
                            result += "[" + cell.getDateCellValue() + "]";
                            break;
                        }

                        result += "[" + cell.getNumericCellValue() + "]";
                        break;

                    default:
                        result += "|";
                        break;
                }
            }
            result += "\n";
        }

        return result;
    }


}
