
public class Main {
  public static void main(String[] args) {

    // testing pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    //testing coin flip

  }

  public static String pluralize(String word, int num) {
    String result1 = word;
    String result2 = word + "s";
    if (num >= 2) {
      return result2;
    } else if (num == 0){
      return result2;
    } else {
      return result1;
    }
  }

  // public static String flipNHeads(int n){
  //   int x = (Math.random() * ((1 - 0) + 1)) + 0;

  //   if (x >= .5){
  //     String result = heads;
  //   } else if (x < .5){
  //     String result = tails;
  //   }
    


  //   String output = "It took " + times + " flip to flip " + n + " heads in a row.";
  //   return output;
  // }

}