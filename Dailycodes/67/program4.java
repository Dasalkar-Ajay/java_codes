import java.io.*;

class DirList {
    public static void main(String[] args) {
        // Specify the directory path
        File fObj = new File("./../67");

        // Check if the path is a directory
        if (fObj.isDirectory()) {
            String[] names = fObj.list();

            // Check if the directory is empty
            if (names != null) {
                System.out.println("Number of files and directories: " + names.length);
                System.out.println("Contents of the directory:");
                for (String name : names) {
                    System.out.println(name);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified path is not a directory.");
        }
//	System.out.println(names);
    }
}

