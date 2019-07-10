

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return flag;
		
	}
}
	

