package ru.practicum.ewm.hit.exception;

public class EndBeforeStartException extends RuntimeException {
    public EndBeforeStartException(String message) {
        super(message);
    }
}
