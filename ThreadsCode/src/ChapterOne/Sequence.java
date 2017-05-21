package ChapterOne;

/**
 * 线程安全的数值序列生成器
 * 一共对value这个对象进行了3次操作，
 * 1.获取value
 * 2.value+1
 * 3.赋值给value对象
 * @author snlu
 *
 */
public class Sequence {
	
	private int value;
	
	public synchronized int getNext(){
		return value++;
	}

}
