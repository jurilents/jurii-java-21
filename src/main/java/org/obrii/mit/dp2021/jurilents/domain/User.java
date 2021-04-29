package org.obrii.mit.dp2021.jurilents.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

    public User() { }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "No name")
    private String name;

    @NotBlank(message = "No email")
    private String email;

    @NotBlank(message = "No family_name")
    private String family_name;

    @NotBlank(message = "No age")
    private String age;

    @NotBlank(message = "No language choosen")
    private String checkbox;

    @NotBlank(message = "No post choosen")
    private String post;

    @NotBlank(message = "No delievery choosen")
    private String delivery;

    @NotBlank(message = "No date")
    private String date;


    public void setId(long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }


    public void setAge(String age) {
        this.age = age;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }


    public void setPost(String post) {
        this.post = post;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getFamily_name() {
        return family_name;
    }


    public String getAge() {
        return age;
    }

    public String getCheckbox() {
        return checkbox;
    }


    public String getPost() {
        return post;
    }

    public String getDate() {
        return date;
    }

    public String getDelivery() {
        return delivery;
    }


    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email +
                ", family_name=" + family_name + ", age=" + age + ", checkbox=" + checkbox +
                ", post=" + post + ", delivery=" + delivery + ", date=" + date + '}';
    }
}
