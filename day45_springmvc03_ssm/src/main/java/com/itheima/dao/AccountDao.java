package com.itheima.dao;

import com.itheima.bean.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AccountDao {

    /**
     * 查询所有
     * @return
     */

    List<Account>  findAll();

   /* @Select("select * from account")
    List<Account>  findAll();*/

}
