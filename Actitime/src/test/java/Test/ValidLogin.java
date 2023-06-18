package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Excel;
import POM.LoginPage;

public class ValidLogin extends BaseTest{
	@Test
	void validLogin() throws EncryptedDocumentException, IOException {
		Excel e=new Excel();
		String username = e.readDataFromExcel("Sheet1",0,0);
		String password = e.readDataFromExcel("Sheet1",0,1);
		LoginPage lp=new LoginPage(driver);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLoginBTN().click();
	}
}