/*
Manager.java
This is the Manager class
author : Lithemba Nkqayi(220558558)
6 April 2023
 */
package za.ac.cput.domain;


public class Manager {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public Manager() {
    }
    private Manager (Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;

    }
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder  setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Builder copy (Manager manager){
            this.id = manager.id;
            this.firstName = manager.firstName;
            this.lastName = manager.lastName;
            this.email = manager.id;
            this.password = manager.password;
            return this;
        }
        public Manager build(){return new Manager(this);}
    }
}
