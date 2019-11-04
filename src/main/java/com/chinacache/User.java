package com.chinacache;

import java.sql.Date;

public class User {
    private int id;
    private long age;
    private Date inserttime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    @Override public String toString() {
        return "User{" + "id='" + id + "', age='" + age + "', inserttime='" + inserttime.toString() + '}';
    }
}
