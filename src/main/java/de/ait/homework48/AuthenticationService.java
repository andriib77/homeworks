package de.ait.homework48;

public class AuthenticationService {
    public void authenticate(String username, String password) {
        // Сравнение с зарегистрированным пользователем (просто для примера)
        User registeredUser = new User("exampleUser", "password123");

        if (!registeredUser.getUsername().equals(username) || !registeredUser.getPassword().equals(password)) {
            throw new AuthenticationException("Invalid username or password.");
        }
    }
}
