package epam_hometask.yamuna;

/**
 * Hello world!
 *
 */

import java.util.Scanner;
public class App extends CustomCollection
{
    public static void main( String[] args )
    {
    	CustomCollection obj=new CustomCollection();
    	Scanner sc=new Scanner(System.in);
    	int opConOrExit;
    	do
    	{
    	System.out.println("1 Add\n2 capacity\n3 size\n4 replace\n5 remove\n6 insert\n7 display\nEnter your choice");
    	int ch=sc.nextInt();
    	switch(ch)
    	{
    	case 1:Object ele = null;
    		System.out.println("Enter object");
    		int objTypeselection;
    		System.out.println("Select which type of object you want to insert \n1.Integer \n2.Float \n3.Character\n4.String\n5.Double\nEnter your selection type");
    		objTypeselection=sc.nextInt();
    		switch(objTypeselection)
    		{
    		case 1:System.out.println("Enter object");
    			ele=sc.nextInt();
    			break;
    		case 2:System.out.println("Enter object");
    			ele=sc.nextFloat();
    			break;
    		case 3:System.out.println("Enter object");
    			ele=sc.next();
    			break;
    		case 4:System.out.println("Enter object");
    			ele=sc.next();
    			break;
    		case 5:System.out.println("Enter object");
    			ele=sc.nextDouble();
    			break;
    		}
    		obj.add(ele);
    		break;
    	case 2:System.out.println("Capacity : "+obj.capacity());
    		break;
    	case 3:System.out.println("Size : "+obj.size());
    		break;
    	case 4:Object ele1 = null;
    		int index1;
    		System.out.println("Enter replacing object");
    		System.out.println("Enter index number of the element to be replaced");
    		index1=sc.nextInt();
    		int objTypeselection1;
    		System.out.println("Select type of replacing object \n1.Integer \n2.Float \n3.Character\n4.String\n5.Double\nEnter your selection type");
    		objTypeselection1=sc.nextInt();
    		switch(objTypeselection1)
    		{
    		case 1:System.out.println("Enter object");
    			ele1=sc.nextInt();
    			break;
    		case 2:System.out.println("Enter object");
    			ele1=sc.nextFloat();
    			break;
    		case 3:System.out.println("Enter object");
    			ele1=sc.next();
    			break;
    		case 4:System.out.println("Enter object");
    			ele1=sc.next();
    			break;
    		case 5:System.out.println("Enter object");
    			ele1=sc.nextDouble();
    			break;
    			}
    			obj.replace(index1,ele1);
    			break;
    		case 5:int index2;
    			System.out.println("Enter index number of the element to be deleted");
    			index2=sc.nextInt();
    			obj.remove(index2);
    			break;
    		case 6:Object ele3 = null;
    			int index3;
    			System.out.println("Enter index number for  the element to be inserted");
    			index3=sc.nextInt();
    			int objTypeselection2;
    			System.out.println("Select type of inserting object \n1.Integer \n2.Float \n3.Character\n4.String\n5.Double\nEnter your selection type");
    			objTypeselection2=sc.nextInt();
    			switch(objTypeselection2)
    				{
    				case 1:System.out.println("Enter object");
    				ele3=sc.nextInt();
    				break;
    				case 2:System.out.println("Enter object");
    				ele3=sc.nextFloat();
    				break;
    				case 3:System.out.println("Enter object");
    				ele3=sc.next();
    				break;
    				case 4:System.out.println("Enter object");
    				ele3=sc.next();
    				break;
    				case 5:System.out.println("Enter object");
    				ele3=sc.nextDouble();
    				break;
    				}
    			obj.insert(index3,ele3);
    			break;
    		case 7:obj.display();
    				break;
    		default:System.out.println("Required operation is not present");
    		break;
    	}
    	System.out.println("Enter 1 to continue and 0 to exit");
    	 opConOrExit=sc.nextInt();
    	}while(opConOrExit==1);
    }
}
