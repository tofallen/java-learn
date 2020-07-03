package baselearn.pattern.reflect;

/**
 * @author chenpiqian
 * @date: 2020-07-01
 */
public class ReflectTarget {

	public static void main(String[] args) throws ClassNotFoundException {
		//getClass()获取class对象
		Class<? extends ReflectTarget> aClass = new ReflectTarget().getClass();
		//静态方式获取Class对象
		Class bClass = ReflectTarget.class;
		// Class.forName后去class对象。常用，可以不导入包
		Class<?> cClass = Class.forName("baselearn.pattern.reflect.ReflectTarget");
		System.out.println(aClass == bClass);
		System.out.println(aClass == cClass);
		/**
		 * class对象都相等，在运行期间，一个类只有一个与之对应的class对象产生
		 * 通过类可以查看类中的成员变量，方法，构造函数，就像一面镜子，所以称为反射
		 */
	}

}
