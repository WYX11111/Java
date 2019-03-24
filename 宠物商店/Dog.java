public class Dog implements Pet{
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Dog)){
            return false;
        }
        Dog c = (Dog) obj;
        if(this.name.equals(c.name) && this.age == c.age){
            return true;
        }
        return false;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "狗的名字：" + this.name + ",年龄：" + this.age;
    }
}
