package hust.soict.dsai.aims.media;



public abstract class Media {
	protected int id;
	protected String title;
	protected String category;
	protected static float cost;
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCost(float cost) {
		Media.cost = cost;
	}

	public Media() {
    }

    public Media(String title) {
        this.title = title;
    }

    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public static float getCost() {
        return cost;
    }
    
    public abstract void print();
}
