package com.example.batsukienbuttem;

public class SchoolActivity {
    public static final int GRUOUP_SCHOOL1 = 1;
    public static final int GRUOUP_SCHOOL2 = 2;
    public static final int GRUOUP_SCHOOL3 = 3;


    private long id;
    private String name;
    private String diachi;
    private int groupId;

    public SchoolActivity() {
    }

    public SchoolActivity(long id, String name, String diachi, int groupId) {
        this.id = id;
        this.name = name;
        this.diachi = diachi;
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
