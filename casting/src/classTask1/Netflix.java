package classTask1;

public class Netflix {
	public void checkGenre(Genre genre) {
		if(genre instanceof Animation) {
			Animation anmation = (Animation)genre;
			anmation.showSubTitle();
			
		} else if(genre instanceof Drama) {
			Drama drama = (Drama)genre;
			drama.sellGoods();
			
		} else if(genre instanceof Movie) {
			Movie movie = (Movie)genre;
			movie.shakeChair();
			
		}
	}
	
}
