package com.example.demo.projeOdeviModel;

import org.springframework.web.bind.annotation.RestController;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ProjeOdeviModel {
	@Id
	Long id;
	String name;
	String lastName;
	int tcKimlikNo;
	String adress;

}
