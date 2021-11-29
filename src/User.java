public class User {
    public String userName;
    private String userPassword;
    public int age;
    public String email;
    public String hobby;


    public User(String userName, String userPassword, int age, String email, String hobby) {
        // wat doet "this." met de code
        this.userName = userName;
        this. userPassword = userPassword;
        this.age = age;
        this.email = email;
        this.hobby = hobby;
    }

    public String getUserName() {
        return getUserName;
    }

    public void setUserName(String Username) {
        this.userName = userName;
    }

    //public String getUserPassword() {
       // return getUserPassword;

    private void setUserPassword(String password) {
        this.userPassword = userPassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }





}
