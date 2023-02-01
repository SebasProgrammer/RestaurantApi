package com.booking.bookingrestaurantapi.dtos;

//Se creó este DTO
//Sólo busco mostrar en pantalla el nombre del error y su valor (Ej: 404,202)

import lombok.Data;

@Data
public class ErrorDto {
    private String name;
    private String value;
}
