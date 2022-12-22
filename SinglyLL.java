package sllextra;

import java.util.Arrays;

public class Singlyll {
	
	private Node head;
	public int count=0;
	
	public Singlyll()
	{
		head=null;
	}
	
	public void AddFirst(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			count++;
		}
		else {
			newNode.setNext(head);
			head=newNode;
			count++;
		}
	
	}
	
	public void AddLast(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			count++;
			
		}
		else
		{
			Node last=head;
			while(last.getNext()!=null)
			{
				last=last.getNext();
			}
			last.setNext(newNode);
			count++;
		}
		
	}
	
	public void display()
	{
		Node curr=head;
		
		while(curr!=null)
		{
			System.out.print(curr.getData()+" ");
			curr=curr.getNext();
		}
		System.out.println();
	
	}
	
	public void RemoveFirst()
	{
		if(head==null)
		{
			System.out.println("Empty Singly LL");
			
		}else
		{
			head=head.getNext();
			count--;
		}
	}
	
	public void RemoveLast()
	{
		if(head==null)
		{
			System.out.println("Empty Singly LL");
		}
		else
		{
			Node prev=head;
			Node last=head;
			
			while(last.getNext()!=null)
			{
				prev=last;
				last=last.getNext();
			}
			prev.setNext(null);
			count--;

		}
	}
	
	public void AddAtPos(int data,int pos)
	{  Node newNode=new Node(data);
		if(pos==0)
		{
			System.out.println("Pos does Not Exists");
			return;
		}
		
		if(pos==1)
		{
			AddFirst(data);
			count++;
			return;
		}
		
		Node prev=head;
		for(int i=1;i<pos-1;i++)
		{
			prev=prev.getNext();
		}
		if(prev.getNext()==null)
		{
			AddLast(data);
			return;
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		count++;
	
	}
	
	public void RemoveByPos(int pos)
	{
		if(pos==0)
		{
			System.out.println("Pos does Not Exists");
			return;
		}
		
		if(pos==1)
		{
			RemoveFirst();
			count--;
			return;
		}
		
		Node prev=head;
		Node del=head;
		for(int i=1;i<pos;i++)
		{
			prev=del;
			del=del.getNext();
		}
		if(del.getNext()==null)
		{
			RemoveLast();
			return;
		}
		prev.setNext(del.getNext());
		count--;

	}
	
	public void Search(int data)
	{
		Node curr=head;
		
		
		while(curr.getNext()!=null)
		{
			if(curr.getData()==data)
			{
				System.out.println("Data Found :"+curr.getData());
				return;
			}
			curr=curr.getNext();
			
		}
		System.out.println("Data Found :"+curr.getData());//for last element
		
		if(curr.getData()!=data)
		{
			System.out.println("Data not Found :"+data);
		}
		
	}
	
	public void reverse()
	{
		int []stack=new int[count];
		int top=-1;
		Node curr=head;
		while(curr!=null)
		{
			stack[++top]=curr.getData();
			curr=curr.getNext();
		}
		

	//		System.out.println(Arrays.toString(stack));

		for(int i=stack.length-1;i>-1;i--)
		{
			System.out.print(stack[i]+" ");
		}
		
		
	}
	
	public void removeByData(int data)
	{
		Node prev=head;
		Node del=head;
		
		if(data==head.getData())
		{
			head=head.getNext();
			return;
		}
		
		while(del!=null)
		{
			if(del.getData()==data)
			{
				prev.setNext(del.getNext());
				return;
			}
			prev=del;
			del=del.getNext();	
		}
	
	}
	
	public void printAlternate()
	{
		Node curr=head;
		while(curr.getNext().getNext()!=null)
		{
			System.out.print(curr.getNext().getData()+" ");
			curr=curr.getNext().getNext();
		}
		System.out.print(curr.getNext().getData()+" ");
	}
	
	public void sort()
	{   
		Node prev=head;
		Node next=head.getNext();
		
		while(true)
		{
			 prev=head;
			 next=head.getNext();
			
				if(prev.getData()>next.getData())
				{
					int temp=prev.getData();
					prev.setData(next.getData());
					next.setData(temp);	
				}
				prev=prev.getNext();
				next=next.getNext();	
				
				if(prev.getData()<next.getData())
				{
					return;
				}
		}	

		}
	}
	
	
	
	
	
	
	
	
	
	
	


