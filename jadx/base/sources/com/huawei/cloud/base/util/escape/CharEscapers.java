package com.huawei.cloud.base.util.escape;

import com.huawei.cloud.base.exception.HttpClientException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes8.dex */
public final class CharEscapers {
    private static final Escaper URI_ESCAPER = new PercentEscaper("-_.*", true);
    private static final Escaper URI_PATH_ESCAPER = new PercentEscaper(PercentEscaper.SAFEPATHCHARS_URLENCODER, false);
    private static final Escaper URI_RESERVED_ESCAPER = new PercentEscaper("-_.!~*'()@:$&,;=+/?", false);
    private static final Escaper URI_USERINFO_ESCAPER = new PercentEscaper("-_.!~*'():$&,;=", false);
    private static final Escaper URI_QUERY_STRING_ESCAPER = new PercentEscaper("-_.!~*'()@:$,;/?:", false);

    private CharEscapers() {
    }

    public static String decodeUri(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new HttpClientException(e);
        }
    }

    public static String escapeUri(String str) {
        return URI_ESCAPER.escape(str);
    }

    public static String escapeUriPath(String str) {
        return URI_PATH_ESCAPER.escape(str);
    }

    public static String escapeUriPathWithoutReserved(String str) {
        return URI_RESERVED_ESCAPER.escape(str);
    }

    public static String escapeUriQuery(String str) {
        return URI_QUERY_STRING_ESCAPER.escape(str);
    }

    public static String escapeUriUserInfo(String str) {
        return URI_USERINFO_ESCAPER.escape(str);
    }
}
