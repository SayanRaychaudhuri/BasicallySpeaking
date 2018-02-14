
public class BasicallySpeaking {
	
	public static void main(String arg[]) {
	System.out.println("Decimal Binary Octal Hexadecimal Character");
	for (int i=65;i<=90;i++) {
		System.out.format("%4s%9.5s%6s%8s%11s%n",i,Integer.toString(i,2),Integer.toString(i,8),Integer.toString(i,16),(char)i+"");
			}
		}
		}

