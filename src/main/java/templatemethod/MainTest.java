package templatemethod;
/**
 * @author shadow
 * @Date 2016��8��12������9:34:26
 * @Fun  ģ�巽��(TemplateMethod)ģʽ����Ϊ��ģʽ��������һϵ�в����ĹǼܣ���ģ���ʵ�֣��ӳٵ�ʵ������������н��С�<br/>
 * 		 ��������ģʽ�ıȽϣ�<br/>
 * 			������ģʽ��ʹ����Ϸ�ʽ����ָ����Directorָ����ϵ�Builder���죬����������Director���ƣ������ģ��<br/>
 * 			������Builderʵ�֡�<br/>
 * 			ģ�巽��ģʽ����ģ�嶨��������̣��������ʵ����ʵ�־����ģ�鷽����<br/>
 * 			���ϣ�������ģʽ�����ģ�巽��ģʽ��<br/>
 **/
public class MainTest {
	public static void main(String[] args) {
		BaseTemplate template = new TemplateMethod();
		template.useTemplateMethod();
		
		System.out.println();
		
		template = new TemplateMethod2();
		template.useTemplateMethod();
	}
}
/**
 *�Ƽ����ͣ�http://blog.csdn.net/hguisu/article/details/7564039
 * */
