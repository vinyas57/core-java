class FootballRunner{
	public static void main(String[] args){
		Football f = new Football();
		f.setProfile("Messi",800,56.2f);
		System.out.println("Name:" + f.getName());
		System.out.println("Runs:" + f.getRuns());
		System.out.println("Avg:" + f.getAvg());
		
		Football f1 = new Football();
		f1.setProfile("Ronaldo",820,48.2f);
		System.out.println("Name:" + f1.getName());
		System.out.println("Runs:" + f1.getRuns());
		System.out.println("Avg:" + f1.getAvg());
		
		Football f2 = new Football();
		f2.setProfile("Mbappe",250,45.2f);
		System.out.println("Name:" + f2.getName());
		System.out.println("Runs:" + f2.getRuns());
		System.out.println("Avg:" + f2.getAvg());
		
		Football f3 = new Football();
		f3.setProfile("Neyamar",450,44.5f);
		System.out.println("Name:" + f3.getName());
		System.out.println("Runs:" + f3.getRuns());
		System.out.println("Avg:" + f3.getAvg());
		
		Football f4 = new Football();
		f4.setProfile("Lewandowski",600,38.2f);
		System.out.println("Name:" + f4.getName());
		System.out.println("Runs:" + f4.getRuns());
		System.out.println("Avg:" + f4.getAvg());
		
		
		Football f5 = new Football("Haaland",150,49.9f);
		System.out.println("Name:" + f5.getName());
		System.out.println("Runs:" + f5.getRuns());
		System.out.println("Avg:" + f5.getAvg());
		
		Football f6 = new Football("vinicius",180,39.7f);
		System.out.println("Name:" + f6.getName());
		System.out.println("Runs:" + f6.getRuns());
		System.out.println("Avg:" + f6.getAvg());
		
		Football f7 = new Football("griezmann",250,40.3f);
		System.out.println("Name:" + f7.getName());
		System.out.println("Runs:" + f7.getRuns());
		System.out.println("Avg:" + f7.getAvg());
		
		Football f8 = new Football("Modric",120,34.9f);
		System.out.println("Name:" + f8.getName());
		System.out.println("Runs:" + f8.getRuns());
		System.out.println("Avg:" + f8.getAvg());
		
		Football f9 = new Football("De Bruyne",160,38.9f);
		System.out.println("Name:" + f9.getName());
		System.out.println("Runs:" + f9.getRuns());
		System.out.println("Avg:" + f9.getAvg());
	}	
}