/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folderlock;

import java.io.File;

/**
 *
 * @author omobamhuteew
 */
public class DeleteFileFolder {

    public DeleteFileFolder(String path) {

        File file = new File(path);
        if(file.exists())
        {
            do{
                delete(file);
            }while(file.exists());
        }else
        {
            System.out.println("File or Folder not found : "+path);
        }

    }
    private void delete(File file)
    {
        if(file.isDirectory())
        {
            String fileList[] = file.list();
            if(fileList.length == 0)
            {
                System.out.println("Deleting Directory : "+file.getPath());
                file.delete();
            }else
            {
                int size = fileList.length;
                for(int i = 0 ; i < size ; i++)
                {
                    String fileName = fileList[i];
                    System.out.println("File path : "+file.getPath()+" and name :"+fileName);
                    String fullPath = file.getPath()+"/"+fileName;
                    File fileOrFolder = new File(fullPath);
                    System.out.println("Full Path :"+fileOrFolder.getPath());
                    delete(fileOrFolder);
                }
            }
        }else
        {
            System.out.println("Deleting file : "+file.getPath());
            file.delete();
        }
    }
}
