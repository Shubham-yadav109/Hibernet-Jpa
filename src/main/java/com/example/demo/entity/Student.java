package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student{

    private String name;
    private int age;
    @Id
    private int id;
    @JsonProperty("my_email")
    private String email;
    private String address;

    public Student(){}

    public Student(int id,String name, String email,int age,String address){
        this.name=name;
        this.id=id;
        this.age=age;
        this.email=email;
        this.address=address;
    }


        public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public  void setAddress(String address){
        this.address=address;
    }
    public String  getAddress(){
        return address;
    }
}