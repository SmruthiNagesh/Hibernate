package Entityy;
import javax.persistence.*;

@Entity
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    String catalog_Name;

    String status;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getCatalog_Name() {
        return catalog_Name;
    }

    public void setCatalog_Name(String catalogName) {
        this.catalog_Name = catalogName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}