package paindrome;

public class perulangan {
    public static void main(String[] args) {
        String text = "KataK";

        String temp = "";
        for(int i=text.length()-1; i>=0; i--){
            char c = text.charAt(i);
            temp += String.valueOf(c);
        }
    
        if (text.toLowerCase().equals(temp.toLowerCase())){
            System.out.print("Text adalah polindrome");
        }else{
            System.out.print("Text bukan Polindrome");
        }
    }
}