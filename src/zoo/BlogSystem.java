package zoo;


import java.util.Date;

public class BlogSystem
{

    private String author;
    private String blogTitle;
    private String blogMessage;
    Date blogDate;
    public String category[] = {"News", "Entertainment", "Business Opportunity"};


    public BlogSystem()
    {

    }
    public BlogSystem(String author,  String blogTitle, String blogMessage, int catNumber)
    {
        this.author = author;
        this.blogTitle = blogTitle;
        this.blogMessage = blogMessage;
        String cat = category[catNumber];
        blogDate = new Date();

        printPost(author, blogTitle, blogMessage, blogDate, cat);

    }
    public void publish()
    {
        System.out.println("Blog post is published");

    }

    public void deletPost()
    {
        System.out.println("Blog post is deleted");
    }
    public void editPost()
    {

    }
    private void printPost(String author, String blogTitle, String blogMessage, Date blogDate, String cat)
    {
        System.out.println(blogTitle.toUpperCase() + "!!!!");
        System.out.println("By: " + author);
        System.out.println("Category: " + cat);
        System.out.println("Written on: " + blogDate.toString());
        System.out.println(blogMessage);

    }

    public String getAuthor() {
    return author;
}

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogMessage() {
        return blogMessage;
    }

    public void setBlogMessage(String blogMessage) {
        this.blogMessage = blogMessage;
    }
}
