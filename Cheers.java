
public class Cheers {
        public static void main(String[] args) {
	 String cheers = args[0];
         int Number = Integer.parseInt(args[1]);
         String specialletters = "AEFHILMNORSX";
         String Uppercasecheers = "";
         String a = "";

         for (int i = 0; i < cheers.length(); i++) {
                char ch = cheers.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - ('a' - 'A'));
                    Uppercasecheers = Uppercasecheers + ch ; 
                }
                else {
                        Uppercasecheers = Uppercasecheers + ch ;
                }
        }

         for (int i = 0; i < Uppercasecheers.length(); i++) {
                char ch = Uppercasecheers.charAt(i);
                for (int j = 0; j < specialletters.length(); j++){
                        if(specialletters.indexOf(ch) == -1){
                              a = "a ";       
                        }
                         else {
                               a = "an";
                                }
                        }
                        System.out.println("Give me " + a + " " + ch + ": " + ch + "!" );     
                }
                System.out.println("What does that spell?");
                int i = 0;
                while (i < Number){
                        System.out.println(Uppercasecheers + "!!!");
                        i++ ;
                }
                
         }


        }

