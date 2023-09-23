import java.util.*;
public class FILES {
    File dataFile = new File("ab.txt");

    public boolean append(User user) {
        try (FileWriter writer = new FileWriter(dataFile, true)) {
            writer.append(user.toString());
            writer.flush();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<User> readAll() {
        List<User> users=new ArrayList<>();
        try (Scanner sc = new Scanner(dataFile)) {
            while(sc.hasNextLine()){
                String line=sc.nextLine().trim();
                String userData[]=line.split(",,,");
                User user=new User(userData[0], userData[1], Long.parseLong(userData[2]), userData[3], userData[4]);
                users.add(user);
            }
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
        return users;
    }

    public User isUserAvailable(String email,String password){
        List<User> list=readAll();
        for (User u : list) {
            if(  u.getEmail().equals(email)
            && u.getPassword().equals(password)
            ){
                return u;
            }
        }
        return null;
    }

}
