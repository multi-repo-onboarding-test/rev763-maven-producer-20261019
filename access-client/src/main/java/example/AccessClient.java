package example;

/** Synthetic token contract used solely by the REV-763 preview tests. */
public final class AccessClient {
    public boolean isValidToken(String token) {
        return token != null && token.trim().length() >= 8;
    }
}
