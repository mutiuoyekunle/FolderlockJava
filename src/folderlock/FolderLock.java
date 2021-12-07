/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folderlock;

import static folderlock.MainMenu.mainMenu;
import java.io.File;

/**
 *
 * @author omobamhuteew
 */
public class FolderLock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
////        new DeleteFileFolder("GUIFormExamples");
//        File file  = new File("ExtractAllFiles.zip"); // handler to your ZIP file
//        File file2 = new File("ExtractAllFiles.locked"); // destination dir of your file
//        boolean success = file.renameTo(file2);
//        if (success) {
//            // File has been renamed
//        }
        mainMenu.setVisible(true);
    }
    
}
