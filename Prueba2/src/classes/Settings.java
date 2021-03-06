package classes;

public class Settings {
	public static String currency_config;
	public static String date_config,decimals_config;
	public static boolean dummies;
	
	



	/*public Settings(int date_config, String language_config, char currency_config, int decimals_config) {
		super();
		this.date_config = date_config;// dd/mm/yyyy dd-mm-yyyy
		this.currency_config = currency_config;
		this.decimals_config = decimals_config;
	}*/
	public Settings() {
		super();
		date_config = "dd/mm/yyyy";
		currency_config = "€";
		decimals_config = ".#";
	}
	
	public static String getDate_config() {
		return date_config;
	}
	public static void setDate_config(String date_configs) {
		date_config = date_configs;
	}
	
	public static String getCurrency_config() {
		return currency_config;
	}
	public static void setCurrency_config(String currency_configs) {
		currency_config = currency_configs;
	}
	public static String getDecimals_config() {
		return decimals_config;
	}
	public static void setDecimals_config(String decimals_configs) {
		decimals_config = decimals_configs;
	}
	public static void setDummies(boolean dummies) {
		Settings.dummies = dummies;
	}
	@Override
	public String toString() {
		return "Config [date_config=" + date_config + " currency_config="
				+ currency_config + ", decimals_config=" + decimals_config + "]";
	}
	
}