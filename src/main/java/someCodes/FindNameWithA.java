package someCodes;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNameWithA {
    public static void main(String[] args) {
        Group g1 = new Group("astro");
        Group g2 = new Group("best");
        Group g3 = new Group("cent");
        Group g4 = new Group("desc");

        User u1 = new User("Ivan", Arrays.asList(g1, g3));
        User u2 = new User("Fedor", Arrays.asList(g2, g3));
        User u3 = new User("Stepan", Arrays.asList(g4, g3));
        User u4 = new User("Alex", Arrays.asList(g2, g3));
        User u5 = new User("Dima", Arrays.asList(g2, g3));
        User u6 = new User("Petr", Arrays.asList(g2, g3));
        User u7 = new User("Serg", Arrays.asList(g4, g3));
        User u8 = new User("Mask", Arrays.asList(g4, g3, g1));

        List<User> users = Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8);
        List<User> usersStartsWithA = users.stream().
                filter(
                        user -> user.getGroups()
                                .stream()
                                .anyMatch(g -> g.getName().startsWith("a"))
                ).collect(Collectors.toList());

        System.out.println("Name(s) person in group where groupname starts with \"a\": ");
        usersStartsWithA.stream()
                .map(user -> user.getName())
                .forEach(System.out::println);

    }

    static class Group {
        String name;

        public Group(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class User {
        String name;
        List<Group> groups;

        public User(String name, List<Group> groups) {
            this.name = name;
            this.groups = groups;
        }

        public String getName() {
            return name;
        }

        public List<Group> getGroups() {
            return groups;
        }
    }
}
