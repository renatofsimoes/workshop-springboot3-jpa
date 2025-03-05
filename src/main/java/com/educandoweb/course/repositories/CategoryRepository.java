package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	// Já existe uma implementação padrão dessa interface quando se define o
	// JpaRepository generics passando a entidade (User) e o tipo de seu Id (Long)
}
