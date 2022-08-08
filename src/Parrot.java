public class Parrot {
    private String name3;
    private String color3;
    private int weight3;
    private int age3;
    void setName3(String words1){
        name3=words1;
    }
    void setColor3(String words2){
        color3=words2;
    }
    void setWeight3(int number1){
        weight3=number1;
    }
    void setAge3(int number2){
        age3=number2;
    }
    String getName3(){
        return name3;
    }
    String getColor3(){
        return color3;
    }
    int getWeight3(){
        return weight3;
    }
    int getAge3(){
        return age3;
    }
    public String  eat(){
        String say1=("Eating nam, nam,nam...");
        return say1;
    }
    public String sleep(){
        String  say2=("Spleeping zzzz-zzz-zz-z...");

        return say2;
    }
    public String  speak(){
        String say3=("...hel-loo, hel-loo");
        return say3;
    }
}
