package NHCBDP.auditModule.Dao;

import NHCBDP.auditModule.Domain.User;
import NHCBDP.auditModule.Domain.UserTest;
import NHCBDP.auditModule.DynamicDataSource.TargetDataSource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wbliu
 * @create 2017-09-04 17:02
 **/


public interface UserDao {
    User selectByUserNameAndPassword(User user);


    //@Transactional(readOnly = true)
    List<User> findAll();

    @TargetDataSource(name = "ds1")
    @Transactional(readOnly = true)
    List<UserTest> findAllForDs1(String tableName);

    //@Transactional(readOnly = true)
    User findUserById(int id);


    @Transactional
    int insert(User user);

    @Transactional
    void delete(Integer id);

    @Transactional
    void update(User user);

    int selectByUserName(String userName);
}
