import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        List<String> wordsArr = new ArrayList<>(Arrays.asList("Apple", "Tomato", "New York", "Witcher", "Tomato", "Killer", "Killer", "Apple", "Chips", "Cloud"));
        System.out.println(wordsArr);
        Set<String> withoutDubs = new LinkedHashSet<>(wordsArr);
        wordsArr.clear();
        wordsArr.addAll(withoutDubs);
        System.out.println(wordsArr);

        System.out.println();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Taylor", new ArrayList<Integer>(Arrays.asList(659545518)));
        phoneBook.add("Umurzkov", new ArrayList<Integer>(Arrays.asList(94938221, 5894565, 422762856)));
        phoneBook.add("Petrova", new ArrayList<Integer>(Arrays.asList(78431524)));
        phoneBook.add("Toktobekov", new ArrayList<Integer>(Arrays.asList(31579468, 547995565)));
        phoneBook.add("Sooronbev", new ArrayList<Integer>(Arrays.asList(546937258)));
        phoneBook.add("Alekseev", new ArrayList<Integer>(Arrays.asList(451632734)));

//        phoneBook.phoneInfo();
        phoneBook.get("Umurzkov");
        phoneBook.get("Toktobekov");
    }
}

class PhoneBook {
    private HashMap<String, ArrayList<Integer>> namesAndNumbers = new HashMap<>();

    public void get(String lastName) {
        if (namesAndNumbers.get(lastName) == null) {
            System.out.println("Error! There are no people with such last name");
        } else {
            System.out.println(lastName + "'s number: " + namesAndNumbers.get(lastName));
        }
    }

    public void add(String name, ArrayList<Integer> namubers) {
        namesAndNumbers.put(name, namubers);
    }

    public void phoneInfo() {
        for (Map.Entry<String, ArrayList<Integer>> o : namesAndNumbers.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
}
