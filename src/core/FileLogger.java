package core;

public class FileLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı: " + data);
    }
}
