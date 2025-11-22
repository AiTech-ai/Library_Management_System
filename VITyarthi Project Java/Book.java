public class Book{
    private int id;
    private String title;
    private String author;
    private int totalCopies;
    private int availableCopies;

    public Book(int id, String title,String author,int totalCopies){
        this.id= id;
        this.title= title;
        this.author= author;
        this.totalCopies= totalCopies;
        this.availableCopies= totalCopies;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getTotalCopies(){
        return totalCopies;
    }

    public int getAvailableCopies(){
        return availableCopies;
    }

    public void setTitle(String title){
        this.title= title;
    }

    public void setAuthor(String author){
        this.author= author;
    }

    public void setTotalCopies(int totalCopies){
        this.totalCopies= totalCopies;
        if(availableCopies>totalCopies){
            availableCopies= totalCopies;
        }
    }

    public boolean issueOneCopy(){
        if(availableCopies>0){
            availableCopies--;
            return true;
        }
        return false;
    }

    public void returnoneCopy(){
        if(availableCopies<totalCopies){
            availableCopies++;
        }
    }

    @Override
    public String toString(){
        return "Book ID: "+ id +
                ", Title: "+title+
                ", Author: "+ author+ 
                ", Total: "+totalCopies+
                ", Available: "+availableCopies;
    }


}