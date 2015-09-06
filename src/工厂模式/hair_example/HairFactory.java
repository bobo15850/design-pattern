package 工厂模式.hair_example;

/*
 * 工厂
 */
public class HairFactory {
	public HairInterface getHair(String key) {
		if ("left".equals(key)) {
			return new LeftHair();
		} else if ("right".equals(key)) {
			return new RightHair();
		}
		return null;
	}

	public HairInterface getHairByClass(String className) {
		try {
			HairInterface hair = (HairInterface) Class.forName(className).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
