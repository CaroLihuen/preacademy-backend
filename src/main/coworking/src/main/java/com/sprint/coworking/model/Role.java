package com.sprint.coworking.model;

public enum Role {
    ADMIN("Administrador"),
    USER("Usuario");

    private String description;

    Role(String description){
       this.description = description;
    }

    public String getDescription(){
        return description;
    }

}
