package Record;

import Enums.Level;

public record MenssageRecord(
        String menssage,
        String tipo,
        Level level,
        String fileName
) {
}
