package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.oraclewdp.User;
import com.oraclewdp2.UserMapper;
import com.oraclewdp3.Order;
import com.oraclewdp4.Classes;
import com.oraclewdp4.Teacher;
import com.util.MybatisUtil;

public class junitTest4 {

	/**
	 * ���������ֶ�����ͬ����ѯʵ����
	 * @throws IOException
	 * һ��һ ����  Ƕ��SQL��ѯ д����SQL���
	 */
	@Test
	public void testSelect() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		String statement="com.oraclewdp4.ClassesMapper.selectOneClasses";
		Classes classes=sqlSession.selectOne(statement,1);
		System.out.println("classes:"+classes);
		
		Teacher teacher=classes.getTeacher();
		System.out.println("teacher:"+teacher);
	}

	/**
	 * һ��һ ����  Ƕ�׽����ѯ һ��SQL����ѯ����
	 * @throws IOException
	 */
	
	@Test
	public void testSelect02() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		String statement="com.oraclewdp4.ClassesMapper.selectOneClasses2";
		Classes classes=sqlSession.selectOne(statement,1);
		System.out.println(classes.getTeacher());
	}
}
