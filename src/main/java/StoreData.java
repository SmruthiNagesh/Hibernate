import Entityy.Category;
import Entityy.Catalog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.getCurrentSession();

        Transaction t = session.beginTransaction();

        Category category = new Category();
        category.setCategoryName("Language");

        Catalog catalog = new Catalog();
        catalog.setCatalog_Name("Hindi");
        catalog.setStatus("Active");

        Catalog catalog1 = new Catalog();
        catalog1.setCatalog_Name("English");
        catalog1.setStatus("Inactive");

        category.getListt().add(catalog);
        category.getListt().add(catalog1);

        catalog.setCategory(category);
        catalog1.setCategory(category);

//        session.save(category);
//        session.save(catalog);
//        session.save(catalog1);

        session.persist(category);

        t.commit();
        System.out.println("Successfully Done");
        session.close();
        factory.close();
    }
}