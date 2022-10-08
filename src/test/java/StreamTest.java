import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    ArrayList<User> userList = null;

    @BeforeAll
    public void readCsv() throws FileNotFoundException {
        String csvFilePath = "C://Users//darin//IdeaProjects//StreamPractice//src//main//User.csv";
        userList= UserCSVReader.readAndGetUser(csvFilePath);
    }

    @Test
    public void hobbyKeyNumberValueTest(){
       /* 위와 같은 데이터를 조회하여 각 취미를 선호하는 인원이 몇 명인지 계산하여라.*/
//        Stream<User> userStream = userList.stream();
//        userStream.collect(Collectors.toMap());
        UserListManager userListManager = new UserListManager(userList);
        HashMap<String,MutableInt> hobbyKeyNumberValueMap = userListManager.hobbyKeyNumberValue();
        Assertions.assertEquals(3, hobbyKeyNumberValueMap.get("축구").get());
    }
}