package dao;

/**
 * Created by xiaogangfan on 16/3/28.
 */

import java.util.List;
import entity.User;

public interface TestDao {
    public List<User> testQuery() throws Exception;
}