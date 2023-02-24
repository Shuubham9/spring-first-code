package com.vaggy.studentManagement;

public class Student {
    private int AdmNo;
    private String name;
    private int age;
    private String branch;

    public Student(int admNo, String name, int age, String branch) {
        AdmNo = admNo;
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public int getAdmNo() {
        return AdmNo;
    }

    public void setAdmNo(int admNo) {
        AdmNo = admNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
