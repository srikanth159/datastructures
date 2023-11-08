public class Reverseofstring{
    public static void main(String[] args){

        String string = "af@3_#$hfhdh";
        //char[] ch =string.toCharArray();
       // for(int i = ch.length-1 ;i >=0; i--){
        //    System.out.print(ch[i]);
        //}
        char [] ch = new char[string.length()];
        for(int i = 0; i < ch.length; i++){
            ch[i] = string.charAt(i);
        }
        for(int i = ch.length-1; i >= 0; i--){
            System.out.println(ch[i]);
        }
    }
}