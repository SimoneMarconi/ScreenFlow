package components;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.io.File;

public class DragDrop extends DropTarget {

    public static Boolean dropped = false;

   @Override
    public void drop(DropTargetDropEvent event){
        //accetta i drop che devono copiare il file
        event.acceptDrop(DnDConstants.ACTION_COPY);

        Transferable trans = event.getTransferable();

        DataFlavor[] flavors = trans.getTransferDataFlavors();

        for(DataFlavor flavor : flavors){

            try{
                if(flavor.isFlavorJavaFileListType()){
                    Object files = trans.getTransferData(flavor);
                    String file = files.toString();
                    String path = file.substring(1, file.length()-1);
                    File folder = new File(path);
                    if(!folder.isDirectory()){
                        System.out.println("File inserted is not a folder");
                        return;
                    }
                    DropPanel.dropped = folder;
                    dropped = true;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
        @Override
            public void dragEnter(DropTargetDragEvent event) {
            }

            @Override
            public void dragExit(DropTargetEvent event) {
            }

            @Override
            public void dragOver(DropTargetDragEvent event) {
            }

            @Override
            public void dropActionChanged(DropTargetDragEvent event) {
            }
}
