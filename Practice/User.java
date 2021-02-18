package Practice;

public class User {
    private String num;
    private String passWord;

    public User(String num, String passWord) {
        this.num = num;
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "用户名=" + num +
                ", 密码='" + passWord + '\'' +
                '}';
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
