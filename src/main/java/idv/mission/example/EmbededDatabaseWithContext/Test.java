package idv.mission.example.EmbededDatabaseWithContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");

        try {
            System.out.println("You have 30 secs to open H2 console and view the db content.");
            Thread.sleep(30 * 1000);
        }
        catch (Exception ex) {
            System.out.println(ex.toString());
        }

        UserDao dao = context.getBean(UserDao.class);
        User user = dao.findByName("mission");
        System.out.println(user);
        System.out.println(user.getId().intValue());
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println("End");
        context.close();
    }
}