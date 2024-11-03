package br.grupointegrado.movies.repository;


import br.grupointegrado.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> { // T = classe em que o repository está sendo mapeado,
                                                                         // ID = Tipo da chave primaria
}