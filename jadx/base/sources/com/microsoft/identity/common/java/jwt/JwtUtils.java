package com.microsoft.identity.common.java.jwt;

import com.google.gson.Gson;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.util.StringUtil;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public final class JwtUtils {
    private static final String TAG = "JwtUtils";

    private JwtUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static String generateJWT(JwtRequestHeader jwtRequestHeader, JwtRequestBody jwtRequestBody) {
        if (jwtRequestHeader == null) {
            throw new NullPointerException("header is marked non-null but is null");
        }
        if (jwtRequestBody == null) {
            throw new NullPointerException("body is marked non-null but is null");
        }
        Logger.verbose(TAG + ":generateJWT", "Generating JWT.");
        String json = new Gson().toJson(jwtRequestHeader);
        String json2 = new Gson().toJson(jwtRequestBody);
        StringBuilder sb = new StringBuilder();
        Charset charset = AuthenticationConstants.ENCODING_UTF8;
        sb.append(StringUtil.encodeUrlSafeString(json.getBytes(charset)));
        sb.append(".");
        sb.append(StringUtil.encodeUrlSafeString(json2.getBytes(charset)));
        return sb.toString();
    }
}
