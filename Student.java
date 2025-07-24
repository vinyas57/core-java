class Student{
static float marks;


public static void main(String[] args){
	System.out.println("using for loop");
for(int i=1;i<=100;i++){
 marks=i;

if(marks>90){
System.out.println("A grade"+marks);
}
else if(marks>80){
System.out.println("B grade"+marks);
}
else if(marks>70){
System.out.println("C grade"+marks);
}else{
System.out.println("not passed"+marks);

}
}
System.out.println("using while loop");
int i=1;
while(i<=100){
	marks=i;
	i++;

if(marks>90){
	System.out.println("A grade"+marks);
}
else if(marks>80){
	System.out.println("B grade"+marks);
}
else if(marks>70){
	System.out.println("C grade"+marks);
}else{
	System.out.println("not passed"+marks);
}


}
System.out.println("using do while loop");
i=1;
do{
	marks=i;
	if(marks>90){
	System.out.println("A grade"+marks);
}
else if(marks>80){
	System.out.println("B grade"+marks);
}
else if(marks>70){
	System.out.println("C grade"+marks);
}else{
	System.out.println("not passed"+marks);
}
	i++;
}
while(i<=100);
	
	


}
}