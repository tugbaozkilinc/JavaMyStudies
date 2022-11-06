package switchs;

public class SwitchRandom {

    public static void main(String[] args) {

        /*
          Class'ta size rastgele bir alfabetik karakter veren bir yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
          'A' ve 'a' için "İlk Karakter" yazdırınız.
          'B' ve 'b' için "İkinci Karakter" yazdırınız.
          'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
          'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
          Diğerleri için "Diğer Karakterleri" yazdırınız.
        */

        String ch = SwitchRandom.getRandomAlphabet().toLowerCase();

        switch(ch){
            case "a":
                System.out.println("Ilk Karakter");
                break;
            case "b":
                System.out.println("Ikinci Karakter");
                break;
            case "c":
                System.out.println("Ucuncu Karakter");
                break;
            case "d":
                System.out.println("Dorduncu Karakter");
                break;
            default:
                System.out.println("Diger Karakterler");
        }


    }

    public static String getRandomAlphabet(){

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = alphabet.length()-1; // Burda length()-1 yerine length() yazarsak; (int)Math.round(Math.random()*maxIndex) bana 10 karakterli bir String icin rastgele gelen 0.99 degerini
                                            // 10 ile carpip yuvarladiktan ve int a cevirdikten sonra 10 olarak verir. Bu sekilde out of index olur.
        int randomIndex = (int)Math.round(Math.random()*maxIndex);
        return alphabet.substring(randomIndex, randomIndex+1);

    }



}

