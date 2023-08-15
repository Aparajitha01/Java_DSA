select user_name,user_id from users joins training _details on  users.user_id = training_details.user_id
where  training_date not in (select distinct training_date from training_date) group by user order by training_date ;


class Rectangle{
int len;
int bre;
Rectangle(int len,int bre){
 this.len=len;
  this.bre=bre;
}

int Area(int l,int b){
 int a=l*b;
return a;
}
}
psvm(String args[]){
Rectangle r=new Rectangle();
 sop(r.Area(l1,b1));
 sop(r.Area(l2,b2));
}


int b[]=new int[x.length+Y.length];
for(int i=0;i<x.length;i++){
b[i]=x[i]}

for(int i=0;i<Y.length;i++){
b[i+x.length]=y[i]}}

Arrays.sort(b);

for(int i=0;i<x.length;i++){
x[i]=b[i];}

for(int i=0;i<y.length;i++){
y[i]=b[i+x.length];}

return x;
return y;

public class Main extends threads{
psvm(String args[]){
 Main m = new Main();
 m.Start();
}
m.run(){
System.out.println("Running");
};
}


public class Main implements Runnable{
psvm(String args[]){
 Main m = new Main();
threads t = new thread;
 t.Start();
}
t.run(){
System.out.println("Running");
}
}


