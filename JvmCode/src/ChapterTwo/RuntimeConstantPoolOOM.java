package ChapterTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args -XX:PermSize=10M -XX:MaxPermSize=10M
 * ���г���������
 * 
 * PermGen
 * @author snlu
 *
 */
public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		//ʹ��list���ֳ��������ã�����full gc���ճ�������Ϊ
		List<String> list = new ArrayList<String>();
		int i =0;
		while (true) {
			//String.intern()��һ��native����,�����ǣ�����ַ������������Ѿ�����һ�����ڴ�String������ַ������򷵻ش����������ַ�����String����
			//���򣬽���String����������ַ�����ӵ���������
			list.add(String.valueOf(i++).intern());
		}
	}
}
