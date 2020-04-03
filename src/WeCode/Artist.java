package WeCode;

public class Artist extends User{
	String musicGenre;
	String songList[][];
	
	public Artist() {
		super();
		this.musicGenre="";
		this.songList = new String[5][2];
	}

	public Artist(String musicGenre, String[][] songList, User user) {
		super();
		this.musicGenre = musicGenre;
		this.songList = songList;
	}

	public String getMusicGenre() {
		return musicGenre;
	}

	public void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}

	public String[][] getSongList() {
		return songList;
	}

	public void setSongList(String[][] songList) {
		this.songList = songList;
	}

	@Override
	public void printDetails() {
		
		System.out.println("Artist Name is " + uname);
		System.out.println("Artist Email is " + uemail);
		System.out.println("Artist Music genre is " + musicGenre);
		System.out.println("Song List is");
		
		for (int i = 0; i < this.songList.length; i++) {
			System.out.println(this.songList[i][0] + " " + this.songList[i][1]);
		}
		
	}
	
	
}
