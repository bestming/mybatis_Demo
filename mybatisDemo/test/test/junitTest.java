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
import com.util.MybatisUtil;

public class junitTest {

	/**
	 * ����û�
	 * @throws IOException
	 */
	@Test
	public void testAdd() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		User user=new User(null,"С��",23);
		String statement="com.oraclewdp.UserMapper.addUser";
		int insert=sqlSession.insert(statement,user);
		
		System.out.println(user.getId());
		sqlSession.commit();
	}
	
	/**
	 * �޸��û�
	 * @throws IOException
	 */
	@Test
	public void testUpdate() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		User user=new User(1,"��ظ�1",23);
		String statement="com.oraclewdp.UserMapper.updateUser";
		sqlSession.update(statement,user);
		sqlSession.commit();
	}
	
	/**
	 * ɾ���û�
	 * @throws IOException
	 */
	@Test
	public void testDelete() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		String statement="com.oraclewdp.UserMapper.deleteUser";
		sqlSession.delete(statement,2);
		sqlSession.commit();
	}
}
