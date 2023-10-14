public class mainliv {
    public static void main(String[] args) {
        livre1 l1 = new livre1 (125466132 , " power of mind " , " jonson " , 125.40 );

        System.out.println ("Cette id : " + l1.getId() + " est du livre : " + l1.getTitre() + " est ecrit par " + l1.getAuteur() + " et son prix est " + l1.getPrix() );
    }
}
