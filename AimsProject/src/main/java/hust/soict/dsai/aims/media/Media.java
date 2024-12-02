// Nguyen Trung Kien 20226110
package hust.soict.dsai.aims.media;
import java.util.Comparator;
public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object object_kien){
        if (this == object_kien){
            return true;
        } if (getClass() != object_kien.getClass() || object_kien == null ) {
            return false;
        }
        Media other = (Media) object_kien;
        return this.title.equals(other.title);
    }
    
    public boolean isMatch(String search_Str) {
        boolean matched = false;
        String[] searchArray = search_Str.split(" ", 0);
        String title = this.getTitle();
        for (String word: searchArray) {
            String lowerCaseTitle = title.toLowerCase();
            int index = lowerCaseTitle.indexOf(word.toLowerCase());
            if (index != -1) {
                matched = true;
                break;
            }
        }
        return matched;
    }
}
