package service.impl;

/**
 * Created by xiaogangfan on 16/3/28.
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.TestDao;
import entity.User;
import service.TestService;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao dao;

    public String testQuery() throws Exception {
        List<User> users = dao.testQuery();
        String res = "";
        if (users != null && users.size() > 0) {
            for (User user : users) {
                res += user.toString() + "|";
            }
        } else {
            res = "Not found.";
        }
        return res;
    }
}