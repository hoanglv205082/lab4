package hust.soict.dsai.aims.media;


	public class Disc extends Media{
		protected int length;
		protected String director;
		public Disc(){
	        super();
	    }
		public void setLength(int length) {
			this.length = length;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		
		public Disc(String title) {
			super(title);
		}
		public Disc(String title, String category) {
			super(title, category);
		}
		public Disc(String title, String category, float cost) {
			super(title, category, cost);
		}
		public Disc(String title, String category, String director) {
			super(title, category);
			this.director = director;
		}
		public Disc(String title, String category, String director, int length, float cost) {
			super(title, category, cost);
			this.director = director;
			this.length = length;
		}
		public Disc(int id, String title, String category, String director, int length, float cost) {
			super(title, category, cost);
			this.director = director;
			this.length = length;
		}
		public Disc(int id, String title, String category, String director, float cost) {
	        super(title, category, cost);
	        this.director = director;
	    }
		public int getLength() {
			return length;
		}
		public String getDirector() {
			return director;
		}
		
	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}}