package com.users.microservice.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.users.microservice.dto.Login;

@Service
public class DataRepository {
	BufferedReader br;
	FileReader fr;
	List<Login> logins;
	static final String NAME_FILE = "logins.txt";
	
	public DataRepository() {
		br = null;
		fr = null;
	}	
	
	public List<Login> getListLogin(){
		try {
			File file = new File(NAME_FILE);
			if( !file.exists() )
				file.createNewFile();
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line = "";		
			String[] temp_data;
			Login login = new Login();
			logins = new ArrayList<Login>();
			while( (line = br.readLine()) != null ) {
				temp_data = line.split(":");
				login.setId_user(Integer.parseInt(temp_data[0]));
				login.setName_user(temp_data[1]);
				login.setDate_login(temp_data[2]);				
				logins.add(login);
				
			}
		} catch (IOException e) {
            e.printStackTrace();
        } finally {
        	
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		return logins;
	}
}
