package introduction;

public class Primitives {
	public static void testingPrimitives() {
	//you may need to perform casting in order to ensure that your variables are going to come in as the desired types.
	//In Java their are 8 primitive data types. 
	//Integer, whole numbers to a width of 32 bytes 
	//Max 2^31-1
	//Min -2^31
	int a = 71771;
	System.out.println("Int a is = " + a + ".");
    
    //Shorts are shorter than ints 32 Bytes => 16 bytes; Only useful if memory is a premium.
	//Max = 32767
	//Min = -32768
    short shot = 857;
    System.out.println("short = " + shot + ".");
    
    //a byte is a integer, but it is even shorter 8 bytes
    //Max 127 
    //Min -128
    byte bitter = 100;
    
    System.out.println("the byte a is = " + bitter + ".");
    
    //Longs are Larger than ints, but they are very compatible. When converting types like Shorts or ints, they will
    //be converted by the complier to match their required type. larger than expected ints will become longs.
    //Max 2^63 -1
    //Min -2^63
    
    long john = 99999999999999l;
    
    System.out.println("Long is = " + john + ".");
    
    /*
     * doubles and floats are types that allow a floating decimal point. Double is 64 bytes while float is 32 bytes.
    Doubles take more memory, but are considered to be more efficient. It is best practice to use doubles over floats.
    only use floats if you are key to save memory on the clients system (only older systems should require this.
    */
    double dub = 398080.809809809;
    //adding a "d" at the end of a double helps the system to ensure it counts it as a double.
    double dub2 = 398080.809809809d;
    
    System.out.println("Dub2 (double) a is = " + dub2 + ". The 'd' at the end of the number does not print");
    System.out.println("Dub (double) a is = " + dub + ". There is no difference in terms of results for this instance" +
    "from not having 'd' behind the number");
    
    //java wants this float type to be a double so you must declare at the end of the float "f" for it to remain a float.
    //even Java developers know that it is more efficient to use a double.
    float flow = 9999.9999f;
    float flow2 = 100f;
    
    System.out.println("Float flow is = " + flow + "." 
    +" But it should have been 9999.9999 This number was auto converted to fit into a float"+
    		"because it was declared as a floa. Here is one that hasn't been converted to an int or tranformed " + flow2);
   
    
    //java.math.BigDecimal class should be used for currency
    //doubles are more precise than floats.
    
    
    //booleans are true false and store 
    boolean japa = true;
    boolean foo = false;
    System.out.println("Is it illegal in Japan to drive or operate a bicycle while have ANY alcohol in your system?  " + japa + ".");
    System.out.println("Do I really need to show you a boolean?  " + foo + ".");
    
    //chars are a single character or unicode. Must be in ' not "
    //It uses 16 bytes.
    char unicode = '\u0090';
    char character = 'a';
    
    System.out.println("char character is = " + character + "." + "Char unicode outputs " + unicode + ".");
    
    //8 primitives Int, short, byte, long, double, float, boolean and char.
    // String is another data type. It is a actually an object, but it can be used similar to a primitive.
    //so strings are honorary primitives
    String name = "Robert";
    System.out.println("My name is = " + name + ".");
    //The quotes essentially surround the individual characters. Thus it essentially stores multiple chars and ints that
    //can be extracted, but
    
    

	}
}
