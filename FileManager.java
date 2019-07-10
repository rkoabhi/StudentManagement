package StudentManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentHashMap;

public class FileManager extends DataStoreManager{
	static String mapFile;
	int flag=1;
	
	final String CONFIGURATIONFILE= "/home/kavanabhatkal/Training/configuration.txt";
	
	int loadConfigurationFile() {
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		String line[] = new String[3];
		String data[]=new String[2];
		int i=0;
		
			try {
				br=new BufferedReader(new FileReader(CONFIGURATIONFILE));
				while((line[i]=br.readLine())!=null) {	
					i++;
				}
				br.close();
				
				data=line[1].split("=");
				mapFile=data[1];
				
				data=null;
				
				data=line[0].split("=");
				if(data[1].equals("0")) {
					bw=new BufferedWriter(new FileWriter(CONFIGURATIONFILE));
					bw.write("flag=1");
					bw.write("\n");
					bw.write(line[1]);
					bw.close();
	
					flag=0;
					return flag;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		return flag;
		
	}
	
	public void serializeStudent(ConcurrentHashMap<Integer,Student> CHMap) {
		try {
			FileOutputStream fos = null;
			fos = new FileOutputStream(mapFile);
			ObjectOutputStream oos = null;
			oos = new ObjectOutputStream(fos);
			oos.writeObject(CHMap);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ConcurrentHashMap<Integer,Student> deserializeStudent() {
		ConcurrentHashMap<Integer,Student> CHMap=new ConcurrentHashMap<>();
		try {
			FileInputStream fis=null;
			fis=new FileInputStream(mapFile);
			ObjectInputStream ois=null;
			ois=new ObjectInputStream(fis);
			CHMap=(ConcurrentHashMap<Integer, Student>) ois.readObject();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return CHMap;
	}
}
