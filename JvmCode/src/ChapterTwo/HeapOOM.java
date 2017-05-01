package ChapterTwo;


import java.util.ArrayList;
import java.util.List;

/**
 * VM Args -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * java堆的大小为20MB，不可扩展
 * -XX:+HeapDumpOnOutOfMemoryError 可以让虚拟机在出现内存溢出异常时dump出当前内存堆转储快照片
 * @author snlu
 *
 */
public class HeapOOM {
	static class OOMObject{
		
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<>();
		while (true) {
			list.add(new OOMObject());
		}
	}
}
