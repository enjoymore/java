package ChapterTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args -XX:PermSize=10M -XX:MaxPermSize=10M
 * 运行常量方法区
 * 
 * PermGen
 * @author snlu
 *
 */
public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		//使用list保持常量池引用，避免full gc回收常量池行为
		List<String> list = new ArrayList<String>();
		int i =0;
		while (true) {
			//String.intern()是一个native方法,作用是，如果字符串常量池中已经包含一个等于此String对象的字符串，则返回代表池中这个字符串的String对象；
			//否则，将此String对象包含的字符串添加到常量池中
			list.add(String.valueOf(i++).intern());
		}
	}
}
