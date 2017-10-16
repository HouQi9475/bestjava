package generics;

/**
 * ���� ���͵ı����ǣ����������ͣ�Ҳ�������������������ͱ�ָ��Ϊһ������ ʹ�÷��ͣ�����дһ�����ͷ�������������Ȼ����ø÷����Ը������͵����ݽ�������
 * ���ͷ����ڵ���ʱ���ղ�ͬ���͵Ĳ��� ���巺�ͷ����Ĺ������з��ͷ����������и����Ͳ�����������(�ɼ����ŷָ�)
 * ÿһ�����Ͳ����������ְ���һ���������Ͳ������������ö��Ÿ�����һ�����Ͳ�����Ҳ����Ϊһ�����ͱ�����������ָ��һ�������������Ƶı�ʶ����
 * ���Ͳ����ܱ�������������ֵ���ͣ���������Ϊ���ͷ����õ���ʵ�ʲ������͵�ռλ����
 * ���ͷ��������������������һ����ע�����Ͳ���ֻ�ܴ������������ͣ�������ԭʼ���ͣ���int,double,char�ĵȣ���
 * 
 * @author HouQi
 *
 * 
 */
public class genericDemo {
	// ���ͷ���printArray
	public static <E> void printArray(E[] inputArray) {
		// �������Ԫ��
		for (E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// ������ͬ���͵�����
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		System.out.println( "��������Ԫ��Ϊ:" );
        printArray( intArray  ); // ����һ����������
 
        System.out.println( "\n˫����������Ԫ��Ϊ:" );
        printArray( doubleArray ); // ����һ��˫����������
 
        System.out.println( "\n�ַ�������Ԫ��Ϊ:" );
        printArray( charArray ); // ����һ���ַ�������
	}
}
