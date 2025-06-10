package Service;

import Interface.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

import Record.MenssageRecord;

public class LoggerFile implements Logger {

    @Override
    public void log(MenssageRecord menssageRecord) {
        Path path = Paths.get(menssageRecord.fileName());
        LocalDateTime data = LocalDateTime.now();

        String menssa = menssageRecord.menssage() + " " + data + System.lineSeparator();

        try {
            if (Files.exists(path)) {
                Files.write(Paths.get(menssageRecord.fileName())
                        , menssa.getBytes()
                        , StandardOpenOption.APPEND);
            } else {
                Files.write(Paths.get(menssageRecord.fileName())
                        , menssa.getBytes());
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
            e.printStackTrace();
        }
    }

}
