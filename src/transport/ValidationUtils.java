package transport;

public class ValidationUtils {
    public static String validOfDefault(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }

    public static int validOfIntDefault(int value, int defaultIntValue) {
        return value >= 0 ? value : defaultIntValue;
    }

    public static float validOfFloatDefault(float value, float defaultIntValue) {
        return (value >= 0 ? value : defaultIntValue);
    }
}

