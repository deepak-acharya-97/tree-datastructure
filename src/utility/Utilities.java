package utility;

public class Utilities {

	public static class Utility {
		public static <T> boolean isNull(T obj) {
			return obj == null;
		}
		public static <T> boolean isNotNull(T obj) {
			return obj != null;
		}
		public static <T> void Print(T message) {
			System.out.print(message);
		}
		public static <T> void PrintLine(T message) {
			System.out.println(message);
		}
	}

}
