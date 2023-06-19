package generic;

public class MyArrayList<E> {
	private Object[] elementData;
	private int size;
	public MyArrayList() {
		elementData=new Object[0];
		size=elementData.length;
	}
	public int size() {
		return size;
	}
	public void add(E element) {
		Object[] tempElementData=
				new Object[elementData.length+1];
		for(int i=0;i<elementData.length;i++) {
			tempElementData[i]=elementData[i];
		}
		tempElementData[tempElementData.length-1] =element; 
		this.elementData=tempElementData;
		this.size=this.elementData.length;
	}
	public E get(int index) {
		return (E)this.elementData[index];
	}
}
