package com.ptrolle.course.services.exceptions;

//classe para implementar erros comuns como nao encontrar o id do usuario no banco de dados por exemplo
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id" + id);
    }
}
