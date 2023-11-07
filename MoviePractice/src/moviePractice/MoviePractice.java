package moviePractice;

interface MovieInter{
	public abstract void movieTitleMethod();
	public abstract void movieGenreMethod();
}

class Movie implements MovieInter{
	String movieTitle;
	String movieGenre;
	
	public Movie(String movieTitle, String movieGenre) {
		this.movieTitle = movieTitle;
		this.movieGenre = movieGenre;
	}

	@Override
	public void movieTitleMethod() {
		System.out.println("저의 취미생활 중 영화보기도 있습니다.");
		System.out.println("제가 제일 좋아하는 영화의 제목을 4개만 뽑자면 " + this.movieTitle + " 가 있습니다.");
	}

	@Override
	public void movieGenreMethod() {
		System.out.println(this.movieTitle + "의 영화 장르는 각각 " + this.movieGenre + "입니다.");
	}
	
	public void favoriteGenreMethod() {
		System.out.println("저는 다양한 장르의 영화를 좋아합니다.");
		System.out.println("특히 저는 멜로/로맨스, 액션, 범죄, 코미디 등 장르의 영화를 좋아합니다.");
	}

}

public class MoviePractice {

	public static void main(String[] args) {
		System.out.println("========== 내가 좋아하는 영화 종류 ===========");
		
		MovieInter mi = new Movie("나니아연대기, 아이언맨, 스파이더맨, 지금 만나러 갑니다", "모험, 액션, 액션, 멜로/로맨스");
		mi.movieTitleMethod();
		mi.movieGenreMethod();
		
		System.out.println("=========== 내가 좋아하는 영화의 장르 ===============");
		
		Movie movie = (Movie) mi;
		movie.favoriteGenreMethod();
		
		

	}

}
