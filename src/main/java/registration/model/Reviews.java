package registration.model;

public class Reviews{
	private int rating;
	private String message;
	private int id;
	
	public Reviews(int rating, String message) {
		this.rating = rating;
		this.message = message;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int val) {
		this.rating = val;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
