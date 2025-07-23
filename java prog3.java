import java.io.FileWriter;

class Main {
  public static void main(String args[]) {

    String program = "class JavaFile { " +
                       "public static void main(String[] args) { " +
                         "System.out.println(\"This is file\");"+
                       "}"+
                     "}";
     try {
       FileWriter output = new FileWriter("JavaFile.java");

       output.write(program);
       System.out.println("Data is written to the file.");

       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }
  }
}