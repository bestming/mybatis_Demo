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
import com.oraclewdp5.IDCard;
import com.oraclewdp6.Person;
import com.oraclewdp7.Group;
import com.util.MybatisUtil;

public class junitTest7 {

	/**
	 * ���������ֶ�����ͬ����ѯʵ����
	 * @throws IOException
	 * ��Զ࣬��һ�Զ����ƣ�ֻ���������м���ı���SQL���
	 */
	@Test
	public void testSelect() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();
		
		String statement="com.oraclewdp7.GroupMapper.selectOneGroup";
		Group group=sqlSession.selectOne(statement,1);
		System.out.println(group);
		System.out.println(group.getChilds());
		
	}

}
