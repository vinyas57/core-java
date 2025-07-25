//write a program to  identify if the a person is eligible for voting
//person class-name,age-initialize with parametrized constructor
//validateEligibleforVoting(int age)
		
class Person {
	String name;
	int age;
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void validateEligibleforVoting() {
		if(age >= 18){
			System.out.println(name + " "+age +" is eligible to vote.");
		}else{
			System.out.println(name + " "+age +" is NOT eligible to vote.");
		}
	}
	public static void main(String[] args){
		Person person1 = new Person("vinyas",20);
		person1.validateEligibleforVoting();
	
		Person person2 = new Person("vikas",15);
		person2.validateEligibleforVoting();
	}
}
		
			