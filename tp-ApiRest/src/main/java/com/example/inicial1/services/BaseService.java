package com.example.inicial1.services;

import java.util.List;
//En esta interface declaramos los metodos de las 4 operaciones principales(creacion, obtencion, actualizacion, eliminacion) para implementar en todos los servicios que necesitemos sin tener que declarar uno por uno los métodos
public interface BaseService <E>{  //Lo hacemos de tipo genérico para que pueda recibir cualquier entidad
    public List <E> findAll() throws Exception; //trae una lista de todos los objetos que se encuentra en nuestro bd
    public E findById(long id) throws Exception; //obtiene un objeto de acuerdo al id que le pasemos
    public E save(E entity) throws Exception; //crea una nueva entidad
    public E update(long id, E entity) throws Exception;
    public boolean delete (long id)throws Exception;

}
