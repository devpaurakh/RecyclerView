package np.com.paurakhsaud.recyclerview.features.pojo;

public class ProfilePojo {

    public int profilePhoto;
    public int bin;
   public String name, post;

    public ProfilePojo(int profilePhoto, String name, String post, int bin) {
        this.profilePhoto = profilePhoto;
        this.bin = bin;
        this.name = name;
        this.post = post;
    }
}
