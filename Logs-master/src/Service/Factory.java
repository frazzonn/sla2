package Service;

import Enums.Level;
import Interface.Logger;

import java.util.Scanner;

import Record.MenssageRecord;


public class Factory {
    public void gerarLog() {
        Scanner scanner = new Scanner(System.in);
        
        Level level = null;
        LoggerWrite loggerWrite = new LoggerWrite();
        LoggerFile loggerFile = new LoggerFile();

        System.out.print("voce quer File(S) ou print(P): ");
        String tipo = scanner.nextLine();


        System.out.print("Digite sua mensagem: ");
        String entrada = scanner.nextLine();

        String tipoFormatado = tipo.toUpperCase();

        if ("P".indexOf(tipoFormatado) == 0) {
            System.out.print("Tipo Menssage (DEBUG, WARNING, ERROR): ");
            String levelStr = scanner.nextLine();
            level = Level.valueOf(levelStr.toUpperCase());
        }


        String fileName = "gremio";


        MenssageRecord menssageRecord = new MenssageRecord(entrada, tipoFormatado, level, fileName);

        if ("P".indexOf(menssageRecord.tipo()) == 0) {
            loggerWrite.log(menssageRecord);
        } else {
            loggerFile.log(menssageRecord);
        }
    }
}
