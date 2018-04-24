package idv.mission.example.EmbededDatabaseWithContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		UserDao dao = context.getBean(UserDao.class);
		User user = dao.findByName("mission");
		System.out.println(user);
		System.out.println(user.getId().intValue());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
	}
}