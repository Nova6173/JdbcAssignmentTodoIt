package se.Lexicon;

import se.Lexicon.data.PersonDao;
import se.Lexicon.data.impl.PersonDaoImpl;
import se.Lexicon.model.Person;

import java.util.Collection;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {

      PersonDao personDao = new PersonDaoImpl () {
          public Collection<Person> findByLastName (String lastName) {
              return List.of ();
          }

          public Collection<Person> findByFirstName (String firstName) {
              return List.of ();
          }

          public boolean deleteAll () {
              return false;
          }
      };

      Person newPerson = new Person ("John", "Doe");

        Person person1 = new Person();

        person1.setFirstName("John");
        person1.setLastName("Doe");

        personDao.create(person1);

        System.out.println ("Person: " + person1.getFirstName () + " " + person1.getLastName () + " profile succesfully created");

        Person person2 = new Person();

        person2.setFirstName("Jane");
        person2.setLastName("Doe");

        personDao.create(person2);

        System.out.println ("Person: " + person2.getFirstName () + " " + person2.getLastName () + " profile succesfully created");






    }
}
