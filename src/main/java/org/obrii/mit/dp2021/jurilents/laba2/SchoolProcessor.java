package org.obrii.mit.dp2021.jurilents.laba2;

import org.obrii.mit.dp2021.jurilents.laba2.clubs.IClub;
import org.obrii.mit.dp2021.jurilents.laba2.clubs.LiteratureClub;
import org.obrii.mit.dp2021.jurilents.laba2.clubs.MusicClub;
import org.obrii.mit.dp2021.jurilents.laba2.clubs.SportClub;
import org.obrii.mit.dp2021.jurilents.laba2.students.*;

import java.util.*;

import static java.util.stream.Collectors.toCollection;

public class SchoolProcessor {
    private final Map<String, IStudent> s_students = new HashMap<>();
    private final Map<String, IClub> s_clubs = new HashMap<>();
    private final List<String> s_stuff = new ArrayList<>();

    public SchoolProcessor() {
        IClub literatureClub = new LiteratureClub("literature", 404, "Literature Club", "mmmMMMmMmMMMmmm");
        IClub musikClub = new MusicClub("music", 410, "Music Club", "If you are interested in musical instruments, then you should definitely look into the music club, my friend! Here you will find many internees, in addition to more local zbrod. Although no one will teach you anything new here, you can see what your peers have achieved and regret even more the meaninglessness of your existence. I hope my friend will be satisfied with his visits to our club and playing the instruments.");
        IClub sportClub = new SportClub("sport", 212, "Sport Club", "This is a real sports club! Here people are engaged, unlike IT specialists, spotrom and lead a healthy lifestyle. If you come here at least once, you will have an unforgettable experience and (possibly) several injuries. It's good that there is also a first-aid post nearby, which has a lonely nurse. All people know that the best way to spend time is to go to a sports club.");

        s_clubs.put("literature", literatureClub);
        s_clubs.put("music", musikClub);
        s_clubs.put("sport", sportClub);

        s_students.put("Kaguya", new CouncilMember(0, "Kaguya", SexType.Female, literatureClub));
        s_students.put("Miyuki", new CouncilMember(1, "Miyuki", SexType.Male));
        s_students.put("Dzedziro", new CouncilMember(2, "Dzedziro", SexType.Male, literatureClub));
        s_students.put("Nao", new CouncilMember(3, "Nao", SexType.Male, sportClub));

        s_students.put("Noel", new WiseacreStudent(4, "Noel", SexType.Female, literatureClub));
        s_students.put("Avel", new WiseacreStudent(5, "Avel", SexType.Male, literatureClub));
        s_students.put("Sam O'Nella", new WiseacreStudent(6, "Sam O'Nella", SexType.Male, literatureClub));
        s_students.put("Anna", new WiseacreStudent(7, "Anna", SexType.Female, literatureClub));
        s_students.put("Yulia", new WiseacreStudent(25, "Yulia", SexType.Female, musikClub));

        s_students.put("Tomohiko", new AverageStudent(8, "Tomohiko", SexType.Male));
        s_students.put("Kioti", new AverageStudent(9, "Kioti", SexType.Male, musikClub));
        s_students.put("May", new AverageStudent(10, "May", SexType.Female, musikClub));
        s_students.put("Sir. Chieff", new AverageStudent(11, "Sir. Chieff", SexType.Male, sportClub));
        s_students.put("Mr. Muscle", new AverageStudent(12, "Mr. Muscle", SexType.Male, sportClub));
        s_students.put("Jotaro", new AverageStudent(13, "Jotaro", SexType.Male, sportClub));
        s_students.put("Kolly", new AverageStudent(14, "Kolly", SexType.Female, musikClub));
        s_students.put("York", new AverageStudent(15, "York", SexType.Male, musikClub));
        s_students.put("Qwerty", new AverageStudent(16, "Qwerty", SexType.Male, sportClub));
        s_students.put("Huanes", new AverageStudent(18, "Huanes", SexType.Male, sportClub));
        s_students.put("Mary", new AverageStudent(21, "Mary", SexType.Female, musikClub));
        s_students.put("Apple", new AverageStudent(22, "Apple", SexType.Female, literatureClub));

        s_students.put("Rust", new StupidStudent(19, "Rust", SexType.Male, sportClub));
        s_students.put("Dart", new StupidStudent(20, "Dart", SexType.Male, sportClub));
        s_students.put("Pivanso", new StupidStudent(17, "Pivanso", SexType.Male, sportClub));
        s_students.put("False", new StupidStudent(23, "False", SexType.Female, musikClub));
        s_students.put("Bobby", new StupidStudent(24, "Bobby", SexType.Female));
        s_students.put("Lord Python", new StupidStudent(26, "Lord Python", SexType.Male, sportClub));

        s_stuff.add("Ball");
        s_stuff.add("Pool");
        s_stuff.add("Uniform");
        s_stuff.add("Guitar");
        s_stuff.add("Piano");
        s_stuff.add("Viola");
        s_stuff.add("Book");
        s_stuff.add("Book");
        s_stuff.add("Book");
        s_stuff.add("Unesennye Vetrom");
        s_stuff.add("FriendShoulder");
    }

    public String generateNextDayFor(String studentName, IClub club) {
        if (!s_students.containsKey(studentName)) return "";

        IStudent student = s_students.get(studentName);

        Random rnd = new Random();
        if (rnd.nextInt(12) < 6) {
            return club.useStuff(student);
        } else {
            return club.useStuff(student, Tools.getRandomItemFrom(s_stuff));
        }
    }

    public ArrayList<IClub> getClubs() {
        return s_clubs.values().stream().collect(toCollection(ArrayList::new));
    }

    public IClub getClub(String name) {
        return s_clubs.get(name);
    }

    public ArrayList<IStudent> getStudents() {
        return s_students.values().stream().collect(toCollection(ArrayList::new));
    }
}
