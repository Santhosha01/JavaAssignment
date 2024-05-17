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
        System.out.println("Song Added Successfully");
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
        System.out.println("Song Removed Successfully");
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

