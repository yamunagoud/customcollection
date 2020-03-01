package epam_hometask.yamuna;

public class CustomCollection {
	private Object[] objArray=new Object[10];
	private int objectCount=0;
	public void add(Object obj)
	{
		if(objectCount==objArray.length)
		{
		increaseCapacity();
		}
		objArray[objectCount]=obj;
		objectCount++;
	}
	public void increaseCapacity()
	{
		int newcapacity=objArray.length*2;
		Object[] nextExpandedArray=new Object[newcapacity];
		for(int i=0;i<objArray.length;i++)
		{
		nextExpandedArray[i]=objArray[i];
		}
		objArray=nextExpandedArray;
	}
	public int capacity()
	{
	return objArray.length;
	}
	public int size()
	{
	return objectCount;
	}
	public void replace(int index,Object obj)
	{
		if(index<0 || index>=size())
		{
		throw new IndexOutOfBoundsException(""+index);
		}
		objArray[index]=obj;
		System.out.println("After replacement of an element the object array is as follows : ");
		for(Object val:objArray)
		{
			System.out.print(val+"\t");
		}
		System.out.println();
	}
	public void remove(int index)
	{
		if(index<0 || index>=size())
		{
		throw new IndexOutOfBoundsException(""+index);
		}
		while(index<size()-1)
		{
		objArray[index]=objArray[index+1];
		index++;
		}
		objArray[index]=null;
		objectCount--;
		System.out.println("After removal of an element the object array is as follows : ");
		for(Object val:objArray)
		{
			System.out.print(val+"\t");
		}
		System.out.println();
	}
	public void insert(int index,Object obj)
	{
		if(index<0 || index>=size())
		{
		throw new IndexOutOfBoundsException(""+index);
		}
		if(size()==capacity())
		{
		increaseCapacity();
		}
		int i;
		for(i=size()-1;i>=index;i--)
		{
		objArray[i+1]=objArray[i];
		}
		objArray[i+1]=obj;
		objectCount++;
		System.out.println("After insertion the object array is as follows : ");
		for(Object val:objArray)
		{
			System.out.print(val+"\t");
		}
		System.out.println();
	}
	public void display()
	{
		for(int i=0;i<size();i++)
		{
			System.out.print(objArray[i]+"\t");
		}
		System.out.println();
	}
}
