
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    
    public boolean equals(Object compared) {
       
        //if variables are at the same position in memory; they are equals:
        if (this == compared) {
            return true;
        }
        
        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }
        
        //convert the object into a Song object to compare its variables
        Song comparedSong = (Song) compared;
        
        if (this.artist.equals(comparedSong.artist)
                && this.name.equals(comparedSong.name)
                && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        
        //if all fails, objects are not equal
        return false;
        
    }
    
    
}
