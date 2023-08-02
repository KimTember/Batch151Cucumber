package techproed.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.common.collect.Table;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReader {
        Workbook workbook;
        Sheet sheet;
        public ExcelReader(String dosyaYolu, String sayfaIsmi) {
            try {
                FileInputStream fis = new FileInputStream(dosyaYolu);
                this.workbook = WorkbookFactory.create(fis);
                this.sheet = this.workbook.getSheet(sayfaIsmi);
            } catch (IOException var4) {
                throw new RuntimeException(var4);
            }
        }

    public String getCellData(int satir, int sutun) {
        Cell cell = this.sheet.getRow(satir).getCell(sutun);
        return cell.toString();
    }

        public int rowCount() {
            return this.sheet.getLastRowNum();
        }
    }
