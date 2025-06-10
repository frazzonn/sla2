import Enums.Level;
import Record.MenssageRecord;
import Service.Factory;
import Service.LoggerFile;
import Service.LoggerWrite;

public class Main {
    public static void main(String[] args) {
            Factory factory = new Factory();
            factory.gerarLog();
    }
}