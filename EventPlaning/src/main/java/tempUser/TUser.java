package tempUser;

public class TUser {
	
	private static String id;
	private static String Type;
	private static String hall;
	private static String menu;
	private static String decoration;
	private static String band;
	private static String date = "2025-4-25";
	private static int participation = 700;
	
	public static String getType() {
		return Type;
	}
	public static void setType(String type) {
		Type = type;
	}
	public static String getHall() {
		return hall;
	}
	public static void setHall(String hall) {
		TUser.hall = hall;
	}
	public static String getMenu() {
		return menu;
	}
	public static void setMenu(String menu) {
		TUser.menu = menu;
	}
	public static String getDecoration() {
		return decoration;
	}
	public static void setDecoration(String decoration) {
		TUser.decoration = decoration;
	}
	public static String getBand() {
		return band;
	}
	public static void setBand(String band) {
		TUser.band = band;
	}
	public static String getDate() {
		return date;
	}
	public static void setDate(String date) {
		TUser.date = date;
	}
	public static int getParticipation() {
		return participation;
	}
	public static void setParticipation(int participation) {
		TUser.participation = participation;
	}
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		TUser.id = id;
	}	
	
}
