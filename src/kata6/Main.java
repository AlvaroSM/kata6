package kata6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, SQLException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Person> peopleList = MailListReader.read();
        HistogramBuilder builder = new HistogramBuilder<>(peopleList);

        Histogram<Character> letters = builder.build(new Attribute<Person, Character>() {
            @Override
            public Character get(Person person) {
                return person.getMail().charAt(0);

            }
        });

        Histogram<String> domains = builder.build(new Attribute<Person, String>() {
            @Override
            public String get(Person person) {
                return person.getMail().split("@")[1];
            }
        });

        new HistogramDisplay(domains).execute();
        new HistogramDisplay(letters).execute();
    }

}
