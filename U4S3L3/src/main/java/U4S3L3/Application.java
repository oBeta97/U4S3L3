package U4S3L3;

import U4S3L3.dao.BaseDAO;
import U4S3L3.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory U4S3L3Factory = Persistence.createEntityManagerFactory("u4s3l3");

    public static void main(String[] args) {
        System.out.println("Hello World!");

        EntityManager em = U4S3L3Factory.createEntityManager();

        BaseDAO bd = new BaseDAO(em);

        Location test = new Location("test1", "test1");

        bd.save(test);

//        try {
//            test = bd.getEventById(Location.class, "d608fef8-f7d0-44fc-97a8-5fe62979e5c4");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(test);

        try {
            bd.delete(Location.class, "d608fef8-f7d0-44fc-97a8-5fe62979e5c4");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("END :(");

    }
}
