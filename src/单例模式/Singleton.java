package ����ģʽ;

/*
 * ����ģʽ
 * ��֤Ӧ�ó�����ĳ��ʵ������ֻ��һ��
 * ���ͣ�����ģʽ������ģʽ
 */
public class Singleton {
	// 1.���췽��˽�л����������ⲿֱ�Ӵ�������
	private static Singleton instance = new Singleton();// ����ģʽ������ؼ�����

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}
}
