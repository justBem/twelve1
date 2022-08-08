public class Cat {
    private String name;
    private String color;
    private int weight;
    private int age;
    void setName(String words1){
        name=words1;
    }
    void setColor(String words2){
        color=words2;
    }
    void setWeight(int number1){
        weight=number1;
    }
    void setAge(int number2){
        age=number2;
    }
    String getName(){
        return name;
    }
    String getColor(){
        return color;
    }
    int getWeight(){
        return weight;
    }
    int getAge(){
        return age;
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
        String say3=("...mauuu");
        return say3;
    }
}
