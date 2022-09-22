import java.util.regex.*;

public class FileInput {
    private static FileInput fileInput;
    private static String file = "";

    private FileInput() {}

    public static synchronized FileInput getFileInput() {
        if (fileInput == null) {
            fileInput = new FileInput();
        }
        return fileInput;
    }

    public void addInformation(String fileInformation) {
        file += fileInformation;
    }

    public void countSymbols() {
        Matcher matcher = Pattern.compile("\\S").matcher(file);
        int count = 0;
        while (matcher.find()) {
            count += matcher.group().length();
        }
        System.out.println(count);
    }

    public void print() {
        System.out.println(file);
    }
}