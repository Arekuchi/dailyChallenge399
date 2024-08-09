public class main {


    public static void main(String[] args) {
            String word = "excellent";
            int letterSum = 0;
            for(int i = 0; i < word.length(); i++) {
                letterSum += (word.charAt(i) - 96);
            }
            System.out.print("The letter sum of " + word + " is ");
            System.out.println(letterSum);
        }


}
