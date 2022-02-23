package excel;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JVMReport {
	public static void generateJvmReport(String json) {
		File f=new File("C:\\Users\\Harish\\Documents\\framework - workspace\\FaceBook\\src\\test\\resources\\Report");
		Configuration con=new Configuration(f, "Facebook");
		con.addClassifications("platFormName", "windows");
		con.addClassifications("platformVersion", "10");
//		List<String> l=new ArrayList<String>();
//		l.add("Hello");
//		l.add("Example");
//		con.addClassificationFiles(l);
		List<String> list=new ArrayList<String>();
		list.add(json);
		
		ReportBuilder r=new ReportBuilder(list, con);
		r.generateReports();
	}
}
