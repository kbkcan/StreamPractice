import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private String name;
    private ArrayList<String> hobby;

    public String getName() {
        return name;
    }

    public ArrayList<String> getHobby() {
        return hobby;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    private String selfIntroduction;


    public User(String name, String hobbyString, String selfIntroduction) {
        this.name = name;
        this.hobby = makeHobbyList(hobbyString);
        this.selfIntroduction = selfIntroduction;
    }

    private ArrayList<String> makeHobbyList(String hobbyString) {
        ArrayList<String> hobbyList = new ArrayList<>();
        System.out.println("hobbyString = " + hobbyString);;
        String hobbyArray[] = hobbyString.split(":");
        for (String hobby: hobbyArray){
            hobbyList.add(hobby.trim());
        }
        return hobbyList;
    }
}
