package april;

public class VarargsPrint {

        public static void main(String... sss) {
            print("Как ","же ","прекрасно ","изучать ","Java");
        }

        static void print(String... words){
            for (int i = 0; i < words.length; i++) {
                System.out.print(words[i]);
            }
        }

}
