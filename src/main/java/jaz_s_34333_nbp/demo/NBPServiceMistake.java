package jaz_s_34333_nbp.demo;


import org.springframework.http.HttpStatus;

public class NBPServiceMistake extends RuntimeException{
    private final HttpStatus status;

    public NBPServiceMistake(HttpStatus status, String message){
        super(message);
        this.status = status;
    }
    public HttpStatus getStatus(){
        return  status;
    }
}