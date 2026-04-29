package _18_Singleton;

// Config 클래스에 싱글톤패턴을 적용시켜 주세요
public class Config {

    private String apiKey;
    private String hostAddress;
    private String mode;

    // 상수
    public static final String DEV_MODE = "DEV";
    public static final String PRODUCTION_MODE = "PRODUCTION";

    // eager loading
    private static Config instance;

    private Config() {
        this.apiKey = "My_KEY";
        this.hostAddress = "127.0.0.1";
        this.mode = DEV_MODE;
    }

    public static Config getInstance() {
        // 지연로딩(lazy Loading)
        if (instance == null) {
            instance = new Config();
        }

        return instance;
    }


    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }
}
