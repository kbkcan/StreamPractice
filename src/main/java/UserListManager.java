import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class UserListManager {

    private static ArrayList<User> userList = null;

    public UserListManager(ArrayList<User> userList) {
        this.userList = userList;
    }

    public HashMap<String,MutableInt> hobbyKeyNumberValue() {
        HashMap<String, ArrayList<User>> hobbyUserMap = new HashMap<>();
        HashMap<String, MutableInt> hobbyNumberMap = new HashMap<>();
        for (User user : userList) {

        }
        return hobbyNumberMap;
    }
}
