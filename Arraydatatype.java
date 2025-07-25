//Declare 10 class array with all datatype and print the array values
// Class with all data types
class Arraydatatype {
    int i = 10;
    float f = 5.5f;
    double d = 99.99;
    //boolean b = true;
    char c = 'A';
    byte by = 100;
    short s = 32000;
    long l = 9999999999L;

    // Constructor to initialize with custom values
    Arraydatatype(int val) {
        i +=val;
        f +=val;
        d +=val;
        b =(val%2 == 0);
        c =(char) ('A' + val);
        by += val;
        s +=val;
        l +=val;
    }

    // Method to print all values
    void printValues() {
        System.out.println("int: " + i);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
       // System.out.println("boolean: " + b);
        System.out.println("char: " + c);
        System.out.println("byte: " + by);
        System.out.println("short: " + s);
        System.out.println("long: " + l);
        System.out.println("------------------------------");
}
public static void main(String[] args){
	Arraydatatype[] dataArray = new Arraydatatype[3];
	for (int i = 0;i<dataArray.length;i++){
		dataArray[i] = new Arraydatatype(i);
	}
	for(Arraydatatype data : dataArray){
		data.printValues();
	}
}
}

	
