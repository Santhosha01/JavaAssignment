//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Assignment4 {
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        Queue<String> q = new LinkedList<>();
//        System.out.print("Welcome to Music Player Application");
//        init(q);
//    }
//
//    private static void init(Queue<String> q) {
//        System.out.println("\n 1.View my playlist  \n 2.Add song \n 3.Remove Song \n 4.Current song \n 5.Exit");
//        System.out.println("Enter your Choice");
//        int choice = sc.nextInt();
//        sc.nextLine();
//        switch (choice) {
//            case 1:
//                printPlayList(q);
//                init(q);
//                break;
//            case 2:
//                addSongs(q);
//                init(q);
//                break;
//            case 3:
//                removeSongs(q);
//                init(q);
//                break;
//            case 4:
//                currentSong(q);
//                init(q);
//            case 5:
//                System.out.println("Thank you for Using");
//                break;
//        }
//    }
//
//    private static void currentSong(Queue<String> q) {
//        System.out.println(q.peek() + " Song is Playing");
//    }
//
//    private static void printPlayList(Queue<String> q) {
//           System.out.println(q);
//    }
//
//    private static void removeSongs(Queue<String> q) {
//        q.remove();
//        System.out.println("Song Deleted Successfully");
//    }
//
//    private static void addSongs(Queue<String> q) {
//        System.out.println("Enter the song name");
//        String s= sc.nextLine();
//        q.add(s);
//        System.out.println("Song Added Successfully");
//    }
//}


//class MusicPlayer{
//    public MusicPlayer() {
//
//    }
//}

import java.util.LinkedList;
import java.util.Scanner;


class Song {
    String title;
    String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}

class MusicPlayerPlaylist {
    static Scanner sc = new Scanner(System.in);
    LinkedList<Song> playlist;
    Song currentSong;

    public MusicPlayerPlaylist() {
        playlist = new LinkedList<>();
        currentSong = null;
    }

    public void addSong() {
        System.out.println("Enter the name of the song");
        String name = sc.nextLine();
        System.out.println("Enter the artist name of the song");
        String artist = sc.nextLine();
        Song s = new Song(name, artist);
        playlist.add(s);
        System.out.println(playlist);
        if (currentSong == null) {
            currentSong = s;
        }
    }

    public void removeSong() {
        System.out.println("Enter the name of the song");
        String name = sc.nextLine();
        System.out.println("Enter the artist name of the song");
        String artist = sc.nextLine();
        Song s = new Song(name, artist);
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        playlist.remove(s);
        if (currentSong == s) {
            if (!playlist.isEmpty()) {
                currentSong = playlist.getFirst();
            } else {
                currentSong = null;
            }
        }
    }

    public void playCurrentSong() {
        if (currentSong == null) {
            System.out.println("No song is currently selected.");
        } else {
            System.out.println("Playing: " + currentSong.title + " by " + currentSong.artist);
        }
    }

    public void skipToNextSong() {
        if (!playlist.isEmpty()) {
            int currentIndex = playlist.indexOf(currentSong);
            if (currentIndex != -1 && currentIndex < playlist.size() - 1) {
                currentSong = playlist.get(currentIndex + 1);
                System.out.println("Skipping to next song: " + currentSong.title);
            } else {
                System.out.println("No next song available.");
            }
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void printPlaylist() {
        for (Song song : playlist) {
            System.out.println(song.title);
        }
    }

}

class Assignment4 {
    static Scanner sc = new Scanner(System.in);

    private static MusicPlayerPlaylist playlist;

    static MusicPlayerPlaylist getInstance() {
        if (playlist == null) {
            playlist = new MusicPlayerPlaylist();
        }
        return playlist;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Music Player");
        getInstance();
        init();
    }

    public static void init() {
        System.out.println("\n 1.Add Song  \n 2.Current Song \n 3.Skip Song \n 4.Remove Song \n 5.View my Playlist \n 6.Exit");
        System.out.println("Enter your Choice");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                playlist.addSong();
                init();
                break;
            case 2:
                playlist.playCurrentSong();
                init();
                break;
            case 3:
                playlist.skipToNextSong();
                init();
                break;
            case 4:
                playlist.removeSong();
                init();
                break;
            case 5:
                playlist.printPlaylist();
                init();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}

