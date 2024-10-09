package U4S3L3;

import U4S3L3.dao.BaseDAO;
import U4S3L3.entities.Event;
import U4S3L3.entities.Location;
import U4S3L3.entities.Partecipation;
import U4S3L3.entities.Person;
import U4S3L3.enums.EventType;
import U4S3L3.enums.Genders;
import U4S3L3.enums.PartecipationStates;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory U4S3L3Factory = Persistence.createEntityManagerFactory("u4s3l3");

    public static void main(String[] args) {
        System.out.println("Hello World!");

        EntityManager em = U4S3L3Factory.createEntityManager();

        BaseDAO bd = new BaseDAO(em);

//        Location test = new Location("test1", "test1");

//        try {
//            Event e = new Event("Test1", LocalDate.now(), "test1", EventType.PUBLIC, 10, bd.getObjectById(Location.class, "195a3152-8246-4348-a1cc-e5a69691ea9e"));
//            bd.save(e);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

//        try {
//            test = bd.getObjectById(Location.class, "d608fef8-f7d0-44fc-97a8-5fe62979e5c4");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(test);

//        try {
//            bd.delete(Location.class, "d608fef8-f7d0-44fc-97a8-5fe62979e5c4");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        Event e = new Event();
//
//        try {
//            e = bd.getObjectById(Event.class, "0c7b9c86-b1c0-4081-932c-a284acd91e5e");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        System.out.println(e);

//        event 0c7b9c86-b1c0-4081-932c-a284acd91e5e

//        try {
//            bd.delete(Event.class, "0c7b9c86-b1c0-4081-932c-a284acd91e5e");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        Person person = new Person("mario", "rossi", "asd", LocalDate.now(), Genders.OTHER);

//        bd.save(person);
//
//        try {
//            person = bd.getObjectById(Person.class, "bbde666e-704f-460c-b56c-da77241fd3c3");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        System.out.println(person);


//        try {
//            bd.delete(Person.class, "bbde666e-704f-460c-b56c-da77241fd3c3");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


//        try {
//            Event e = bd.getObjectById(Event.class, "fa51bb59-ceae-4315-9273-c56c186f6879");
//
//            Person p = bd.getObjectById(Person.class, "d5caa048-e612-4c59-a50a-d02c82526890");
//
//            Partecipation partecipation = new Partecipation(p,e, PartecipationStates.CONFIRMED);
//            bd.save(partecipation);
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

//        try {
//            System.out.println(bd.getObjectById(Partecipation.class, "405353c5-74f5-42d4-9812-787f4475ba51"));
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }


        try {
            bd.delete(Partecipation.class,"405353c5-74f5-42d4-9812-787f4475ba51" );
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        System.out.println("END :(");

    }
}
