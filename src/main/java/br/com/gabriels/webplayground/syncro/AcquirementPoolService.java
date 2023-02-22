package br.com.gabriels.webplayground.syncro;

public class AcquirementPoolService {
    public void tryToAllocate(User loggedUser) {
//        trocar aqui para loggedUser.hasAny();
        synchronized (loggedUser.getId()) {
            if (loggedUser.hasAny()) return;

            loggedUser.updateHasAny();
            System.out.println("executando para o usuario de id " + loggedUser.getId() + " | " + loggedUser.getCreatedAt());
        }
    }
}
