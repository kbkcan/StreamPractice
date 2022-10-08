import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class UserListManager {

    private static ArrayList<User> userList = null;

    public UserListManager(ArrayList<User> userList) {
        this.userList = userList;
    }

    public HashMap<String,MutableInt> hobbyKeyNumberValue() {
        HashMap<String, MutableInt> hobbyNumberMap = new HashMap<>();
        for (User user : userList) {
            ArrayList<String> hobbyList = user.getHobby();
            for(String hobby:hobbyList){
                MutableInt count = hobbyNumberMap.get(hobby);
                if(count == null){
                    hobbyNumberMap.put(hobby,new MutableInt());
                }else{
                    count.increment();
                }
            }
        }
        return hobbyNumberMap;
    }
}
