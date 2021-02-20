

import java.util.List;
import mybatis.entity.SysUserInfo;
import mybatis.util.MyBatisutil;
import org.apache.ibatis.session.SqlSession;


public class Main {

    public static void main(String[] args) {

        System.out.println("Test-Data:");

        // 获取SqlSession对象
        SqlSession session = MyBatisutil.getSqlSession();
        // 查询全部对象
        List<SysUserInfo> list = session.selectList("mybatis.entity.SysUserInfo.queryUsers");
        System.out.println("总记录数：" + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //关闭SqlSession对象
        MyBatisutil.closeSqlSession(session);

    }

}
