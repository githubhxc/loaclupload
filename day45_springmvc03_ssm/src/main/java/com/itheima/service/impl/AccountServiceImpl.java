package com.itheima.service.impl;

import com.itheima.bean.Account;
import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    //定义属性
    @Autowired
    private AccountDao dao;

    public List<Account> findAll() {
        System.out.println("调用了AccountServiceImpl的findAll方法~！~");
        return dao.findAll();
    }


   /* public List<Account> findAll() {
        System.out.println("调用了AccountServiceImpl的findAll方法~！~");
        List<Account> list = null;


        try {
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
            list = dao.findAll();
            System.out.println("list = " + list);

            //7. 关闭sqlSession
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }*/
}
