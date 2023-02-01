package com.booking.bookingrestaurantapi.exceptions;

import com.booking.bookingrestaurantapi.dtos.ErrorDto;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

public class NotFoundException extends BookingException{
    public NotFoundException(String code, String message) {
        super(code, HttpStatus.NOT_FOUND.value(), message);
    }

    public NotFoundException(String code, String message, ErrorDto data) {
        super(code, HttpStatus.NOT_FOUND.value(), message, Arrays.asList(data));
    }
}
