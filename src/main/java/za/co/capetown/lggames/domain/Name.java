package za.co.capetown.lggames.domain;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Name {
    private String firstName;
    private String lastName;

    public Name() {}

    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(firstName, name.firstName) && Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public static class Builder {
        private String firstName;
        private String lastName;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Name name) {
            this.firstName = name.firstName;
            this.lastName = name.lastName;
            return this;
        }

        public Name build() {
            return new Name(this);
        }

    }


}
