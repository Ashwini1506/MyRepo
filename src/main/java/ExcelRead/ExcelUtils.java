//package ExcelRead;
//
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
////import static ExcelUtils.sheet;
//
//public class ExcelUtils
//{
//    XSSFWorkbook workbook;
//    XSSFSheet sheet;
//
//    private static ExcelUtils(String excelPath, String sheetName)
//    {
//        try(FileInputStream fis=new FileInputStream("./data/TestData.xlsx"))
//        {
//             workbook = new XSSFWorkbook(excelPath);
//             sheet=workbook.getSheet(sheetName);
//        }
//        catch(Exception exp)
//        {
//            System.out.println(exp.getMessage());
//            System.out.println(exp.getCause());
//            exp.printStackTrace();
//        }
//    }
//
//    public void getRowCount()
//    {
//            int rowcount=sheet.getPhysicalNumberOfRows();
//            System.out.println("Number of row count is"+rowcount);
//
//        }
//    }
//
//    public void getCellData()
//    {
////            String celldata = sheet.getRow(3).getCell(0).getStringCellValue();
////            double value=sheet.getRow(2).getCell(2).getNumericCellValue();
////            System.out.println(celldata);
////            System.out.println(value);
//            //Universal way to print any type data by using object return type
//            DataFormatter formatter=new DataFormatter();
//            Object cellValue=formatter.formatCellValue(sheet.getRow(3).getCell(2));
//            System.out.println(cellValue);
//
//    }
//    public static void main(String[] args  )
//    {
//        ExcelUtils exe=new ExcelUtils();
//        getRowCount();
//        getCellData();
//    }
//
//}
