package br.com.gabriels.webplayground.syncro;

public class TestaSyncro {
    public static void main(String[] args) {
        AcquirementPoolService acquirementPoolService = new AcquirementPoolService();
        User firstUser = new User(1L, "FIRST USER");
        User secondUser = new User(2L, "SECOND USER");

        new Thread(() -> {
            System.out.println("Começando primeira thread do usuario de id: " + firstUser.getId());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            acquirementPoolService.tryToAllocate(firstUser);

        }).start();

        new Thread(() -> {
            System.out.println("Começando segunda thread do usuario de id: " + firstUser.getId());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            acquirementPoolService.tryToAllocate(firstUser);
        }).start();

        new Thread(() -> {
            System.out.println("Começando terceira thread do usuario de id: " + secondUser.getId());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            acquirementPoolService.tryToAllocate(secondUser);
        }).start();
    }
}
