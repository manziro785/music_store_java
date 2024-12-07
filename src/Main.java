public class Main {

    public static void main(String[] args) {

        Genre pop = new Genre("POP");
        Genre lirics = new Genre("Lyrycs");

        Author irina_group = new Author("Irina", "Kayratovna");
        Author jax = new Author("Jakh", "Khallib");


        Music china = new Music(
                "China",
                irina_group, pop,
                "https://www.youtube.com/watch?v=xx2TOKid4SA",
                226,
                4);
        Music leyla = new Music(
                "Leyla",
                jax, lirics,
                "https://www.youtube.com/watch?v=MV_3Dpw-BRY",
                256,
                12);
        Music neangime = new Music(
                "Ne angime?",
                irina_group,pop,
                "https://www.youtube.com/watch?v=BHgYtKkSEDA",
                267,
                6);
        Music medina = new Music(
                "Medina",
                jax, pop,
                "https://www.youtube.com/watch?v=CwGbMYLjIpQ",
                138,
                3);


        User Ethan = new User("Ethan Winter", "POP", 500);
        User Mia = new User("Mia Winter", "Lyrycs", 340);


        Ethan.buyMusic(neangime, 4);
        Ethan.buyMusic(medina, 3);

        Ethan.getBalance();


        Mia.buyMusic(medina,4);
        Mia.buyMusic(leyla,3);
        Mia.buyMusic(leyla,5);

        Mia.buyMusic(china,3);

        Mia.getPlaylist();

        Mia.listenMusic(medina);
        Mia.listenMusic(medina);
        Mia.listenMusic(medina);

        leyla.getDownloads();

        medina.getViews();
        medina.getRate();

//        medina.openVideo();

    }
}