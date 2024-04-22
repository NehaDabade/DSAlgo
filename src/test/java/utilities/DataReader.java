package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {

	static Logger logger = LogManager.getLogger(DataReader.class);

	public static List<HashMap<String, String>> data(String filepath, String sheetName) {

		List<HashMap<String, String>> mydata = new ArrayList<>();

		try {
			FileInputStream fs = new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			Row HeaderRow = sheet.getRow(0);
			for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row currentRow = sheet.getRow(i);
				HashMap<String, String> currentHash = new HashMap<String, String>();
				for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
					Cell currentCell = currentRow.getCell(j);
					switch (currentCell.getCellType()) {
					case NUMERIC:
						currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
								Double.toString(currentCell.getNumericCellValue()));
						break;
					case STRING:
						currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					default:
						// Do Nothing
						break;
					}
				}
				mydata.add(currentHash);
			}
			workbook.close();
			fs.close();
		} catch (Exception e) {
			// e.printStackTrace();
			logger.error(e);
		}
		return mydata;
	}
}
