import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserCSVReader {

    public static ArrayList<User> readAndGetUser(String pathName) {
        ArrayList<User> userList = new ArrayList<User>();
        File csv = new File(pathName);
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csv));
            while ((line = br.readLine()) != null) { // readLine()은 파일에서 개행된 한 줄의 데이터를 읽어온다.
                String[] lineArr = line.split(","); // 파일의 한 줄을 ,로 나누어 배열에 저장 후 리스트로 변환한다.
                User user = new User(lineArr[0],lineArr[1],lineArr[2]);
                userList.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close(); // 사용 후 BufferedReader를 닫아준다.
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        return userList;
    }
}