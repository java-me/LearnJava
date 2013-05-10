package stringtype;

import java.util.Formatter;
import junit.framework.Assert;
import org.junit.Test;

public class FormatterTest {

	@Test
	public void testFormatter() {
		//Refactor: 为什么这里会出现一个warning？
		Formatter formatter = new Formatter();
		Assert.assertEquals("", formatter.toString());
		Assert.assertEquals("[Hello, 3]", formatter.format("[%s, %d]", "Hello", 3).toString());
		formatter.close();
	}
	
	@Test
	public void TestStringFormat(){
		Assert.assertEquals("[Hello, 3]", String.format("[%s, %d]", "Hello", 3));
	}
	
	@Test
	public void testFormatterWithString(){
		Assert.assertEquals("[     hello]", String.format("[%10s]", "hello").toString());
		Assert.assertEquals("[        he]", String.format("[%10.2s]", "hello").toString());
	}
	
	@Test
	public void testFormatterWithFloat(){
		Assert.assertEquals("[   4.30000]", String.format("[%10.5f]", 4.3d).toString());
		Assert.assertEquals("[4.30000   ]", String.format("[%-10.5f]", 4.3d).toString());
	}
	
	@Test
	public void testFormatterWithBoolean(){
		Assert.assertEquals("[true]", String.format("[%b]", true).toString());
		Assert.assertEquals("[true]", String.format("[%b]", 1).toString());
		Assert.assertEquals("[true]", String.format("[%b]", 0).toString());
	}
	
	@Test
	public void testFormatterWithHex(){
		Assert.assertEquals("[00000]", String.format("[%05x]", 0).toString());
		Assert.assertEquals("[00001]", String.format("[%05x]", 1).toString());
		Assert.assertEquals("[00010]", String.format("[%05x]", 16).toString());
	}

}



