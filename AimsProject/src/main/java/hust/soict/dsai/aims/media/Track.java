// Nguyen Trung Kien 20226110
package hust.soict.dsai.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }


    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Length of the track: " + this.getLength());
    }

    @Override
    public boolean equals(Object obj_kien){
        if (this == obj_kien){
            return true;
        } if (obj_kien == null || getClass() != obj_kien.getClass()) {
            return false;
        }
        Track other = (Track) obj_kien;
        return this.title.equals(other.title) && this.length == other.length ;
    }
}
