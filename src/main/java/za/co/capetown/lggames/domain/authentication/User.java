package za.co.capetown.lggames.domain.authentication;

import jakarta.persistence.*;
import za.co.capetown.lggames.domain.Name;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String userId;
    @Embedded
    private Name name;
    private String userName;
    private String email;
    private String phoneNumber;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(){}

    private User(Builder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.userName = builder.userName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.password = builder.password;
        this.role = builder.role;
    }

    public String getUserId() {
        return userId;
    }

    public Name getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public static class Builder{
        private String userId;
        private Name name;
        private String userName;
        private String email;
        private String phoneNumber;
        private String password;
        private Role role;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setRole(Role role){
            this.role = role;
            return this;
        }

        public Builder copy(User user){
            this.userId = user.userId;
            this.name = user.name;
            this.userName = user.userName;
            this.email = user.email;
            this.phoneNumber = user.phoneNumber;
            this.password = user.password;
            this.role = user.role;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
