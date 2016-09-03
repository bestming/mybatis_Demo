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
import com.util.MybatisUtil;

public class junitTest5 {

	/**
	 * ���������ֶ�����ͬ����ѯʵ����
	 * @throws IOException
	 * һ��һ ˫��  Ƕ��SQL��ѯ д����SQL���
	 */
	@Test
	public void testSelect() throws IOException{
		SqlSession sqlSession=MybatisUtil.getSqlSessionFactory();

		String statement="com.oraclewdp5.IDCardMapper.selectIdCard";
		IDCard idCard=sqlSession.selectOne(statement,1);
		idCard.getNo();
		//System.out.println(idCard);
		//System.out.println(idCard.getStudent().getIdcard());
	}

}
