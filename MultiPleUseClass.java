package HandLingList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiPleUseClass 
{

	void selectByIndex(WebElement list,int index)
	{
		Select sel=new Select(list);
		sel.selectByIndex(index);
	}
	
	void selectByValue(WebElement valist,String value)
	{
		Select sel=new Select(valist);
		sel.selectByValue(value);
	}
	
	void selectByVisibleText(WebElement textlist,String text)
	{
		Select sel=new Select(textlist);
		sel.selectByVisibleText(text);
	}
	
}
