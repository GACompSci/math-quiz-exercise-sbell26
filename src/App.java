public class App {
    public static void main(String[] args) throws Exception {
       Reader reader = new Reader();
       //addition 
       int a = Methods.randInt(1, 10);
       int b = Methods.randInt(1,10 );
       int answer = reader.getInt("what is " + a +  " + " + b + ": ");
       int score = 0;
       if (answer == a + +b){
            score += 1;
            System.out.println("correct your new score is" + score + "/1" );
    } else {
        System.out.println("incorrect");
    //subtraction
    }
     int c = Methods.randInt(1, 10);
     double cd = (double)c/10;
     int d = Methods.randInt(1,10 );
     double dd = (double)d/10;
     double answerb = reader.getDouble("what is " + cd +  " - " + dd + ": ");
 
       if (answerb == Methods.roundDouble(2, cd - dd)){
            score += 1;
            System.out.println("correct your new score is" + score + "/2" );
    } else {
        System.out.println("incorrect");   
}
//multiplcation
        int e = Methods.randInt(1, 10);
       int f = Methods.randInt(1,10 );
       int answerc = reader.getInt("what is " + e +  " * " + f + ": ");
       if (answerc == e * f){
            score += 1;
            System.out.println("correct your new score is" + score + "/3" );
    } else {
        System.out.println("incorrect");
}
//divison double
    int g = Methods.randInt(1, 10);
     double gh = (double)g/10;
     int h = Methods.randInt(1,10);
     double hh = (double)h/10;
     double answerd = reader.getDouble("what is " + gh +  "/" + hh + ": ");
 
       if (answerd == Methods.roundDouble(2, gh / hh)){
            score += 1;
            System.out.println("correct your new score is" + score + "/4" );
    } else {
        System.out.println("incorrect");  
        //mod  
}
 int i = Methods.randInt(1, 10);
       int j = Methods.randInt(1,10 );
       int answere = reader.getInt("what is " + i +  " % " + j + ": ");
       if (answere == i % j){
            score += 1;
            System.out.println("correct your new score is" + score + "/5" );
    } else {
        System.out.println("incorrect");
}
}
}