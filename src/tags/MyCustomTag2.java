package tags;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag2 extends TagSupport{

	
	public int doStartTag(){
		
		try{
			JspWriter out = pageContext.getOut();
			out.println("<h1>This is from custom handler class</h1>");
		}catch(IOException e){
			
		}
		return EVAL_BODY_INCLUDE;
	}
	
	
	
}
