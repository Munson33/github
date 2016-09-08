
public class ArrayExpress{
	public static void main(String args[]){


	char x='A';
	char cars[]={'H','O','L','A'};
	System.out.println(cars);

	//express int y lo imprimen

	int a []={1,2,3,4};
	/*for(int p=0; p<a.length; p++){
		System.out.println("["+a[p]+"]");
	}*/
	for(int num : a ) {
	System.out.println("["+num+"]");

	}

	//express String y lo imprimen

	String g[]={"sala","leon","pollo"};
	/*for(int m=0;m<g.length;m++){
	System.out.println("["+g[m]+"]");}*/
	for(String cad : g ){
	System.out.println("["+cad+"]");
	}

	//express double y lo imprimen

	double v[]={2.30,9.09,69.69,7.54};
	/*for(int j=0;j<v.length;j++){
	System.out.println("["+v[j]+"]");}*/
	for(double dec : v){
		System.out.println("["+dec+"]");
	}
//Hola buenas
}
	}