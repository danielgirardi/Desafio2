package com.south.danielgirardiweb.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@AllArgsConstructor
@Getter
@Setter
public class StandardError {

    private LocalDate timestamp;
    private Integer status;
    private String error;
    private String path;

}
