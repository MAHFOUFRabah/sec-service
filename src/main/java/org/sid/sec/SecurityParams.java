package org.sid.sec;

public interface SecurityParams {

    public static final String HEADER_NAME = "Authorization";
    public static final String SECRET = "ramaBNHY";
    public static final long EXPIRATION = 10 * 24 * 3600 * 1000;
    public static final String HEADER_PREFIX = "Bearer ";
}
