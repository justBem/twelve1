public class Fish {
    private String name2;
    private String color2;
    private int weight2;
    private int age2;
    void setName2(String words1){
        name2=words1;
    }
    void setColor2(String words2){
        color2=words2;
    }
    void setWeight2(int number1){
        weight2=number1;
    }
    void setAge2(int number2){
        age2=number2;
    }
    String getName2(){
        return name2;
    }
    String getColor2(){
        return color2;
    }
    int getWeight2(){
        return weight2;
    }
    int getAge2(){
        return age2;
    }
    public String  eat(){
        String say1=("Eating uuup,uuuup,uuup...");
        return say1;
    }
    public String sleep(){
        String  say2=("Spleeping zzzz-zzz-zz-z...");

        return say2;
    }
    public String  speak(){
        String say3=("...pik-pik-pik");
        return say3;
    }
}
