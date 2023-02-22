package br.com.gabriels.webplayground.syncro;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.LongStream;

class AcquirementPoolServiceTest {

    @Test
    void name() {
        ExecutorService service = Executors.newFixedThreadPool(2);
        List<User> users = LongStream.range(1, 10)
                .mapToObj(id -> new User(id, "oi" + id)).toList();

        AcquirementPoolService acquirementPoolService = new AcquirementPoolService();

        service.submit(() -> {
           users.forEach(acquirementPoolService::tryToAllocate);
           users.forEach(acquirementPoolService::tryToAllocate);
        });
    }
}