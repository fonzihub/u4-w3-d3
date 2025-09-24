package alfo.exeptions;

public class NotFoundException extends RuntimeException{

    public NotFoundException(long id){
        super("evento con id " + id + "non è stato trovato!");
    }






}
