package com.ptrolle.course.services;

import com.ptrolle.course.entities.User;
import com.ptrolle.course.repositories.UserRepository;
import com.ptrolle.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj =  repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    //retornar usuario salvo
    public User insert(User obj){
        return repository.save(obj);
    }

    //deletar usuario pelo id
    public void delete(Long id){
        repository.deleteById(id);
    }

    //update
    public User update(Long id, User obj){
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    //deixando apenas atualizar, nome, email e telefone
    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
