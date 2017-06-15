
	import java.util.*;
	
	
	
	class Studenttt
	{
	    int rollno;
	    String name, address;
	 
	    public Studenttt(int rollno, String name,
	                               String address)
	    {
	        this.rollno = rollno;
	        this.name = name;
	        this.address = address;
	    }
	 
	    public String toString()
	    {
	        return this.rollno + " " + this.name +
	                           " " + this.address;
	    }
	}
	 
	class Sortbyroll implements Comparator<Studenttt>
	{
	    
	    public int compare(Studenttt a, Studenttt b)
	    {
	        return a.rollno - b.rollno;
	    }
	}
	 
	class Sortbyname implements Comparator<Studenttt>
	{
	
	    public int compare(Studenttt a, Studenttt b)
	    {
	        return a.name.compareTo(b.name);
	    }
	}
	 
	class Student
	{
	    public static void main (String[] args)
	    {
	        ArrayList<Studenttt> ar = new ArrayList<Studenttt>();
	        ar.add(new Studenttt(111, "bbbb", "london"));
	        ar.add(new Studenttt(131, "aaaa", "nyc"));
	        ar.add(new Studenttt(121, "cccc", "jaipur"));
	 
	        System.out.println("Unsorted");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	 
	        Collections.sort(ar, new Sortbyroll());
	 
	        System.out.println("\nSorted by rollno");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	 
	        Collections.sort(ar, new Sortbyname());
	 
	        System.out.println("\nSorted by name");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	    }
	}
