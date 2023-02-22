package br.com.gabriels.webplayground.generico.testeHenrique;

import java.lang.reflect.ParameterizedType;

public class CustomCertificateBaseRepository<T extends CustomCertificate> {

    private final Class<CustomCertificate> nossaClasse;

    //UMA FORMA NÃO MT SEGURA DE FAZER POR CONTA DO ERASURE, DA PRA FAZER CRIANDO UMA CLASSE ABSTRATA E FAZENDO AS QUE ESTENDEM PASSAR O .CLASS
    @SuppressWarnings("unchecked")
    public CustomCertificateBaseRepository() {
        this.nossaClasse = (Class<CustomCertificate>) ((ParameterizedType) this.getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    public CustomCertificate getNossaClasse() {
        try {
            return nossaClasse.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        CustomCertificateRepository algumaClasseCustomRepository = new CustomCertificateRepository();
        CustomCertificate nossaClasse1 = algumaClasseCustomRepository.getNossaClasse();


        System.out.println(nossaClasse1.getImageForCourseCertificate());
    }
}
