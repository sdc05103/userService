
import java.util.HashMap;
import java.util.Map;

public class UserDAO {

    Map<Integer, User> db = new HashMap<>();

    public boolean save(User user){
        int size = db.size();
        db.put(size + 1, user);
        if (size + 1 == db.size()) {
            return true;
        }
        return false;
    }

    public Boolean find(User user) {
        for (User u : db.values()) {
            if (u.getUser_id().equals(user.getUser_id()) && u.getUser_pwd().equals(user.getUser_pwd())) {
                return true;
            }
        }
        return false;
    }





}

