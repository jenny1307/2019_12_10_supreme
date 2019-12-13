package com.jenny.controller.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Table implements Serializable {
    private String version;
    private String docurl;
    private String apiurl;
}
