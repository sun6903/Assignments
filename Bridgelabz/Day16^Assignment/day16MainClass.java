import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddressBook implements Comparable<AddressBook> {
    public String firstName,lastName,address,state,city;
    public int zip, number;

    public static List<AddressBook> addressBook=new ArrayList<>();

    public AddressBook(String firstName, String lastName, String address, String state, String city, int zip,
			int number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.number = number;
	}


    public int getNumber() {
    	return this.number;
    }


	public <AnyType> void setFirstName(AnyType firstName) {
		this.firstName = (String)firstName;
	}





	public <AnyType> void setLastName(AnyType lastName) {
		this.lastName = (String)lastName;
	}





	public <AnyType> void setAddress(AnyType address) {
		this.address = (String)address;
	}





	public <AnyType> void setState(AnyType state) {
		this.state = (String)state;
	}





	public <AnyType> void setCity(AnyType city) {
		this.city = (String)city;
	}





	public <AnyType> void setZip(AnyType zip) {
		this.zip = (int)zip;
	}





	public <AnyType> void setNumber(AnyType number) {
		this.number = (int)number;
	}





	public static void setAddressBook(List<AddressBook> addressBook) {
		AddressBook.addressBook = addressBook;
	}





	public static void addPerson(AddressBook obj) {
    	addressBook.add(obj);
    }   

    public static void getPerson() {
    	for(AddressBook e : addressBook) {
    		System.out.println("First Name: "+e.firstName+" Last Name: "+e.lastName+" Address: "+e.address+" Zip code: "+e.zip+" Number:"+e.number);
    	}
    } 

    public static <GenericType> void updatePerson(String name,GenericType updateParameter,String fieldToUpdate) {
    	for (int i=0;i<=addressBook.size()-1;i++) {
    		if(addressBook.get(i).firstName.equals(name)) {
    			if(fieldToUpdate.equals("Address")) {
    				addressBook.get(i).setAddress(updateParameter);
    			}
    			else if(fieldToUpdate.equals("State")) {
    				addressBook.get(i).setState(updateParameter);
    			}
    			else if(fieldToUpdate.equals("City")) {
    				addressBook.get(i).setCity(updateParameter);
    			}
    			else if(fieldToUpdate.equals("Zip")) {
    				addressBook.get(i).setZip(updateParameter);
    			}
    			else if(fieldToUpdate.equals("Number")) {
    				addressBook.get(i).setNumber(updateParameter);
    			}
    		}
    	}
    }
    public static void deletePerson(String fname) {
    	for (int i=0;i<=addressBook.size()-1;i++) {
    		if(addressBook.get(i).firstName.equals(fname)) {
    			addressBook.remove(addressBook.get(i));
    		}
    	}
    }

    public static void sortCollection() {
    	Collections.sort(addressBook);
    }










	@Override
	public int compareTo(AddressBook o) {
		// TODO Auto-generated method stub
		return (this.getNumber() < o.getNumber() ? -1 : 
            (this.getNumber() == o.getNumber() ? 0 : 1)); 
	}


}
 107  mainclass.java 
@@ -0,0 +1,107 @@
import java.io.*;
import java.util.*;

public class MainClass {
	static Scanner sc=new Scanner(System.in);


	public static void add() {
		System.out.println("Enter first name:");
		String fname=sc.next();
		System.out.println("Enter last name:");
		String lname=sc.next();
		System.out.println("Enter address:");
		String addr=sc.next();
		System.out.println("Enter state:");
		String state=sc.next();
		System.out.println("Enter city:");
		String city=sc.next();
		System.out.println("Enter zip code:");
		int zip=sc.nextInt();
		System.out.println("Enter number:");
		int number=sc.nextInt();
		AddressBook p1=new AddressBook(fname,lname,addr,state,city,zip,number);
		AddressBook.addPerson(p1);
	}


	public static void delete() {
		System.out.println("Enter first name to delete:");
		String fname=sc.next();
		AddressBook.deletePerson(fname);
	}

	public static void update() {
		System.out.println("Enter first name from list which you want to update:");
		String fname=sc.next();
		System.out.println("1. Address");
		System.out.println("2. State");
		System.out.println("3. City");
		System.out.println("4. Zip code");
		System.out.println("5. Number");
		System.out.println("Enter field number to enter:");
		int field=sc.nextInt();
		switch(field) {
		case 1:
			System.out.println("Enter new Address:");
			String newAdd=sc.next();
			AddressBook.updatePerson(fname,newAdd,"Address");
			break;
		case 2:
			System.out.println("Enter new state:");
			String newState=sc.next();
			AddressBook.updatePerson(fname,newState,"State");
			break;
		case 3:
			System.out.println("Enter new city:");
			String newCity=sc.next();
			AddressBook.updatePerson(fname,newCity,"City");
			break;
		case 4:
			System.out.println("Enter new zip code:");
			int newZip=sc.nextInt();
			AddressBook.updatePerson(fname,newZip,"Zip");
			break;
		case 5:
			System.out.println("Enter new number:");
			int newNumber=sc.nextInt();
			AddressBook.updatePerson(fname,newNumber,"Number");
			break;
		}

	}

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		while(true) {
			System.out.println("1. Add Person");
			System.out.println("2. Show all people");
			System.out.println("3. Delete Person");
			System.out.println("4. Update Person");
			System.out.println("5. Sort collection using Mobile Number");
			System.out.println("6. Quit");
			System.out.println("Enter you choice:");
			int choice=sc1.nextInt();
			switch(choice) {
			case 1:
				add();
				break;
			case 2:
				AddressBook.getPerson();
				break;
			case 3:
				delete();
				break;
			case 4:
				update();
				break;
			case 5:
				AddressBook.sortCollection();
				break;
			case 6:
				System.exit(1);
			}
		}

	}
}