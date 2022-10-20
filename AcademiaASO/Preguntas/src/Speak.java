











public class Speak {
    public static void main(String[] args) {
        Speak speakIT = new Tell();
        Tell tellIt = new Tell();
        //speakIT.tellItLikeItIs(); //error comentada
        //(Truth)speakIT.tellItLikeItIs(); //linea comentada
        ((Truth)speakIT).tellItLikeItIs();
        tellIt.tellItLikeItIs();
        //(Truth)tellIt.tellItLikeItIs(); //linea comentada
        ((Truth)tellIt).tellItLikeItIs();
    }
}
