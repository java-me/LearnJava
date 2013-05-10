package stringtype;
import junit.framework.Assert;
import org.junit.Test;

public class StringBuilderTest {

	@Test
	public void test() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("abc");
		Assert.assertEquals("abc", stringBuilder.toString());
	}

}
