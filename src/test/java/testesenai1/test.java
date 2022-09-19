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
            page.locator("xpath=//*[@id=\"MainContent_ListaCurso1_rptSegmArea_rptCursos_0_divCurso_0\"]/a/span[2]").click();
            
            
            
            Thread.currentThread();
			Thread.sleep(9000);
        }
    }
}