package br.com.gabriels.webplayground.manyToManySetVsList;

import br.com.gabriels.webplayground.testaListVsSet.Pessoa;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestaManyToMany {

    private StudentRepository studentRepository;

    public TestaManyToMany(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    @PostMapping("/many/create/lista")
    public ResponseEntity create(@RequestBody Student student) {

        studentRepository.save(student);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/many/update/lista")
    public ResponseEntity update(@RequestBody Student student) {
        Student student1 = studentRepository.findById(student.getId()).orElseThrow(RuntimeException::new);

        student1.update(student);

        studentRepository.save(student1);

        return ResponseEntity.ok().build();
    }


    @GetMapping("/many/teste")
    public ResponseEntity list() {
        return ResponseEntity.ok(studentRepository.findAllByNome());
    }
}
