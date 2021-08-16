package topicosBasicosJava;

public class Split {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG   ";

        String[] vetor = original.split(" ");

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
    }
}