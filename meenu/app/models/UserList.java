package meenu.models;

import java.util.ArrayList;


public class UserList {
    public ArrayList<UserProfile> listOfUsers = new ArrayList<>();
    
    
    
    public boolean addUser(String name){
        UserProfile profile = new UserProfile(name);
        return listOfUsers.add(profile);
    }
    
    public boolean removeUser(UserProfile user){
        return listOfUsers.remove(user);
    }
    
    public UserProfile getUser(int numb){
        return listOfUsers.get(numb);
    }

}
