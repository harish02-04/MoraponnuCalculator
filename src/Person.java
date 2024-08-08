import java.util.*;
public class Person {
    String name;
    String Gender;
    Person mother;
    Person father;
    ArrayList<Person> bro;
    ArrayList<Person> sis;
    ArrayList<Person> child;
    Person(String name,String Gender){
        this.name=name;
        this.Gender=Gender;
        bro=new ArrayList<Person>();
        sis=new ArrayList<Person>();
        child=new ArrayList<Person>();
    }
    ArrayList<Person> find_moraponnu(){
        ArrayList<Person> res=new ArrayList<Person>();
        for(Person m:this.mother.bro){
            for(Person d:m.child){
                //System.out.println(d.name);
                if(d.Gender.equals("Female")){
                    res.add(d);
                }
            }
        }
        for(Person m:this.father.sis){
            for(Person d:m.child){
                //System.out.println(d.name);
                if(d.Gender.equals("Female")){
                    res.add(d);
                }
            }
        }

        return res;

    }
}
