package cn.exrick.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.exrick.bean.Ip;

public interface IpDao extends JpaRepository<Ip,String>{

}
