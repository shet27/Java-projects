// importing the File class
import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("JavaFile.java");

    try {

      // create a new file with name specified
      // by the file object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("New Java File is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
