package alfo.exeptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException{

    public NotFoundException(UUID id){
        super("evento con id " + id + "non è stato trovato!");
    }






}
