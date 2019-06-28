package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
        {
			StudentInfo si = new StudentInfo("Abhi", 104,"123456");
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
		
		
		StudentInfo si=null ;
        try
        {
            FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
            si = (StudentInfo)ois.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
            System.out.println(si.name);
            System.out. println(si.rid);
            System.out.println(si.contact);
        }
		
		
	
	}



