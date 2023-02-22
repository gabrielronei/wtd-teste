package br.com.gabriels.webplayground.manyToManySetVsList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    //NAO FUNCIONA
    @Query(value = "select s.nome as nome from student s where nome = :nome", nativeQuery = true)
    List<NomeClassDTO> findAllByNomex(String nome);

    //NAO FUNCIONA
    @Query(value = "select s.nome as nome from student s where nome = :nome", nativeQuery = true)
    List<NomeRecordDTO> findAllByNomey(String nome);

    //FUNCIONA
    @Query(value = "select s.nome as nome from student s where nome = :nome", nativeQuery = true)
    List<NomeInterfaceDTO> findAllByNomez(String nome);

    @Query(value = "select s.* from student s where nome = :nome", nativeQuery = true)
    List<Student> findAllByNome(@Param("nome") String nome);

    @Query(value = "select s.* from student s", nativeQuery = true)
    List<Student> findAllByNome();

}
