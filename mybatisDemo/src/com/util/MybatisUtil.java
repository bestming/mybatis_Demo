package com.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	public static SqlSession getSqlSessionFactory() throws IOException{
		String config="mybatis.cfg.xml";
		InputStream in=Resources.getResourceAsStream(config);
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
		//�����ֶ��ύ��Ĭ�����ֶ��ύ
		SqlSession sqlSession=sqlSessionFactory.openSession(false);
		return sqlSession;
	}
}
