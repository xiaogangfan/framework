package entity;

/**
 * Created by xiaogangfan on 16/3/28.
 */
public class User {
    private Integer id;
    private String username;
    private Integer userAge;
    private String  userAddress;

    public Integer getId() {
        return id;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}