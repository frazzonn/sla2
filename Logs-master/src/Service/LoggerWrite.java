package Service;

import Enums.Level;
import Interface.Logger;
import Record.MenssageRecord;

import java.time.LocalDateTime;

public class LoggerWrite implements Logger {

    @Override
    public void log(MenssageRecord menssageRecord) {
        LocalDateTime data = LocalDateTime.now();
        System.out.println(menssageRecord.level().colorize(menssageRecord.menssage()) + " " + menssageRecord.level() + " " + data);
    }
}
