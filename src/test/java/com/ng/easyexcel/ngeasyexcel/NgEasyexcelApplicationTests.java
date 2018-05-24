package com.ng.easyexcel.ngeasyexcel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.ng.easyexcel.ngeasyexcel.listener.ExcelListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NgEasyexcelApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void textExcel_1(){
		InputStream inputStream = getInputStream("goodsBillModel.xls");
		try{
			ExcelListener exl = new ExcelListener();
			ExcelReader elr = new ExcelReader(inputStream, ExcelTypeEnum.XLS,null,exl);
			elr.read();
		} catch (Exception e){

		} finally {
			try{
				inputStream.close();
			} catch (IOException e){
				e.printStackTrace();
			}
		}

	}

	private InputStream getInputStream(String fileName) {
		return Thread.currentThread().getContextClassLoader().getResourceAsStream("" + fileName);

	}
}
