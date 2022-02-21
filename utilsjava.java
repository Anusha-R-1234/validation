package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class utilsjava {

    private static Cell nextCell;

    public static void main(String[] args) {
        getRowCount();
        //getColumnCount();
    }

    public static void getRowCount() {
        try {
            String excelPath = "/C://Users//Anusha//IdeaProjects//MyMavenProject//src//2text.xlsx";
            XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            int rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("no. of rows:" + rowCount);

        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }
}

            /*
            int firstRow;
            char secondRow;
            char thirdRow;
            char fourthRow;

            firstRow = 0;
            secondRow = 0;
            thirdRow = 0;
            fourthRow = 0;
            char lastRow = 0;
            int columnIndex = nextCell.getColumnIndex();
            switch (columnIndex){
                case 0:  //1st column
                    Cell value=column.next();
                    if(value.getCellType()==CellType.NUMERIC)
                    {
                        System.out.println((int)value.getNumericCellValue());
                    }
                    if (firstRow==ISNUMBER) {
                        firstRow == sheet.getFirstRowNum()        //for numbers   */
               /* case 1:
                    if (ISNUM){}
                case 2:

                case 3:*/


            /*System.out.println("The given file is");
            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (row.evaluateInCell(cell).getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t\t");
                            break;
                    }
                }
             */
            //System.out.println();
            //System.out.println(sheet);
            //System.out.println(workbook);
            /*int index;
            for (index = firstRow + 1; index <= lastRow; index++) {
                XSSFRow row = sheet.getRow(index);
                System.out.println(firstRow + lastRow);
             */


