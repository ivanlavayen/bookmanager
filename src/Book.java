public class Book {
    // atributos  - attributes

    private String title;
    private String author;
    private String isnb;// identificador internacional de publicaciones
    private String gender;
    private boolean available;

    public Book(String title,String author,String isnb,String gender,boolean available){
        //constructor parametrizado - parameterized constructor
        this.title=title;
        this.author=author;
        this.isnb=isnb;
        this.gender=gender;
        this.available=available;

    }
    //getters y setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
