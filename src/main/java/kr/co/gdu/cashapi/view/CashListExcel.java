package kr.co.gdu.cashapi.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

@Component("cashListExcel") // CashListExcel cashListExcel = new CashListExcel();
public class CashListExcel extends AbstractXlsView {
   @Override
   protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
         HttpServletResponse response) throws Exception {
      // CashList를 가지고 와서 엑셀 파일을 만들어 준다.
      
      // 응답 body의 내용을 파일로 전송한다. (파일 이름: cash_list.xls)
      response.setHeader("Content-Disposition", "attachment; filename=\"cash_list.xls\"");
      
      // 매개변수로 입력받은 Workbook(엑셀 파일 객체)에 첫 번째 시트를 접근
      Sheet sheet1 = workbook.createSheet("sheet1");
      Row row0 = sheet1.createRow(0);
      row0.createCell(0).setCellValue("이름");
      row0.createCell(1).setCellValue("구디아카데미");
   }
}