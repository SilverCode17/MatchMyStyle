/**
 * Created by Rajat on 02-Feb-18.
 */

public class RowItem {

    private String image_title;
    private int img_id;
    private float price;
    private String link;

    public RowItem(String image_title, int img_id, float price, String link) {
        this.image_title = image_title;
        this.img_id = img_id;
        this.price = price;
        this.link = link;
    }

    public String getImage_title() {return image_title; }

    public void setImage_title(String image_title) { this.image_title=image_title; }

    public int getImg_id() {return img_id; }

    public void setImg_id(int img_id) { this.img_id=img_id; }

    public float getPrice() {return price; }

    public void setPrice(float price) { this.price=price; }

    public String getLink() {return link; }

    public void setLink(String link) {this.link=link; }
}
