package folderlock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omobamhuteew
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static String FILENAME = "";
        public String content;
        public WriteToFile ( String fileName, String cont) {
            this.FILENAME = fileName;
            this.content=cont;
            write(FILENAME,content);
        }
        
	public static void main(String[] args) {
            
	}

    private void write(String FILENAME, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
			bw.write(content);
			// no need to close it.
			//bw.close();
			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}