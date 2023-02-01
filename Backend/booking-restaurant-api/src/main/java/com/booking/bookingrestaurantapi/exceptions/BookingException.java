package com.booking.bookingrestaurantapi.exceptions;

import com.booking.bookingrestaurantapi.dtos.ErrorDto;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

//Aquí se usa el patron DATA TRANSFER OBJECT
//se busca no exponer todos los atributos de las entidades,
//solo lo necesario, a eso se le llama DTO.

@Getter
public class BookingException extends Exception{
    private final String code;
    private final int responseCode;
    private final List<ErrorDto> errorList = new ArrayList<>();

    public BookingException(String code, int responseCode, String message){
        super(message);
        this.code = code;
        this.responseCode = responseCode;
    }
    public BookingException(String code, int responseCode, String message,
                            List<ErrorDto> errorList){
        super(message);
        this.code = code;
        this.responseCode = responseCode;
        this.errorList.addAll(errorList);
    }
}
