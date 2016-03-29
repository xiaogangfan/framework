package org.andy.shop.model;

/**
 * Created by xiaogangfan on 16/3/29.
 */
public class CourseInfo {
    private Integer course_id;
    private String  cname;
    private String  caddress;

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }
}
