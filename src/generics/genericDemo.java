package generics;

/**
 * 泛型 泛型的本质是：参数化类型，也就是所操作的数据类型被指定为一个参数 使用泛型，可以写一个泛型方法对数组排序，然后调用该方法对各种类型的数据进行排序。
 * 泛型方法在调用时接收不同类型的参数 定义泛型方法的规则：所有泛型方法声明都有个类型参数声明部分(由尖括号分割)
 * 每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
 * 类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
 * 泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。
 * 
 * @author HouQi
 *
 * 
 */
public class genericDemo {
	// 泛型方法printArray
	public static <E> void printArray(E[] inputArray) {
		// 输出数组元素
		for (E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 创建不同类型的数组
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组
 
        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组
 
        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组
	}
}
