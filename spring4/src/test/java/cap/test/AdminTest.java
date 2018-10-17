package cap.test;

import cap.bean.Admin;
import cap.service.AdminService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminTest {
    ApplicationContext context = null;

    @Test
    public void testAdmin(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Admin admin = (Admin) context.getBean("admin");
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());

    }

    @Test
    public void testAdmin2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Admin admin = (Admin) context.getBean("admin2");
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
    }

    @Test
    public  void  testAdmin3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Admin admin = (Admin) context.getBean("admin3");
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
    }

    @Test
    public void testSayHello(){
        AdminService adminService = (AdminService) context.getBean("adminService2");
        System.out.println(adminService.sayHello());
    }

    @Test
    public void testAdmin4(){
        Admin admin = new Admin();
        admin.setId(1);
        admin.setUsername("zch213x");
        admin.getPassword("zch224");
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
    }
}
