public class FileInputMain {
    public static void main(String[] args) {
        FileInput.getFileInput().addInformation("One ");
        FileInput.getFileInput().addInformation("Two ");
        FileInput.getFileInput().addInformation("Three ");

        FileInput.getFileInput().countSymbols();
        FileInput.getFileInput().print();
    }
}
