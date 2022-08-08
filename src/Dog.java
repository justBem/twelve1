public class Dog {
    private String name1;
    private String color1;
    private int weight1;
    private int age1;
    void setName1(String words1){
        name1=words1;
    }
    void setColor1(String words2){
        color1=words2;
    }
    void setWeight1(int number1){
        weight1=number1;
    }
    void setAge1(int number2){
        age1=number2;
    }
    String getName1(){
        return name1;
    }
    String getColor1(){
        return color1;
    }
    int getWeight1(){
        return weight1;
    }
    int getAge1(){
        return age1;
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
        String say3=("...gav-gav-gav");
        return say3;
    }
}


