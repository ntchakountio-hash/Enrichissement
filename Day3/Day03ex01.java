public class Day03ex01 {
    public static void main(String[] args) {
         
        //Déclaraction d'un tableau de 5 chaînes
        String[] mots = new String[5];

        //insertion des mots dans chaque classe
        mots[0] = "Salam Aleykoum";
        mots[1] = "Saperlipopette";
        mots[2] = "Babouin";
        mots[3] = "Maudia";
        mots[4] = "Kuluma";

        // Affichage du tablea
        System.out.println("Contenu du tableau : ");
        for (int i = 0; i < mots.length; i++) {
            System.out.println("Case " + i + " : " + mots[i]);
        }

    }
}
