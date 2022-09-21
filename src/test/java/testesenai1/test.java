package testesenai1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import com.microsoft.playwright.*;
import java.nio.file.Paths;

@SuppressWarnings("unused")
public class test{
	public static void main(String[] args) throws InterruptedException {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            Page page = browser.newPage();
            page.navigate("https://online.sp.senai.br/");
            page.locator("#Busca1_txtFiltro").click();
            page.keyboard().type("Design Gráfico");
            page.keyboard().press("Enter");
            Thread.sleep(2000);
            page.locator("xpath=//*[@id=\"MainContent_ListaCurso1_rptSegmArea_rptCursos_0_divCurso_0\"]/a/span[2]").click();
            Thread.sleep(3000);
            page.close();
            
            
            Page page2 = browser.newPage();
            page2.navigate("https://github.com/cauesilva1?tab=repositories");
            Thread.sleep(1000);
            page2.locator("xpath= //*[@id=\"user-repositories-list\"]/ul/li[5]/div[1]/div[1]/h3/a").click();

     
            
            
            Thread.currentThread();
			Thread.sleep(9000);
        }
    }
	
}
