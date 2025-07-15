package br.com.dio.exception;

public class NoFundEnoughException extends RuntimeException{
    public NoFundEnoughException(String message) { super(message); }
}
