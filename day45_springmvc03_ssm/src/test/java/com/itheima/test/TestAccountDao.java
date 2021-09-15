package com.itheima.test;

import com.itheima.bean.Account;
import com.itheima.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestAccountDao {

    //mybatis的入门代码，纯测试看看mybatis能不能用！
    @Test
    public void testFindAll() throws Exception {

        //1. 读取sqlMapConfig文件，
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2. 构建SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //3. 构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = builder.build(is);

        //4. 问工厂要SqlSession
        SqlSession session = sqlSessionFactory.openSession();

        //5. 问SqlSession 要dao的代理
        AccountDao dao = session.getMapper(AccountDao.class);

        //6. 调用方法
        List<Account> list = dao.findAll();
        System.out.println("list = " + list);

        //7. 关闭sqlSession
        session.commit();
        session.close();

    }
}
