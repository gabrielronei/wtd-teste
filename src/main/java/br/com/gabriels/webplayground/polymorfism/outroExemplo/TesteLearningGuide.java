package br.com.gabriels.webplayground.polymorfism.outroExemplo;

public class TesteLearningGuide {

    public static void main(String[] args) {
        LearningGuide degree = new UserGuide();
        System.out.println(degree);

        Update update = new Degree();
        Update update2 = new UserGuide();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        x(update2);
        x(update);
    }

    public static void x(Update update) {
        LearningGuide degree = (LearningGuide) update;
        System.out.println(degree);
    }
}
