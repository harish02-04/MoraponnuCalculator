import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> database=new ArrayList<Person>();
        Scanner sc=new Scanner(System.in);
        int ch=1;
        while(ch!=8){
            System.out.println("1.Register 2.AddMother 3.AddFather 4.Addbrother 5.AddSister 6.AddChild 7.FindMoraponnu 8.Exit");
            ch=sc.nextInt();
            if(ch==1){
                System.out.println("Name:");
                String name=sc.next();
                System.out.println("Gender:");
                String gen=sc.next();
                Person p=new Person(name,gen);
                database.add(p);
            }
            else if(ch==2){
                System.out.println("Name:");
                String name=sc.next();
                int f=-1;
                for(Person p:database){
                    if(p.name.equals(name)){
                        System.out.println("MotherName:");
                        String mname=sc.next();
                        p.mother=new Person(mname,"Female");
                        database.add(p.mother);
                        f=1;
                        break;
                    }
                }
                if(f==1){
                    System.out.println("Mother added successfully");
                }
                else{
                    System.out.println("User Not found");
                }
            }

            else if(ch==3){
                System.out.println("Name:");
                String name=sc.next();
                int f=-1;
                for(Person p:database){
                    if(p.name.equals(name)){
                        System.out.println("FatherName:");
                        String fname=sc.next();
                        p.father=new Person(fname,"Male");
                        database.add(p.father);
                        f=1;
                        break;
                    }
                }
                if(f==1){
                    System.out.println("Father added successfully");
                }
                else{
                    System.out.println("User Not found");
                }
            }
            else if(ch==4){
                System.out.println("Name:");
                String name=sc.next();
                int f=-1;
                for(Person p:database){
                    if(p.name.equals(name)){
                        System.out.println("BrotherName:");
                        String bname=sc.next();
                        p.bro.add(new Person(bname,"Male"));
                        database.add(p.bro.get(p.bro.size()-1));
                        f=1;
                        break;
                    }
                }
                if(f==1){
                    System.out.println("Brother added successfully");
                }
                else{
                    System.out.println("User Not found");
                }
            }
            else if(ch==5){
                System.out.println("Name:");
                String name=sc.next();
                int f=-1;
                for(Person p:database){
                    if(p.name.equals(name)){
                        //System.out.println(p.sis);
                        System.out.println("SisterName:");
                        String sname=sc.next();
                        p.sis.add(new Person(sname,"Female"));
                        database.add(p.sis.get(p.sis.size()-1));
                        f=1;
                        break;
                    }
                }
                if(f==1){
                    System.out.println("Sister added successfully");
                }
                else{
                    System.out.println("User Not found");
                }
            }
            else if(ch==7){
                System.out.println("Name:");
                String name=sc.next();
                int f=-1;
                int mp=-1;
                for(Person p:database){
                    if(p.name.equals(name)){
                        int k=1;
                        for(Person m:p.find_moraponnu()){
                            System.out.println("Moraponnu"+k+":"+m.name);
                            k+=1;
                            mp=1;
                        }
                        f=1;
                    }
                }
                if(f==-1){System.out.println("User Not found");}
                else if(mp==-1){

                    System.out.println("Moraponnu not found");
                }
            }
            else if(ch==6){
                System.out.println("Name:");
                String name=sc.next();
                int f=-1;
                for(Person p:database){
                    if(p.name.equals(name)){
                        System.out.println("ChildName:");
                        String cname=sc.next();
                        System.out.println("Gender:");
                        String cgen=sc.next();
                        p.child.add(new Person(cname,cgen));
                        database.add(p.child.get(p.child.size()-1));
                        f=1;
                        break;
                    }
                }
                if(f==1){
                    System.out.println("Child added successfully");
                }
                else{
                    System.out.println("User Not found");
                }
            }
            else{
                break;
            }
            System.out.println("");
            }
            
            
        }
    }

