package ChapterTwo;


import java.util.ArrayList;
import java.util.List;

/**
 * VM Args -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * java�ѵĴ�СΪ20MB��������չ
 * -XX:+HeapDumpOnOutOfMemoryError ������������ڳ����ڴ�����쳣ʱdump����ǰ�ڴ��ת������Ƭ
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
