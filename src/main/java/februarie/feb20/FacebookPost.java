package februarie.feb20;

public class FacebookPost implements main.java.februarie.feb20.Likeable {

    public String content;
    public int likes;

    @Override
    public void addLike() {
        likes++;
        System.out.println(likes);
    }
}
