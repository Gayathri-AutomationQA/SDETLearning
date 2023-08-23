package mandatoryHomeWork.foundation;

public class ExcelSheetColumnIndex {
	public int titleToNumber(String columnTitle) {

		   if(columnTitle.length()==1)
	        {
	            return (1)+columnTitle.charAt(0)-'A';
	        }
	        int result=0;
	        for(int i=0;i<columnTitle.length();i++)
	        {
	            result=result*26+(columnTitle.charAt(i)-'A'+1);
	        }
	        return result;


	}
}
