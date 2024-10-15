package com.example.demo.projeOdeviRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.projeOdeviModel.ProjeOdeviModel;

public interface ProjeOdeviRepo extends JpaRepository<ProjeOdeviModel , Long> {

}
