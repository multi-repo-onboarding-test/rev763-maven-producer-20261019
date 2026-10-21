package example;

/** Synthetic token contract used solely by the REV-763 preview tests. */
public final class AccessClient {
    private static final int MIN_TOKEN_LENGTH = 8;

    public boolean isValidToken(String token) {
        if (token == null) {
            return false;
        }
        String normalizedToken = token.trim();
        return normalizedToken.length() >= MIN_TOKEN_LENGTH;
    }
}
