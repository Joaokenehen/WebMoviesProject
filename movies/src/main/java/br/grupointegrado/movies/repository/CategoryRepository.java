package br.grupointegrado.movies.repository;

import br.grupointegrado.movies.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> { // T = classe em que o repository está sendo mapeado,
                                                                         // ID = Tipo da chave primaria
}