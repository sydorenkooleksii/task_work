package reader;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.draw.geom.Path;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Oleksii_Sydorenko on 10/31/2016.
 */
 public class ReaderXLS {
    private InputStream input;
    private HSSFWorkbook workBook;
    private static final String CONFIG_FILE_NAME = "/path.properties";
    private static final String PATH = "path.path";

    public ReaderXLS() {
        try {

            InputStream in = ReaderXLS
                    .class.getResourceAsStream(CONFIG_FILE_NAME);
            Properties props = new Properties();
            props.load(in);


            input = new FileInputStream(props.getProperty(PATH));
            workBook = new HSSFWorkbook(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



//    "src\\test\\resources\\Data.xls"



    public Object[][] parse(String nameSheet, boolean isLong) {
        Sheet sheet = workBook.getSheet(nameSheet);
        int rows = sheet.getPhysicalNumberOfRows();
        int column = sheet.getRow(0).getPhysicalNumberOfCells();
        Object[][] result = new Object[rows][column];


        for (int i = 0; i < rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < column; j++ ) {
                Cell cell = row.getCell(j);
                if(isLong) {
                    result[i][j] = (long) cell.getNumericCellValue();
                }
                    else {
                        result[i][j] = (double)cell.getNumericCellValue();}
            }
        }

        return result;


        }

    }

