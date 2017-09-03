package Report;

import java.lang.reflect.Method;

public class Driver {
	
	public static void main(String[] args) throws Exception {
		String dt_path = "C:/Users/Shwetha/Desktop/test_case.xls";
		String[][] recData =ReUsableMethods.readXlSheet(dt_path,"Sheet1");
		
		for(int i =8;i<recData.length;i++){
			String execute = recData[i][1];
			
			if(execute.equalsIgnoreCase("Y")){
				String testCase =recData[i][2];
				
				
				Method tc = AutomationScripts.class.getMethod(testCase);
				tc.invoke(tc);
				
				String val = AutomationScripts.TC08();
				ReUsableMethods.writeXlSheet(dt_path, "Sheet1",val,i);
			}
		}
	
	}
	
}

