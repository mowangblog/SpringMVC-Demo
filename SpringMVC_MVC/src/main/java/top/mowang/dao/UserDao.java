package top.mowang.dao;

import org.springframework.stereotype.Repository;
import top.mowang.pojo.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Spring-MVC-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/08 20:19
 **/
@Repository
public class UserDao {
    
    private static Map<Integer, User> users = null;

    static{
        users = new HashMap<Integer, User>();

        users.put(1001, new User(1001, "E-AA", "1111","aa@163.com", 1));
        users.put(1002, new User(1002, "E-BB","1111", "bb@163.com", 1));
        users.put(1003, new User(1003, "E-CC", "1111","cc@163.com", 0));
        users.put(1004, new User(1004, "E-DD","1111", "dd@163.com", 0));
        users.put(1005, new User(1005, "E-EE", "1111","ee@163.com", 1));
    }

    private static Integer initId = 1006;

    public void save(User User){
        if(User.getId() == null){
            User.setId(initId++);
        }
        users.put(User.getId(), User);
    }

    public Collection<User> getAll(){
        return users.values();
    }

    public User get(Integer id){
        return users.get(id);
    }

    public void delete(Integer id){
        users.remove(id);
    }

}
