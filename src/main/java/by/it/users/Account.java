package by.it.users;

import java.util.HashMap;

import by.it.users.bean.User;

public class Account {
	public static User currentUser = new User();
	public static HashMap<String, User> userList = new HashMap<String, User>();
	
	public static boolean checkUser(String login) {
		return userList.containsKey(login);
	}
	
	public static String getPassword(String login) {
        return userList.get(login).getPassword();
    }
}
