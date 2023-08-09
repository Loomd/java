// ArrayList practice: declaration, add(), remove(), set(), and swapping elements within an ArrayList.
import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("summer of 69");
    desertIslandPlaylist.add("Eye of the tiger");
    desertIslandPlaylist.add("Dead or alive");
    desertIslandPlaylist.add("Wheel in the sky");
    desertIslandPlaylist.add("Cotton eye joe");
    desertIslandPlaylist.add("Thugz mansion");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove(0);
    System.out.println(desertIslandPlaylist.size());
    int a = desertIslandPlaylist.indexOf("Eye of the tiger");
    int b = desertIslandPlaylist.indexOf("Cotton eye joe");
    String tempA = "Eye of the tiger";
    desertIslandPlaylist.set(a, "Cotton eye joe");
    System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(b, tempA);
    System.out.println(desertIslandPlaylist);

  }
  
}